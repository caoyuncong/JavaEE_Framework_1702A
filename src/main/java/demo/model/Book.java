package demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by mingfei.net@gmail.com
 * 7/14/17 10:44
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book extends BaseModel {
    private Integer id;
    private String title;
    private String author;
    private String date;
    private double price;
}
