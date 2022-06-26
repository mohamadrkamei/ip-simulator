package com.example.ipsimulator.utils;

import com.ghasemkiani.util.icu.PersianCalendar;
import com.ibm.icu.impl.CalendarUtil;
import com.ibm.icu.text.DateFormat;
import com.ibm.icu.text.SimpleDateFormat;
import com.ibm.icu.util.TimeZone;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;

public class CalenderUtils {

    public static String ISO_LOCAL_FORMAT = "YYYY-MM-dd'T'HH:mm:ss";

    public static String getPersianDateStamp() {
        return getPersianDateByPattern(LocalDateTime.now(), "yyyyMMdd");
    }

    public static String getPersianDateByPattern(LocalDateTime date, String pattern) {
        PersianCalendar calendar = new PersianCalendar();
        calendar.setTime(Date.from(date.atZone(ZoneId.systemDefault()).toInstant()));
        calendar.setTimeZone(TimeZone.getTimeZone(getTehranZoneId().getId()));

        SimpleDateFormat sdf = (SimpleDateFormat) calendar.getDateTimeFormat(DateFormat.SHORT, DateFormat.SHORT, Locale.ENGLISH);
        sdf.applyPattern(pattern);

        return sdf.format(calendar.getTime());
    }

    public static ZoneId getTehranZoneId() {
        return ZoneId.of("Asia/Tehran");
    }

    public static String getPersianDateSeparated() {
        return getPersianDateByPattern(LocalDateTime.now(), "yyyy-MM-dd");
    }

    public static String getPersianDateTimeStamp() {
        return getPersianDateByPattern(LocalDateTime.now(), ISO_LOCAL_FORMAT);
    }
}
