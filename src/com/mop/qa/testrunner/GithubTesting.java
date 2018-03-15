package com.mop.qa.testrunner;

public class GithubTesting {

	public static void main(String[] args) {
		
		Environemnt.environmentName = System.getProperty("environment");
		System.out.println(Environemnt.environmentName);
	}

}
