package demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by mingfei.net@gmail.com
 * 7/4/17 17:12
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;
    private String lastTime;
}
