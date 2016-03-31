package org.activiti;
import org.activiti.engine.test.ActivitiRule;
import org.activiti.engine.test.Deployment;
import org.junit.Rule;
import org.junit.Test;

public class MyUnitTest {
	
	@Rule
	public ActivitiRule activitiRule = new ActivitiRule();
	
	@Test
	@Deployment(resources = {"org/activiti/test/serviceProcess.bpmn20.xml"})
	public void test() {
		MainApp mainApp=new MainApp();
		
		mainApp.suspendAction();
	}

}
