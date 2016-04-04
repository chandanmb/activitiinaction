package org.activiti;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

public class Task2 implements JavaDelegate {

	public void execute(DelegateExecution delegate) throws Exception {
		for(int i=0;i<10;i++){
			System.out.println("Task 2 ::::::::ETC Honeywell");
			//read.sleep(100);
		}

	}

}
