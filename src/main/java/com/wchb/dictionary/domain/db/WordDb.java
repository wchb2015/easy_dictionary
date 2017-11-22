package com.wchb.dictionary.domain.db;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Data
public class WordDb {

    private Long id;

    @NotNull(message = "userId should not be null")
    private Long userId;

    @NotBlank(message = "word should not be blank!")
    private String word;

    @NotBlank(message = "meaningList should not be blank!")
    private String meaningList;

    @JsonIgnore
    private Timestamp createdAt;

    @JsonIgnore
    private Timestamp updatedAt;

}
