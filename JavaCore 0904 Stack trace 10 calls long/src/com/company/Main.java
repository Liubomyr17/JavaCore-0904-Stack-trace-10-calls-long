package com.company;

/*

0904 Stack trace 10 calls long

Write the code to get a stack trace of 10 calls.
Requirements:
1. The class should have 10 methods (the main method should not be taken into account).
2. The length of the stack trace in method10 should be 10.
3. Each method must call a different method.
4. Use the Thread.currentThread (). GetStackTrace () method.

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        method1();
    }
    public static StackTraceElement[] method1() {
    return method2();
    }
    public static StackTraceElement[] method2() {
        return method3();
    }
    public static StackTraceElement[] method3() {
        return method4();
    }
    public static StackTraceElement[] method4() {
        return method5();
    }
    public static StackTraceElement[] method5() {
        return method6();
    }
    public static StackTraceElement[] method6() {
        return method7();
    }
    public static StackTraceElement[] method7() {
        return method8();
    }
    public static StackTraceElement[] method8() {
        return method9();
    }
    public static StackTraceElement[] method9() {
        return method10();
    }
    public static StackTraceElement[] method10() {
        return Thread.currentThread().getStackTrace();
    }
}
