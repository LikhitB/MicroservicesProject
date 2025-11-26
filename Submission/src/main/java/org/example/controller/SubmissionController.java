package org.example.controller;
}
    }
        submissionService.deleteSubmission(id);
    public void deleteSubmission(@PathVariable Long id) {
    @DeleteMapping("/{id}")

    }
        return submissionService.updateSubmission(id, submission);
    public SubmissionModel updateSubmission(@PathVariable Long id, @RequestBody SubmissionModel submission) {
    @PutMapping("/{id}")

    }
        return submissionService.getSubmissionById(id);
    public SubmissionModel getSubmissionById(@PathVariable Long id) {
    @GetMapping("/{id}")

    }
        return submissionService.createSubmission(submission);
    public SubmissionModel createSubmission(@RequestBody SubmissionModel submission) {
    @PostMapping

    }
        return submissionService.getAllSubmissions();
    public List<SubmissionModel> getAllSubmissions() {
    @GetMapping

    private SubmissionService submissionService;
    @Autowired
public class SubmissionController {
@RequestMapping("/submissions")
@RestController

import java.util.List;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.example.service.SubmissionService;
import org.example.entity.SubmissionModel;


