package com.wchb.dictionary.mapper;

import com.wchb.dictionary.domain.db.WordDb;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WordMapperTest {

    @Autowired
    private WordMapper wordMapper;

    @Test
    public void testGetById() {
        wordMapper.getByUserId(1L);
    }

    @Test
    public void insertWord() throws Exception {

        WordDb word = new WordDb();
        word.setUserId(1L);
        word.setWord("good");
        word.setMeaningList("{\n" +
                "    \"user_id\":11,\n" +
                "    \"meaning_list\":[\n" +
                "        {\n" +
                "            \"wordClass\":\"Adjective\",\n" +
                "            \"english\":\"good\",\n" +
                "            \"chinese\":\"真好\",\n" +
                "            \"example\":\"It is good!\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"wordClass\":\"Adjective\",\n" +
                "            \"english\":\"good\",\n" +
                "            \"chinese\":\"真好\",\n" +
                "            \"example\":\"It is good!\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"wordClass\":\"Adjective\",\n" +
                "            \"english\":\"good\",\n" +
                "            \"chinese\":\"真好\",\n" +
                "            \"example\":\"It is good!\"\n" +
                "        }\n" +
                "    ]\n" +
                "}");

        wordMapper.insertWord(word);

    }

}