package com.freightos.SnackVendingMachine.machine;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import com.freightos.SnackVendingMachine.product.Product;

public class MachineInstanceTest {

	@Test
	public void test1() {
		MachineInstance m=new MachineInstance();
		Product p=new Product("A1", "lays", 5, 1, 1);
		assertEquals(4.0,m.dispenceItem(p));
		
	}
	


}
