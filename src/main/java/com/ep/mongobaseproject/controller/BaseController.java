package com.ep.mongobaseproject.controller;

import com.ep.mongobaseproject.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/base")
public class BaseController {

    @Autowired
    BaseService service;

    @GetMapping()
    public ResponseEntity getBase() {
        service.getBaseData();
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PostMapping
    public ResponseEntity createBase(
            @RequestParam String data
    ) {
        service.createBaseData(data);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
