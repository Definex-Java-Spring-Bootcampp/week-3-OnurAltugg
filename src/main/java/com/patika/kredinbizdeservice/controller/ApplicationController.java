package com.patika.kredinbizdeservice.controller;

import com.patika.kredinbizdeservice.dto.request.ApplicationRequest;
import com.patika.kredinbizdeservice.model.Application;
import com.patika.kredinbizdeservice.service.ApplicationService;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/applications")
@RequiredArgsConstructor
public class ApplicationController {

    private final ApplicationService applicationService;

    @PostMapping("/akbank")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Application> createAkbankApplication(@RequestBody ApplicationRequest request) {
        return ResponseEntity.ok().body(applicationService.createAkbankApplication(request));
    }
    
    @PostMapping("/garanti")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Application> createGarantiApplication(@RequestBody ApplicationRequest request) {
        return ResponseEntity.ok().body(applicationService.createGarantiApplication(request));
    }

}
