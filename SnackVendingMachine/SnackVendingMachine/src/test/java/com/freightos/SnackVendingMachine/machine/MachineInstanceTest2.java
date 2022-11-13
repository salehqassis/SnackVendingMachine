package com.freightos.SnackVendingMachine.machine;

import static org.junit.Assert.*;

import org.junit.Test;

import com.freightos.SnackVendingMachine.product.Product;

public class MachineInstanceTest2 {

	@Test
	public void test2() {

		MachineInstance m=new MachineInstance();
		Product p=new Product("A1", "lays", 5, 1, 1);
		assertEquals(4.0,m.dispenceItem(p));
	
	}

}
