package demo.test;

import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by mingfei.net@gmail.com
 * 7/19/17 09:13
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
public class FreemarkerTest {
    public static void main(String[] args) throws IOException, TemplateException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        FreeMarkerConfig freeMarkerConfig = (FreeMarkerConfig) applicationContext.getBean("freemarker");

        String model = "Student";

        Template template = freeMarkerConfig.getConfiguration().getTemplate("model.ftl");
        Map<String, Object> map = new HashMap<>();
        map.put("model", model);

        Map<String, String> fields = new LinkedHashMap<>();
        fields.put("id", "Integer");
        fields.put("name", "String");
        fields.put("age", "int");
        fields.put("height", "double");
        fields.put("married", "boolean");
        fields.put("address", "String");

        map.put("fields", fields);

        Writer writer = new FileWriter("src/main/java/demo/model/" + model + ".java");

        template.process(map, writer);
    }
}

/*
    Student
        Integer id;
        String name;
        int age;
        double height;
        boolean married;
 */
