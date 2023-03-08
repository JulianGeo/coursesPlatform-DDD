package com.coursesplatform.enroll.domain.student.commands;

import com.coursesplatform.enroll.generic.Command;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RegisterStudentCommand extends Command {

    private String studentManagerID;
    private String studentID;
    private String name;
    private String personalID;
    private String email;
    private String phone;
    private String user;
    private String password;
    private String planID;
    private String planName;

}