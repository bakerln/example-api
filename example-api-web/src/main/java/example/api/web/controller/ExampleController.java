package example.api.web.controller;

import common.framework.util.jsonutil.JsonUtil;
import example.api.pojo.po.Hello;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @author linan
 * @date 2020-07-27 14:54
 */
@RestController
@RequestMapping("/example")
public class ExampleController {

    /**
     * Get 示例
     * @param hello 对象 （body json）
     * @return 对象
     */
    @GetMapping("/object")
    public Object GetObject(@RequestBody Hello hello){
        Hello a = hello;
        a.setName("linan");
        return hello;
    }

    /**
     * Get 示例
     * @param hello
     * @return String
     */
    @GetMapping("/string")
    public String GetString(Hello hello){
        String a = "{\"name\":\"kong\"}";
        return a;
    }

    /**
     * POST 示例
     * @param hello
     * @return
     */
    @PostMapping("/object1")
    public Object PostObject1(Hello hello){
        return hello;
    }

    /**
     * POST 示例
     * @param hello
     * @return
     */
    @PostMapping("/object2")
    public Object PostObject2(@RequestBody Hello hello){
        return hello;
    }

    /**
     * POST 示例
     * @param hello
     * @return
     */
    @PostMapping("/string")
    public String PostString(Hello hello){
        String a = "{\"name\":\"kong\"}";
        return a;
    }
}
