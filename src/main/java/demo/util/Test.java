package demo.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author mingfei.net@gmail.com
 *         2017/7/19 22:05
 *         https://github.com/thu/JavaEE_Framework_1702A
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(convertJavaNameToDatabaseName("StudentCourseTestD"));
//        "getSpecialString".replaceAll("([A-Z])", "_$1").toLowerCase();
    }

    private static String convertJavaNameToDatabaseName(String className) {
        return className.replaceAll("(?<!^)([A-Z])", "_$1").toLowerCase();
    }
}
