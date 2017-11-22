package com.wchb.dictionary.controller;

import com.wchb.dictionary.constants.WordClassEnum;
import com.wchb.dictionary.domain.HttpResult;
import com.wchb.dictionary.domain.Meaning;
import com.wchb.dictionary.domain.dto.WordDTO;
import com.wchb.dictionary.utils.HttpResultUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/hello")
    HttpResult<WordDTO> getWord() {
        WordDTO word = new WordDTO();
        word.setUser_id(1L);
        word.setWord("good");

        List<Meaning> meaningList = new ArrayList<>();

        meaningList.add(Meaning.newMeaning().wordClass(WordClassEnum.Adjective).chinese("真好").english("good").example("It is good!"));
        meaningList.add(Meaning.newMeaning().wordClass(WordClassEnum.Noun).chinese("商品").english("product").example("It is good!"));
        meaningList.add(Meaning.newMeaning().wordClass(WordClassEnum.Exclamation).chinese("真好!").english("good!").example("It is good!!!!"));

        word.setMeaning_list(meaningList);

        return HttpResultUtil.success(word);
    }

}
