package example.api.web.controller.implement;

import common.framework.cache.TimeCache;
import common.framework.wrapper.ResultWrapper;
import common.framework.wrapper.ResultWrapperUtil;
import example.api.pojo.po.ExampleObject;
import example.api.service.ExampleService;
import example.api.web.controller.ExampleController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author linan
 * @date 2020-07-27 14:54
 */
@RestController
public class ExampleControllerImpl  implements ExampleController{

    @Autowired(required = false)
    private ExampleService exampleService;

    @Autowired
    private TimeCache timeCache;

    @Override
    public ResultWrapper getObjectByPost(ExampleObject exampleObject){
        return ResultWrapperUtil.success(exampleObject);
    }

    @Override
    public ResultWrapper getObjectListByPost() {
        /**
         * 处理请求参数
         */
        /**
         * 业务处理
         */
       List list = exampleService.getList();
        /**
         * 处理返回参数
         */
        if(null == list){
            return ResultWrapperUtil.bizError();
        }
       return ResultWrapperUtil.serverError(list);
    }

    @Override
    public String getStingByPost(){
        String string = "Example Hello";
        timeCache.put("a","b");
        return string;
    }

    @Override
    public ResultWrapper getObjectByGET(ExampleObject exampleObject){
        return ResultWrapperUtil.success(exampleObject);
    }

    @Override
    public String getStringByGET(ExampleObject exampleObject){
        String string = "Example Hello";
        return string;
    }

    @Override
    public ResultWrapper testRPC(ExampleObject object) {
        return exampleService.testRPC(object);
    }

}
