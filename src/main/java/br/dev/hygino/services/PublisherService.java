package br.dev.hygino.services;

import org.springframework.stereotype.Service;

import br.dev.hygino.repositories.PublisherRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PublisherService {

    private final PublisherRepository publisherRepository;
}
