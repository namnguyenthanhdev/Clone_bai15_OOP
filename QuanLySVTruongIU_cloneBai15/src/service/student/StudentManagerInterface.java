package service.student;

import dto.Department;
import dto.student.BaseStudent;
import dto.student.InServiceStudent;
import enumeration.DepartmentType;
import enumeration.SemesterType;
import java.time.Year;
import java.util.List;

public interface StudentManagerInterface {
  boolean isRegularStudent(String studentId);

  BaseStudent addNewStudent(BaseStudent baseStudent);

  float getAverageScoreOfStudentBySemester(String studentId, Year year, SemesterType semesterType);

  int getTotalRegularStudentByDepartment(DepartmentType departmentType);

  List<InServiceStudent> getInServiceStudentListByDepartmentTypeAndInServicePlace(
      DepartmentType departmentType, String inServiceAddress);

  List<BaseStudent> getAverageScoreHigherThanEightInRecentSemesterByDepartmentType(
      DepartmentType departmentType);

  List<BaseStudent> getMaxAverageScoreStudentFromAllSemester(DepartmentType departmentType);

  List<BaseStudent> sortStudentAscendingByScoreAndDescendingByYear(DepartmentType departmentType);

}
