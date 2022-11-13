package com.freightos.SnackVendingMachine;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.freightos.SnackVendingMachine.machine.MachineInstanceTest;
import com.freightos.SnackVendingMachine.machine.MachineInstanceTest2;

import junit.framework.Test;
import junit.framework.TestSuite;

@RunWith(Suite.class)
@SuiteClasses({MachineInstanceTest.class,MachineInstanceTest2.class})
public class AllTests {
	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTest(MachineInstanceTest.suite());
		//$JUnit-END$
		return suite;
	}

}
