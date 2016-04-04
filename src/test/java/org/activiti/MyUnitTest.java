package org.activiti;
import org.activiti.engine.impl.test.JobTestHelper;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.test.ActivitiRule;
import org.activiti.engine.test.Deployment;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MyUnitTest {

	@Rule
	public ActivitiRule activitiRule = new ActivitiRule();

	@Test
	@Deployment(resources = {"org/activiti/test/serviceProcess.bpmn20.xml"})
	public void test() {
		MainApp mainApp=new MainApp();

		mainApp.suspendAction();
	}

	@Test
	@Deployment(resources = {"org/activiti/test/serviceProcess.bpmn20.xml"})
	public void testServiceProcess() throws Exception {
		// Arrange
		ProcessInstance processInstance = this.activitiRule.getRuntimeService().startProcessInstanceByKey("serviceProcess");

		// Act
		JobTestHelper.waitForJobExecutorToProcessAllJobs(this.activitiRule, 10000, 500);

		// Assert
		assertThat("Process instance must be finished.", this.activitiRule.getRuntimeService().createProcessInstanceQuery().active().count(), is(0L));
	}
}
