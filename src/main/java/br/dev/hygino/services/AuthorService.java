package br.dev.hygino.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.dev.hygino.dto.AuthorRecordDTO;
import br.dev.hygino.models.AuthorModel;
import br.dev.hygino.repositories.AuthorRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthorService {

    private final AuthorRepository authorRepository;

    @Transactional
    public AuthorModel save(AuthorRecordDTO dto) {
        AuthorModel author = new AuthorModel();
        dtoToEntity(dto, author);
        return authorRepository.save(author);
    }

    private void dtoToEntity(AuthorRecordDTO dto, AuthorModel author) {
        author.setName(dto.name());
    }

    public List<AuthorModel> findAll() {
        return authorRepository.findAll();
    }
}
