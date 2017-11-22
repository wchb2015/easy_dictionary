package com.wchb.dictionary.mapper;

import com.wchb.dictionary.domain.db.WordDb;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WordMapper {

    void insertWord(WordDb word);

    List<WordDb> getByUserId(@Param("userId") Long userId);
}
