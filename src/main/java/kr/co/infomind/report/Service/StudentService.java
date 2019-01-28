package kr.co.infomind.report.Service;


import kr.co.infomind.report.Domain.Product;
import kr.co.infomind.report.Domain.Student;
import kr.co.infomind.report.Repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;


    public List<Map<String, Object>> studentFindAll() {
        List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
        for (Student student : studentRepository.findAll()) {
            Map<String, Object> item = new HashMap<String, Object>();
            item.put("ID", student.getId());
            item.put("NAME", student.getName());
            item.put("BIRTHDAY", student.getBirthday());
            item.put("STUDENT_ID", student.getStudentId());
            item.put("MAJOR", student.getMajor());
            item.put("GRADUATION_DATE", student.getGraduationDate());
            result.add(item);
        }
        return result;
    }

}
