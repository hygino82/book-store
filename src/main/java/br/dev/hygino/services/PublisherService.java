package br.dev.hygino.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.dev.hygino.dto.PublisherRecordDTO;
import br.dev.hygino.models.PublisherModel;
import br.dev.hygino.repositories.PublisherRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PublisherService {

    private final PublisherRepository PublisherRepository;

    @Transactional
    public PublisherModel save(PublisherRecordDTO dto) {
        PublisherModel Publisher = new PublisherModel();
        dtoToEntity(dto, Publisher);
        return PublisherRepository.save(Publisher);
    }

    private void dtoToEntity(PublisherRecordDTO dto, PublisherModel Publisher) {
        Publisher.setName(dto.name());
    }

    public List<PublisherModel> findAll() {
        return PublisherRepository.findAll();
    }
}
