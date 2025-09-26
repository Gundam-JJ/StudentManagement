package raisetech.StudentManagement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import raisetech.StudentManagement.data.Student;
import raisetech.StudentManagement.data.StudentsCourses;
import raisetech.StudentManagement.repository.StudentRepository;

@SpringBootApplication

public class StudentManagementApplication {


  //localhost:8080
	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}


  //ターミナルコマンド上で「curl "http://localhost:8080/student?name=指定の名前" 」でとりだせるようになる。

//Get Post
//GETは取得、リクエストの結果を受け取る
//POSTは情報を与える、渡す

}
