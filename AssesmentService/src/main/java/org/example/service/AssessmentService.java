package org.example.service;

import org.example.entity.AssessmentModel;
import org.example.repository.AssessmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AssessmentService {
    @Autowired
    private AssessmentRepository assessmentRepository;

    public List<AssessmentModel> getAllAssessments() {
        return assessmentRepository.findAll();
    }

    public AssessmentModel createAssessment(AssessmentModel assessment) {
        return assessmentRepository.save(assessment);
    }

    public AssessmentModel getAssessmentById(Long id) {
        Optional<AssessmentModel> assessment = assessmentRepository.findById(id);
        return assessment.orElse(null);
    }

    public AssessmentModel updateAssessment(Long id, AssessmentModel updatedAssessment) {
        if (assessmentRepository.existsById(id)) {
            updatedAssessment.setAssessmentId(id);
            return assessmentRepository.save(updatedAssessment);
        }
        return null;
    }

    public void deleteAssessment(Long id) {
        assessmentRepository.deleteById(id);
    }
}

