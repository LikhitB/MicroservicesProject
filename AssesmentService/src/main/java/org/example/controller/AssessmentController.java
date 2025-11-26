package org.example.controller;

import org.example.entity.AssessmentModel;
import org.example.service.AssessmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/assessments")
public class AssessmentController {
    @Autowired
    private AssessmentService assessmentService;

    @GetMapping
    public List<AssessmentModel> getAllAssessments() {
        return assessmentService.getAllAssessments();
    }

    @PostMapping
    public AssessmentModel createAssessment(@RequestBody AssessmentModel assessment) {
        return assessmentService.createAssessment(assessment);
    }

    @GetMapping("/{id}")
    public AssessmentModel getAssessmentById(@PathVariable Long id) {
        return assessmentService.getAssessmentById(id);
    }

    @PutMapping("/{id}")
    public AssessmentModel updateAssessment(@PathVariable Long id, @RequestBody AssessmentModel assessment) {
        return assessmentService.updateAssessment(id, assessment);
    }

    @DeleteMapping("/{id}")
    public void deleteAssessment(@PathVariable Long id) {
        assessmentService.deleteAssessment(id);
    }
}

