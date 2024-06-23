package br.dev.hygino.services;

import org.springframework.stereotype.Service;

import br.dev.hygino.repositories.AuthorRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthorService {
    
    private final AuthorRepository authorRepository;
}
