package com.wchb.dictionary.domain.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.wchb.dictionary.domain.Meaning;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@JsonPropertyOrder(value = {"user_id", "word", "meaning_list"})
public class WordDTO {

    @NotNull(message = "userId should not be null.")
    private Long user_id;

    @NotEmpty(message = "meaningList should not be empty.")
    private List<Meaning> meaning_list;

    @NotBlank(message = "word should not be blank.")
    private String word;

}
