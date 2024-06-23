package br.dev.hygino.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.hygino.models.BookModel;

public interface BooksRepository extends JpaRepository<BookModel, UUID> {

}
