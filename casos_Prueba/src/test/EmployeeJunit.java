package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tallerpruebas.Employee;
import tallerpruebas.EmployeeType;

class EmployeeJunit {

	@Test
	void testWorkerImpar() {
		Employee employee1 = new Employee(350f, "USD", 10f, EmployeeType.Worker);
		assertEquals(350f+ (386f/12) * 2, employee1.cs());
	}
	
	@Test
	void testSupervisorImpar() {
		Employee employee2 = new Employee(350f, "USD", 10f, EmployeeType.Supervisor);
		assertEquals(353.5f + (386f/12) * 2, employee2.cs());
	}
	
	@Test
	void testManagerImpar() {
		Employee employee3 = new Employee(350f, "USD", 10f, EmployeeType.Manager);
		assertEquals(357f + (386f/12) * 2, employee3.cs());
	}
	
	@Test
	void testNotUSD() {
		Employee employee1 = new Employee(350f, "PRE", 10f, EmployeeType.Worker);
		assertEquals(332.5f + (386f/12) * 2, employee1.cs());
	}
}
