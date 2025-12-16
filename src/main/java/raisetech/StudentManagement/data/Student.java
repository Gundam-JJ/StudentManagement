package raisetech.StudentManagement.data;

import lombok.Getter;
import lombok.Setter;

//lombokでgetter,setterの設定をしてくれる。
@Getter
@Setter
public class Student {

  /* 受講生ID */
  private String id;
  /* 受講生名 */
  private String name;
  /* 受講生カナ名 */
  private String kanaName;
  /* 受講生ニックネーム */
  private String nickname;
  /* 受講生メール */
  private String email;
  /* 受講生地域　*/
  private String area;
  /* 受講生年齢　*/
  private int age;
  /* 受講生性別　*/
  private String sex;
  /* 備考　*/
  private String remark;
  /* 削除フラグ　*/
  private boolean isDeleted;

}
