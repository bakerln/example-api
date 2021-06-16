package example.api.service;

import common.framework.wrapper.ResultWrapper;
import example.api.pojo.po.ExampleObject;
import example.api.pojo.vo.Food;
import example.api.rpc.ExampleCustomerRPC;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>Description: </p>
 *
 * @author linan
 * @date 2020-10-26
 */

@Service
public class ExampleService {
    private static Logger logger = LoggerFactory.getLogger(ExampleService.class);

    @Autowired(required = false)
    private ExampleCustomerRPC exampleCustomerRPC;

    public List getList(){
        ArrayList<ExampleObject> list = new ArrayList();
        ExampleObject a = new ExampleObject();
        a.setStringObject("a");
        ExampleObject b = new ExampleObject();
        b.setStringObject("b");
        ExampleObject c = new ExampleObject();
        c.setStringObject("c");
        list.add(a);list.add(b);list.add(c);
        return list;
    }


    public ResultWrapper testRPC(ExampleObject object) {
        logger.info("in testRPC");
        ArrayList<Food> list = new ArrayList<>();
        Map<String,Food> map = new HashMap<>();
        Food fa = new Food();
        Food fb = new Food();
        fa.setFoodName("fa");
        fa.setFoodID(1);
        fb.setFoodID(2);
        fb.setFoodName("fb");
        list.add(fa);
        list.add(fb);
        map.put("1",fa);
        map.put("2",fb);
        ResultWrapper a = exampleCustomerRPC.createFood();
        ResultWrapper b = exampleCustomerRPC.createDrink("api","example");
        ResultWrapper c = exampleCustomerRPC.createDrink3(fa);
        ResultWrapper d = exampleCustomerRPC.createDrink1(list);
        ResultWrapper e = exampleCustomerRPC.createDrink2(map);
        return e;
    }
}
