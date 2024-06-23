package br.dev.hygino.repositories;

import java.util.UUID;
import java.util.Optional;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.dev.hygino.models.BookModel;

public interface BookRepository extends JpaRepository<BookModel, UUID> {

    Optional<BookModel> findBookModelByTitle(String title);

    @Query(value = "select * from tb_book where publisher_id = :id", nativeQuery = true)
    List<BookModel> findBookModelByPublisherId(@Param("id") UUID id);
}
