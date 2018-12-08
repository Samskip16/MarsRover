package mars.ru.des.robot.generator

import java.util.List
import mars.ru.des.robot.taskDSL.Avoid
import mars.ru.des.robot.taskDSL.DriveAction
import mars.ru.des.robot.taskDSL.DriveUntil
import mars.ru.des.robot.taskDSL.Investigate
import mars.ru.des.robot.taskDSL.Mission
import mars.ru.des.robot.taskDSL.MoveBack
import mars.ru.des.robot.taskDSL.Object
import mars.ru.des.robot.taskDSL.Speak
import mars.ru.des.robot.taskDSL.Task
import mars.ru.des.robot.taskDSL.Turn

class Brick1Generator {

	def static generate(Mission mission) '''
		#!/usr/bin/env python3
		from src.bluetooth.bluethooth import Bluetooth
		
		
		def run():
		    for t in tasks:
		        t.execute()
		
		tasks = []
		�FOR task : mission.getTasks()�
			�generateAction(task)�
		�ENDFOR�
		
		print("Starting brick 1")
		print("Connecting as Client...")
		
		b = Bluetooth()
		b.connect_as_client()
		
		run()
	'''

	def generateTask(Task task) '''
		Task t1 = Task()
		t1.set_action(�generateAction(task.getAction())�)
		
		�FOR av : task.getDetector().getAvoiders()�
			t1.add_avoider(�generateAction(av)�)
		�ENDFOR�
	'''

	def dispatch static generateAction(DriveUntil action) '''
		�IF action.getObject() === Object.LAKE�
			ColorFinder(�DslHelper.toString(action.getColor())�, �DslHelper.toString(action.getSpeed())�)
		�ELSEIF action.getObject() === Object.ROCK�
			RockFinder(�DslHelper.toString(action.getColor())�, �DslHelper.toString(action.getSpeed())�)
		�ENDIF�
	'''

	def dispatch static generateAction(Investigate action) '''
		Investigator(�DslHelper.toString(action.getSpeed())�)
	'''

	def dispatch static generateAction(Speak action) '''
		Speaker("�action.getText()�")
	'''

	def static generateAvoider(Avoid avoid) '''
		�IF avoid.getObject() === Object.LAKE�
			ColorAvoider(�DslHelper.toString(avoid.getColor())�, �DslHelper.toString(action.getSpeed())�)
		�ELSEIF avoid.getObject() === Object.ROCK�
			RockAvoider(�toString(avoid.getAvoidActions())�)
		�ENDIF�
	'''
	
	def static toString(List<DriveAction> driveActions) '''
		�FOR action : driveActions BEFORE "[" SEPARATOR "," AFTER "]"�
			�driveActionToString(action)�
		�ENDFOR�
	'''

	def static String driveActionToString(MoveBack action) {
		return "DriveAction(Speed.NORMAL," + action.getDistance() + ", 0)"
	}

	def static String driveActionToString(Turn action) {
		return "DriveAction(Speed.NORMAL, 0," + action.getDegrees() + ")"
	}

}
