package com.ep.mongobaseproject.service;

import com.ep.mongobaseproject.model.Base;
import com.ep.mongobaseproject.repository.BaseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BaseService {

    @Autowired
    BaseRepository repository;

    public void getBaseData() {
        log.info("Getting base data...");
        List<Base> base = repository.findAll();
        base.forEach(b -> log.info(b.toString()));
    }

    public void createBaseData(String data) {
        repository.save(new Base(data));
        log.info("Base data created!");
    }
}
