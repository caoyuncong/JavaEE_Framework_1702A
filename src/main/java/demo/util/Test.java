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
    }

    private static String convertJavaNameToDatabaseName(String ClassName) {
        StringBuilder stringBuilder = new StringBuilder(ClassName);
        for (int i = 1; i < stringBuilder.length(); i++) {
            if (Character.isUpperCase(stringBuilder.charAt(i))) {
                stringBuilder.insert(i, '_');
                i++;
            }
        }
        return stringBuilder.toString().toLowerCase();
    }
}
