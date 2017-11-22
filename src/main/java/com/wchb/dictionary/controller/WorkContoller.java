package com.wchb.dictionary.controller;

import com.alibaba.fastjson.JSON;
import com.wchb.dictionary.domain.PageData;
import com.wchb.dictionary.domain.db.WordDb;
import com.wchb.dictionary.domain.HttpResult;
import com.wchb.dictionary.domain.dto.WordDTO;
import com.wchb.dictionary.mapper.WordMapper;
import com.wchb.dictionary.utils.HttpResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping(value = "/word")
public class WorkContoller {

    @Autowired
    private WordMapper wordMapper;

    @PostMapping(value = "/add")
    public HttpResult addWord(@Valid @RequestBody WordDTO word, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return HttpResultUtil.error(400, bindingResult.getFieldError().getDefaultMessage());
        }

        wordMapper.insertWord(convertWordDTO2DbWord(word));

        return HttpResultUtil.success(null);

    }

    @GetMapping(value = "/{userId}")
    public HttpResult getWords(@PathVariable Long userId) {
        List<WordDb> wordDbList = wordMapper.getByUserId(userId);
        return HttpResultUtil.success(new PageData<>(wordDbList.size(), wordDbList));
    }

    private WordDb convertWordDTO2DbWord(WordDTO word) {
        if (Objects.isNull(word)) {
            return null;
        }

        WordDb result = new WordDb();

        result.setUserId(word.getUser_id());

        result.setWord(word.getWord());

        result.setMeaningList(JSON.toJSONString(word.getMeaning_list()));

        return result;
    }
}
