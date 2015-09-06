package com.norbertsandor.maven_toolchains_java8;

import java.util.Arrays;

public class Java8Class
{
    public static void main(String[] args)
    {
        // Print arguments - functional style
        Arrays.asList(args).stream().forEach(System.out::println);
    }
}
