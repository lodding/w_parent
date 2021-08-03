package com.me.mybatisplus.date;


import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @program: w_parent->DateTest
 * @description:
 * @author: szh
 * @create: 2021-03-20 16:16
 **/
public class DateTest {
    private static ThreadLocal<SimpleDateFormat> threadLocal =
            ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));

    @Test
    public void getDateOne() {
        Date date = new Date();
        String format = threadLocal.get().format(date);


        System.out.println(format);
    }


    /**
     * 获取当天开始时间
     */
    @Test
    public void getOneDayStart() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        System.out.println(cal.getTime().getTime());
    }

    /**
     * 获取当天结束时间
     */
    @Test
    public void getOneDayEnd() {
        Calendar cal = new GregorianCalendar();
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        cal.set(Calendar.MILLISECOND, 999);
        System.out.println(cal.getTime().getTime());
    }


}
