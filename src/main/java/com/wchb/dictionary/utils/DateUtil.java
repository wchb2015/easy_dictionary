package com.wchb.dictionary.utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateUtil {
    public static Timestamp parseDateStr(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date result = null;
        try {
            result = sdf.parse(dateStr + " 00:00:01");
        } catch (Exception e) {

        }
        return new Timestamp(result.getTime());
    }
}
