package com.me.mybatisplus;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import org.junit.Test;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.awt.print.Pageable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @program: w_parent->CeShi
 * @description:
 * @author: szh
 * @create: 2020-08-01 15:08
 **/

public class CeShi {

    @Test
    public void Iterators() {
        List<Integer> one = new ArrayList(16);

        one.add(1);


        List<Integer> two = new ArrayList<>(16);
        two.add(2);
        two.addAll(one);
        Iterator<Integer> iterator = two.iterator();
        List<String> three = new ArrayList<>(16);
    }

    @Test
    public void mppu() {
        int[] arr = {2, 9, 6, 8, 4, 3, 1, 7};
        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int team = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = team;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        List<Integer> list = Lists.newArrayList();
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, String> integerStringMap = Collections.synchronizedMap(new HashMap<Integer, String>());
        ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();
        CopyOnWriteArrayList list1 = new CopyOnWriteArrayList();
        list1.add(123);

        JPanel p=new JPanel();

    }

    @Test
    public void Nums(){
        int[] arr={2,2,3,4,5,6,6,7,7,8};
        List<Integer> nums= Lists.newArrayList();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    nums.add(arr[i]);
                }
            }
        }
        System.out.println(nums.toString());
    }

    @Test
    public void StringS(){
     //   String s =String.join("/","s","m","l","xxl");
        String greeting="greeting";
        String s = greeting.substring(0, 3) + "p!";

        System.out.println(s);
    }

    @Test
    public void DateS(){
        System.out.printf("%tt ", new Date());

    }


}