package raisetech.StudentManagement.data;

import lombok.Getter;
import lombok.Setter;

//lombokでgetter,setterの設定をしてくれる。
@Getter
@Setter
public class Student {

  private String id;
  private String name;
  private String kanaName;
  private String nickname;
  private String email;
  private String area;
  private int age;
  private String sex;
  private String remark;
  private boolean isDeleted;

}
