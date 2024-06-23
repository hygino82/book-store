package br.dev.hygino.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.hygino.models.PublisherModel;

public interface PublisherRepository extends JpaRepository<PublisherModel, UUID> {

}
