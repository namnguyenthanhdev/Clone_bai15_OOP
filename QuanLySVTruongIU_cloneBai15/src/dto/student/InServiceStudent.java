package dto.student;

import com.google.gson.Gson;
import dto.SemesterResult;
import enumeration.DepartmentType;

import java.time.Year;
import java.util.List;


public class InServiceStudent extends BaseStudent {

  private String inServicePlaceId;


  public InServiceStudent(InServiceStudent student) {
    super(student.getId(), student.getEntryScore(), student.getSemesterResults(), student.getDepartmentType(),
        student.getEntryYear());
    setInServicePlaceId(student.getInServicePlaceId());
  }

  public InServiceStudent(String id, float entryScore, List<SemesterResult> semesterResults, Year entryYear,
      DepartmentType departmentType, String inServicePlaceId) {
    super(id, entryScore, semesterResults, departmentType, entryYear);
    setInServicePlaceId(inServicePlaceId);
  }


  public static InServiceStudent createNewStudent(InServiceStudent student) {
    student.setId(generateNewStudentId());
    return new InServiceStudent(student);
  }


  public String getInServicePlaceId() {
    return inServicePlaceId;
  }

  public void setInServicePlaceId(String inServicePlaceId) {
    this.inServicePlaceId = inServicePlaceId;
  }

  @Override
  public String toString() {
    return "InService{" +
        "id='" + this.getId() + '\'' +
        ", entryScore=" + this.getEntryScore() +
        ", results=" + new Gson().toJson(this.getSemesterResults()) +
        ", education=" + this.inServicePlaceId +
        '}';
  }


}
