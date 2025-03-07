package com.prog.sampletestprograms;

import com.prog.entity.AdditionOfDIgitFromString;
import com.prog.entity.Address;
import com.prog.entity.Employee;
import com.prog.entity.MyReverseString;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@SpringBootApplication
public class SampleTestProgramsApplication {

	public static void main(String[] args) {
		Employee e1 = new Employee(11,"Ajay",new Address("street1","Pune"));
		Employee e2 = new Employee(1,"Baiju",new Address("street12","Nagar"));
		Employee e3 = new Employee(17,"Raju",new Address("street23","Nashik"));
		Employee e4 = new Employee(4,"Jay",new Address("street10","Dhule"));
		Employee e5 = new Employee(29,"Ganesh",new Address("street43","Mumbai"));
		List<Employee> emplist= Arrays.asList(e1,e2,e3,e4,e5);
		System.out.println("Sort Emloyee- Ascending by ID_______________________");
		emplist.stream().sorted(Comparator.comparingInt(emp-> emp.getId())).forEach(System.out::println);
		System.out.println("Sort Emloyee- Descending by ID_______________________");
		emplist.stream().sorted((ex,ex2)->Integer.compare(ex2.getId(),ex.getId())).forEach(System.out::println);
		System.out.println("____________________________________________________");
		System.out.println("filter Emloyee whos name start with A_______________________");
		emplist.stream().filter(employee -> employee.getName().startsWith("A")).forEach(System.out::println);

		SpringApplication.run(SampleTestProgramsApplication.class, args);
		System.out.println("Adding numbers only from string_____________________________________");
		System.out.println("12adof35tugof23="+AdditionOfDIgitFromString.addNumbersOnly("12adof35tugof23"));
		System.out.println("Reverese string_____________________________________");
		System.out.println("xxCBAyy="+ MyReverseString.myReverseString("xxCBAyy"));

	}

}
