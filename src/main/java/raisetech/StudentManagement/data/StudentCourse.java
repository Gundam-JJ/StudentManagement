package raisetech.StudentManagement.data;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentCourse {

  /* コースID　*/
  private String id;
  /* 受講生ID　*/
  private String studentId;
  /* コース名　*/
  private String courseName;
  /* 開始日時 */
  private LocalDateTime courseStartAt;
  /* 終了日時 */
  private LocalDateTime courseEndAt;


}
