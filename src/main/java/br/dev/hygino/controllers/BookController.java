package br.dev.hygino.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dev.hygino.dto.BookRecordDTO;
import br.dev.hygino.models.BookModel;
import br.dev.hygino.services.BookService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("book")
@RequiredArgsConstructor
public class BookController {
    private final BookService service;

    @PostMapping
    public ResponseEntity<BookModel> save(@RequestBody BookRecordDTO dto) {
        return ResponseEntity.status(201).body(service.saveBook(dto));
    }
}
