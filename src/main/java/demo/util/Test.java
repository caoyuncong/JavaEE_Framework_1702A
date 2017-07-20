package demo.util;

/**
 * Created by mingfei.net@gmail.com
 * 7/20/17 14:46
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
public class Test {
    public static void main(String[] args) {
        int totalCount = 26;
        int pageSize = 10;
        double p = pageSize;
        System.out.println(totalCount / pageSize);
        System.out.println(Math.ceil(totalCount / p));
    }
}
