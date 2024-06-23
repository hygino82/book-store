package br.dev.hygino.dto;

import jakarta.validation.constraints.NotBlank;

public record PublisherRecordDTO(@NotBlank String name) {

}
