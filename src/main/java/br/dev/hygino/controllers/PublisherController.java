package br.dev.hygino.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dev.hygino.dto.PublisherRecordDTO;
import br.dev.hygino.models.PublisherModel;
import br.dev.hygino.services.PublisherService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/publisher")
@RequiredArgsConstructor
public class PublisherController {
    private final PublisherService service;

    @PostMapping
    public ResponseEntity<PublisherModel> save(@RequestBody PublisherRecordDTO dto) {
        return ResponseEntity.status(201).body(service.save(dto));
    }

    @GetMapping
    public ResponseEntity<List<PublisherModel>> findAll() {
        return ResponseEntity.status(200).body(service.findAll());
    }
}
