package kr.co.infomind.report.Repository;

import kr.co.infomind.report.Domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
