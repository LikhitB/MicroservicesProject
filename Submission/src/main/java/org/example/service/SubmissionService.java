package org.example.service;

import org.example.entity.SubmissionModel;
import org.example.repository.SubmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class SubmissionService {
    @Autowired
    private SubmissionRepository submissionRepository;

    public List<SubmissionModel> getAllSubmissions() {
        return submissionRepository.findAll();
    }

    public SubmissionModel createSubmission(SubmissionModel submission) {
        return submissionRepository.save(submission);
    }

    public SubmissionModel getSubmissionById(Long id) {
        Optional<SubmissionModel> submission = submissionRepository.findById(id);
        return submission.orElse(null);
    }

    public SubmissionModel updateSubmission(Long id, SubmissionModel updatedSubmission) {
        if (submissionRepository.existsById(id)) {
            updatedSubmission.setSubmissionId(id);
            return submissionRepository.save(updatedSubmission);
        }
        return null;
    }

    public void deleteSubmission(Long id) {
        submissionRepository.deleteById(id);
    }
}

