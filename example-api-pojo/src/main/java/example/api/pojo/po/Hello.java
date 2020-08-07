package example.api.pojo.po;

import lombok.Data;

import java.util.Date;

/**
 * @author linan
 * @date 2020-07-28 15:13
 */
@Data
public class Hello {
    private String name;
    private Integer age;
    private Date date;
}
