/**
 * generated by Xtext 2.15.0
 */
package mars.ru.des.robot;

import mars.ru.des.robot.TaskDSLStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class TaskDSLStandaloneSetup extends TaskDSLStandaloneSetupGenerated {
  public static void doSetup() {
    new TaskDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
