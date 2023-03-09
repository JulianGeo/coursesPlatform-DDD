package com.coursesplatform.enroll.domain.student.events;

import com.coursesplatform.enroll.generic.DomainEvent;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentEnrolled extends DomainEvent {

    private String studentID;
    private String enrollmentID;
    private String studentManagerID;
    private String courseManagerID;
    private String courseID;


    public StudentEnrolled(String studentID, String enrollmentID, String courseManagerID, String courseID) {
        super("enroll.studentEnrolled");
        this.studentID=studentID;
        this.enrollmentID=enrollmentID;
        this.courseManagerID=courseManagerID;
        this.courseID = courseID;
    }
}
