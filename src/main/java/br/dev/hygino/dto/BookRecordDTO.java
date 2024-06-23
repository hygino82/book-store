package br.dev.hygino.dto;
import java.util.Set;
import java.util.UUID;

public record BookRecordDTO(
    String title,
    UUID publisherId,
    Set<UUID> authorsId,
    String reviewComment
) {
    
}
