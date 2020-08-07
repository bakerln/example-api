package example.api.web.controller;

import example.api.pojo.po.Hello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author linan
 * @date 2020-07-27 14:54
 */
@RestController
@RequestMapping("/example")
public class ExampleController {

    @GetMapping("/object")
    public Object GetObject(){
        Hello a = new Hello();
        a.setName("linan");
        return a;
    }
    @PostMapping("/object")
    public Object PostObject(){
        Hello a = new Hello();
        a.setName("linan");
        a.setAge(2);
        a.setDate(new Date());
        return a;
    }

    @GetMapping("/string")
    public String GetString(){
        String a = "{\"name\":\"kong\"}";
        return a;
    }
    @PostMapping("/string")
    public String PostString(){
        String a = "{\"name\":\"kong\"}";
        return a;
    }
}
