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

  /*
  @Autowired
  private StudentRepository repository;
   */

  /*private String name = "Johoji Jonosuke";
  private String age = "25";*/

  //localhost:8080
	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}


  /*
  @GetMapping("/studentList")
  public List<Student> getStudentList() {
    return repository.search();
  }

  @GetMapping("/studentsCourses")
  public List<StudentsCourses> getStudentsCoursesList(){
    return repository.searchStudentsCourses();
  }
   */


  //ターミナルコマンド上で「curl "http://localhost:8080/student?name=指定の名前" 」でとりだせるようになる。
  /*
@GetMapping("/student")
  public String getStudent(@RequestParam String name){
   */


    /*Student student = new Student();
    student setName("Johoji Jonosuke");
    String name = student.getName();*/


  /*
  Student student = (Student) repository.searchByName(name);
  return student.getName() + " " + student.getAge() + "歳";
*/


//Get Post
//GETは取得、リクエストの結果を受け取る
//POSTは情報を与える、渡す

  /*
@PostMapping("/student")//登録
  public void registerStudent(String name,int age){
    repository.registerStudent(name, age);
}

@PatchMapping("/student")//更新
  public void updateStudentName(String name, int age){
    repository.updateStudent(name, age);
}

@DeleteMapping("/student")//削除
  public void deleteStudent(String name){
    repository.deleteStudent(name);
}
   */
}
