package com.wchb.dictionary.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoggerTest {

    private final Logger LOG = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1() {
        LOG.debug("debug...");
        LOG.info("info...");
        LOG.error("error...");
//        2017-07-29 17:40:11.060  INFO 8786 --- [           main] com.wchb.dictionary.test.LoggerTest      : info...
//        2017-07-29 17:40:11.060 ERROR 8786 --- [           main] com.wchb.dictionary.test.LoggerTest      : error...

    }
}
