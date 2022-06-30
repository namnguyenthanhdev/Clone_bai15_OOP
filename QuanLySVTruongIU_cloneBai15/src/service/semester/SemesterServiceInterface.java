package service.semester;

import enumeration.SemesterType;
import java.time.Year;
import java.util.Map;
import java.util.Set;

public interface SemesterServiceInterface {
  void checkValidSemester(SemesterType semesterType, Year year);

}
