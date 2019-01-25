package kr.co.infomind.report.Domain;


import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Student")
@ToString
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String birthday;

    @Column(name = "student_id", nullable = false)
    private String studentId;

    @Column(nullable = false)
    private String major;

    @Column(name = "admission_date", nullable = false)
    private String admissionDate;

    @Column(name = "graduation_date")
    private String graduationDate;
}
