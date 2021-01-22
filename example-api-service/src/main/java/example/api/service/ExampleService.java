package example.api.service;

import common.framework.wrapper.ResultWrapper;
import example.api.pojo.po.ExampleObject;
import example.api.rpc.ExampleCustomerRPC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Description: </p>
 *
 * @author linan
 * @date 2020-10-26
 */

@Service
public class ExampleService {

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
        return exampleCustomerRPC.createFood();
    }
}
