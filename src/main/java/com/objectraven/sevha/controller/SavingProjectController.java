package com.objectraven.sevha.controller;

import com.objectraven.sevha.payload.BaseResult;
import com.objectraven.sevha.payload.SavingProjectPayload;
import com.objectraven.sevha.service.SavingProjectInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/projects/")
public class SavingProjectController {

    private final SavingProjectInterface savingProjectInterface;

    @PostMapping("save")
    ResponseEntity<BaseResult> saveProject(@RequestBody SavingProjectPayload payload){
        return savingProjectInterface.saveProject(payload);
    }
}
