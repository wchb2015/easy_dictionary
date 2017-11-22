package com.wchb.dictionary.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wchb.dictionary.domain.Meaning;
import org.junit.Test;

import java.io.IOException;

public class JacksonTest {

    ObjectMapper mapper = new ObjectMapper(); // create once, reuse

    @Test
    public void testConvert() throws IOException {
        Meaning value = mapper.readValue("{\"english\":\"Bob\", \"chinese\":13}", Meaning.class);

        System.out.println(value);

        String jsonString = mapper.writeValueAsString(value);

        System.out.println(jsonString);

    }


}

