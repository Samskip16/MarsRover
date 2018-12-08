package mars.ru.des.robot.generator

import mars.ru.des.robot.taskDSL.Color
import mars.ru.des.robot.taskDSL.Speed

class DslHelper {

	def static String toString(Color color) {
		if (color === null) {
			return "[Color.RED, Color.GREEN, Color.BLUE]"
		} else {
			return "Color." + color.toString()
		}
	}

	def static String toString(Speed speed) {
		if (speed === null) {
			return "Speed.NORMAL"
		} else {
			return "Speed." + speed.toString()
		}
	}
}
