package br.dev.hygino.dto;

import jakarta.validation.constraints.NotBlank;

public record AuthorRecordDTO(@NotBlank String name) {

}
