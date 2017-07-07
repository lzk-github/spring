package com.kaishengit.service;

import com.kaishengit.dao.UserDao;

import java.util.*;

/**
 * Created by lzk on 2017/7/7.
 */
public class DiDemo {
    private double score;
    private String name;
    private List<String> nameList;
    private Set<String> nameSet;
    private Map<String,UserDao> userMap;
    private Properties properties;

    public void setScore(double score) {
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNameList(List<String> nameList) {
        this.nameList = nameList;
    }

    public void setNameSet(Set<String> nameSet) {
        this.nameSet = nameSet;
    }

    public void setUserMap(Map<String, UserDao> userMap) {
        this.userMap = userMap;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void show () {
        System.out.println("score:" + score);
        System.out.println("---------------------");
        System.out.println("name:" + name);
        System.out.println("---------------------");
        for (String name : nameList) {
            System.out.println("nameList:" + name);
        }
        System.out.println("---------------------");
        for(String name : nameSet) {
            System.out.println("nameSet:" + name);
        }
        System.out.println("---------------------");
        for (Map.Entry<String,UserDao> entry : userMap.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
        System.out.println("---------------------");
        Enumeration keys =properties.propertyNames();
        while(keys.hasMoreElements()) {
            String key = (String) keys.nextElement();
            String value = properties.getProperty(key);
            System.out.println(key + "->" + value);
        }
        System.out.println("---------------------");
    }
}
