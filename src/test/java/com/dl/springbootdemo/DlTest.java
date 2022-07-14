package com.dl.springbootdemo;


import org.junit.jupiter.api.Test;
import org.springframework.boot.system.JavaVersion;

public class DlTest {
    @Test
    public void test() {
        String name = DlTypeExcludeFilter.class.getName();
        System.out.println(name);
        Class<?>[] classes = DlTypeExcludeFilter.class.getClasses();
        System.out.println(classes.length);
        for (Class<?> aClass : classes) {
            System.out.println(aClass.getName());
        }
    }
    @Test
    public void versionTest() {
        JavaVersion javaVersion = JavaVersion.getJavaVersion();
        System.out.println(javaVersion.toString());
    }
}
