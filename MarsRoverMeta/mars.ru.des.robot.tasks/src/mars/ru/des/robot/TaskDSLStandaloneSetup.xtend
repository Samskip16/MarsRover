/*
 * generated by Xtext 2.15.0
 */
package mars.ru.des.robot


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class TaskDSLStandaloneSetup extends TaskDSLStandaloneSetupGenerated {

	def static void doSetup() {
		new TaskDSLStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}