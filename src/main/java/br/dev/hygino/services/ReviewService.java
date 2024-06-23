package br.dev.hygino.services;

import org.springframework.stereotype.Service;

import br.dev.hygino.repositories.ReviewRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReviewService {
    
    private final ReviewRepository reviewRepository;
}
