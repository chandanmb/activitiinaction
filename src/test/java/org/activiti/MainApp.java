package org.activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;

public class MainApp  {

	public static ProcessEngine processEngine;
	public static RepositoryService repositoryService;
	public static RuntimeService runtimeService;
	public static ProcessInstance processInstance;
	
	
	public static void main(String[] args) {
		
	}
	
	public void suspendAction(){
		try {

			processEngine = ProcessEngines.getDefaultProcessEngine();


			runtimeService = processEngine.getRuntimeService();

			processInstance = runtimeService.startProcessInstanceByKey("serviceProcess");
		

			System.out.println("--------------process instance-------------- : ");
			String procDefId = processInstance.getProcessDefinitionId();
			System.out.println("ProcessDefinitionId : " + procDefId);
			String ProcInstanceId = processInstance.getProcessInstanceId();
			System.out.println("Process Instance ID :::::::::::::::" + ProcInstanceId);
			
			
		

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
