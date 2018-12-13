package mars.ru.des.robot.generator

import mars.ru.des.robot.taskDSL.Color
import mars.ru.des.robot.taskDSL.Speed
import mars.ru.des.robot.taskDSL.Task

class DslHelper {

	def static String toString(Color color) {
		if (color === null) {
			return "[Color.RED, Color.GREEN, Color.BLUE]"
		} else {
			return "[Color." + color.toString() + "]"
		}
	}

	def static String toString(Speed speed) {
		if (speed === null) {
			return "Speed.NORMAL"
		} else {
			return "Speed." + speed.toString()
		}
	}

	def static String toName(Task task) {
		return "task_" + task.getName()
	}
}
