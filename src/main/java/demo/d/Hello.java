package demo.d;

/**
 * Created by mingfei.net@gmail.com
 * 7/6/17 11:36
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
public class Hello {

    private CharSequence name; // CharSequence

    public void setName(CharSequence name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, " + name + "!");
    }
}
