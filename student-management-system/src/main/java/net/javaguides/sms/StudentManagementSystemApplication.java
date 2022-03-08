package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Student s1=new Student("Rahul","Choudahry","rahulchoudharyjaat79@gmail.com");
//		Student s2=new Student("Omansh","Kalra","omanshkalracs18@gmail.com");
//		Student s3=new Student("Gagan","Joshi","joshigagan4@gmail.com");
//		studentRepository.save(s1);
//		studentRepository.save(s2);
//		studentRepository.save(s3);
	
	}

}
