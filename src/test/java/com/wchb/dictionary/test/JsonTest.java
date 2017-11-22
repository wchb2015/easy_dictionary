package com.wchb.dictionary.test;

import com.alibaba.fastjson.JSON;
import com.wchb.dictionary.constants.WordClassEnum;
import com.wchb.dictionary.domain.Meaning;
import com.wchb.dictionary.domain.dto.WordDTO;
import com.wchb.dictionary.utils.HttpResultUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class JsonTest {

    @Test
    public void testBuild() {
        Meaning meaning = Meaning.newMeaning().wordClass(WordClassEnum.Adjective).chinese("真好").english("good").example("It is good!");
        System.out.println(meaning);
    }

    @Test
    public void testJson2Obj() {
//        System.out.println(array.size());
    }

    @Test
    public void testObj2Json() {
        WordDTO word = new WordDTO();
        word.setUser_id(1L);

        List<Meaning> meaningList = new ArrayList<>();

        meaningList.add(Meaning.newMeaning().wordClass(WordClassEnum.Adjective).chinese("真好").english("good").example("It is good!"));
        meaningList.add(Meaning.newMeaning().wordClass(WordClassEnum.Noun).chinese("商品").english("product").example("It is good!"));
        meaningList.add(Meaning.newMeaning().wordClass(WordClassEnum.Exclamation).chinese("真好!").english("good!").example("It is good!!!!"));

        word.setMeaning_list(meaningList);

        System.out.println(JSON.toJSON(word));
        System.out.println(JSON.toJSON(HttpResultUtil.success(word)));
    }

    @Test
    public void test() {
        JSON.toJSONString(null);
    }

    @Test
    public void testEnum() {
        System.out.println(WordClassEnum.Noun.name());
        System.out.println(WordClassEnum.Noun.getAbbreviation());
        System.out.println(WordClassEnum.Noun.getCnName());
        System.out.println(WordClassEnum.Noun.getCode());
    }
}
