package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.Test;

import tallerpruebas.Employee;
import tallerpruebas.EmployeeType;

class EmployeeJunit {

	@Test
	void testWorkerImpar() {
		Employee employee1 = new Employee(350f, "USD", 10f, EmployeeType.Worker);
		assertEquals(414.44f, employee1.cs(LocalDate.of(2022, Month.JANUARY, 17)), 2);
	}
	
	@Test
	void testSupervisorImpar() {
		Employee employee2 = new Employee(350f, "USD", 10f, EmployeeType.Supervisor);
		assertEquals(417.83f, employee2.cs(LocalDate.of(2022, Month.JANUARY, 17)), 2);
	}
	
	@Test
	void testManagerImpar() {
		Employee employee3 = new Employee(350f, "USD", 10f, EmployeeType.Manager);
		assertEquals(421.33f, employee3.cs(LocalDate.of(2022, Month.JANUARY, 17)), 2);
	}
	
	@Test
	void testNotUSD() {
		Employee employee1 = new Employee(350f, "PRE", 10f, EmployeeType.Worker);
		assertEquals(396.83F, employee1.cs(LocalDate.of(2022, Month.JANUARY, 17)), 2);
	}
	
	@Test
	void testWorkerPar() {
		Employee employee1 = new Employee(350f, "USD", 10f, EmployeeType.Worker);
		assertEquals(350f, employee1.cs(LocalDate.of(2022, Month.FEBRUARY, 17)), 2);
	}
	
	@Test
	void testSupervisorPar() {
		Employee employee2 = new Employee(350f, "USD", 10f, EmployeeType.Supervisor);
		assertEquals(353.5f, employee2.cs(LocalDate.of(2022, Month.FEBRUARY, 17)), 2);
	}
	
	@Test
	void testManagerPar() {
		Employee employee3 = new Employee(350f, "USD", 10f, EmployeeType.Manager);
		assertEquals(357f, employee3.cs(LocalDate.of(2022, Month.FEBRUARY, 17)), 2);
	}
	
	@Test
	void testWorkerCalculateYearBonus() {
		Employee employee1 = new Employee(350f, "USD", 10f, EmployeeType.Worker);
		assertEquals(386f, employee1.CalculateYearBonus());
	}
	
	@Test
	void testSupervisorCalculateYearBonus() {
		Employee employee2 = new Employee(350f, "USD", 10f, EmployeeType.Supervisor);
		assertEquals(543, employee2.CalculateYearBonus());
	}
	
	@Test
	void testManagerCalculateYearBonus() {
		Employee employee3 = new Employee(350f, "USD", 10f, EmployeeType.Manager);
		assertEquals(736, employee3.CalculateYearBonus());
	}
	
	@Test
	void testNotUSDCalculateYearBonus() {
		Employee employee2 = new Employee(350f, "PRE", 10f, EmployeeType.Supervisor);
		assertEquals(525.5f, employee2.CalculateYearBonus(), 1);
	}
}
