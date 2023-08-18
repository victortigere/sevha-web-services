package com.objectraven.sevha.service.impl;

import com.objectraven.sevha.model.SavingProject;
import com.objectraven.sevha.payload.BaseResult;
import com.objectraven.sevha.payload.SavingProjectPayload;
import com.objectraven.sevha.repository.SavingProjectRepository;
import com.objectraven.sevha.service.SavingProjectInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SavingProjectInterfaceImpl implements SavingProjectInterface {

    private final SavingProjectRepository savingProjectRepository;

    @Override
    public ResponseEntity<BaseResult> saveProject(SavingProjectPayload project) {
        SavingProject savingProject = SavingProject
                .builder()
                .currentSaving(project.getCurrentSaving())
                .description(project.getDescription())
                .target(project.getTarget())
                .targetDate(project.getTargetDate())
                .currency(project.getCurrency())
                .build();
        savingProjectRepository.save(savingProject);
        return ResponseEntity.ok(new BaseResult("00", "Project Saved Successfully", 200));
    }

    @Override
    public ResponseEntity<BaseResult> getProjects() {
        return null;
    }

    @Override
    public ResponseEntity<BaseResult> getProject(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<BaseResult> editProject(SavingProjectPayload project) {
        return null;
    }

    @Override
    public ResponseEntity<BaseResult> deleteProjects() {
        return null;
    }
}
