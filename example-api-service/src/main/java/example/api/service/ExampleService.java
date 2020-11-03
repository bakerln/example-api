package example.api.service;

import example.api.pojo.po.ExampleObject;
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


}
