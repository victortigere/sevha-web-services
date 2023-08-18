package com.objectraven.sevha.service;

import com.objectraven.sevha.payload.BaseResult;
import com.objectraven.sevha.payload.SavingProjectPayload;
import org.springframework.http.ResponseEntity;

public interface SavingProjectInterface {
    ResponseEntity<BaseResult> saveProject(SavingProjectPayload project);
    ResponseEntity<BaseResult> getProjects();
    ResponseEntity<BaseResult> getProject(Long id);
    ResponseEntity<BaseResult> editProject(SavingProjectPayload project);
    ResponseEntity<BaseResult> deleteProjects();
}
