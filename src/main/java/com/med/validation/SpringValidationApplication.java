package com.med.validation;

import org.aspectj.weaver.IClassFileProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@EnableAspectJAutoProxy
@SpringBootApplication
public class SpringValidationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringValidationApplication.class, args);


//        List<Integer> list = Arrays.asList(3,5,6,2,3,9,7,6,4,3,9);
//
//        list.stream().count();
//        System.out.println(list.stream().map(n->n*n).collect(Collectors.toList()));
//        list.stream().filter(n->n%2==0).map(n->n*n).collect(Collectors.toList());
//        System.out.println(list.stream().filter(n->n%2==0).map(n->n*n).collect(Collectors.toList()));
//
//        System.out.println(list.stream().filter(n->n%2==0).distinct().map(n->n*n).collect(Collectors.toList()));

        List<String> list = Arrays.asList("Raj","Ram","Danny","Binny","Tommy","Binny","Danny","Gogi","Tappu","Goli");

        System.out.println(list.stream().distinct().collect(Collectors.toList()));










    }

}
