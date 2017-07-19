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

        Template template = freeMarkerConfig.getConfiguration().getTemplate("test.ftl");
        Map<String, String> map = new HashMap<>();
        map.put("name", "Freemarker");
        Writer writer = new FileWriter("test.html");
        template.process(map, writer);
    }
}
