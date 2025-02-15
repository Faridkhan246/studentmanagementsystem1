package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystem1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystem1Application.class, args);
	}
     
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		
//		Student student1=new Student("Ramesh","Fadtare","ramesh@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2=new Student("sanjay","jadhav","sanjay@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3=new Student("tony","stark","tonystark@gmail.com");
//		studentRepository.save(student3);
	}

}
