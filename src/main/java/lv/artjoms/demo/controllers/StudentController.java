package lv.artjoms.demo.controllers;

import lv.artjoms.demo.domain.requests.StudentRequest;
import lv.artjoms.demo.domain.responses.StudentResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    @PostMapping("")
    @CrossOrigin
    public StudentResponse addStudent(@RequestParam(value = "likesCourse") Boolean likesCourse,
                                      @RequestBody StudentRequest student) {


        StudentResponse createdStudent = new StudentResponse();
        createdStudent.setName(student.getName());
        createdStudent.setKnowledgeLevel(student.getKnowledgeLevel());
        createdStudent.setLikesCourse(likesCourse);

        return createdStudent;

    }

}
