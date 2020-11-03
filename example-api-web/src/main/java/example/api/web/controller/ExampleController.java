package example.api.web.controller;

import common.framework.util.voutil.ResultWrapper;
import example.api.pojo.po.ExampleObject;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>Description: WEB请求示例</p>
 *
 * @author linan
 * @date 2020-10-29
 */
@Api(value = "/example",tags = "WEB请求示例",  description="包括post请求、get请求等操作")
@RequestMapping("/example")
public interface ExampleController {

    @ApiOperation(
            value = "POST方法请求调用示例",
            notes = "请求参数为对象json串，返回ResultWrapper对象",
            response = ExampleObject.class
    )
    @ApiResponses(value = {
            @ApiResponse(code = 900,message = "009XX 业务相关错误",response = ResultWrapper.class),
            @ApiResponse(code = 500, message = "005XX 服务器相关错误",response = ResultWrapper.class)}
    )
    @PostMapping("/postObjectGetObject")
    public ResultWrapper getObjectByPost(@ApiParam(value = "示例对象",required = true) ExampleObject object);


    @ApiOperation(
            value = "POST方法请求调用示例",
            notes = "无请求参数，返回对象ResultWrapper对象，包含List",
            response = ExampleObject.class,
            responseContainer = "List"
    )
    @ApiResponses(value = {
            @ApiResponse(code = 900,message = "009XX 业务相关错误",response = ResultWrapper.class),
            @ApiResponse(code = 500, message = "005XX 服务器相关错误",response = ResultWrapper.class)}
    )
    @PostMapping("/postObjectGetList")
    public ResultWrapper getObjectListByPost();


    @ApiOperation(
            value = "POST方法请求调用示例",
            notes = "无请求参数，返回对象为String",
            response = String.class
    )
    @ApiResponses(value = {
            @ApiResponse(code = 900,message = "009XX 业务相关错误",response = ResultWrapper.class),
            @ApiResponse(code = 500, message = "005XX 服务器相关错误",response = ResultWrapper.class)}
    )
    @PostMapping("/postObjectGetString")
    public String getStingByPost();


    @ApiOperation(
            value = "GET方法请求调用示例",
            notes = "",
            response = ResultWrapper.class
          )
    @ApiResponses(value = {
            @ApiResponse(code = 900,message = "009XX 业务相关错误",response = ResultWrapper.class),
            @ApiResponse(code = 500, message = "005XX 服务器相关错误",response = ResultWrapper.class)}
    )
    @GetMapping("/getObjectGetString")
    public ResultWrapper getObjectByGET(@ApiParam(value = "示例对象",required = true) ExampleObject exampleObject);


    @ApiOperation(
            value = "GET方法请求调用示例",
            notes = "",
            response = String.class
    )
    @ApiResponses(value = {
            @ApiResponse(code = 900,message = "009XX 业务相关错误",response = ResultWrapper.class),
            @ApiResponse(code = 500, message = "005XX 服务器相关错误",response = ResultWrapper.class)}
    )
    @GetMapping("/getStringGetString")
    public String getStringByGET(@ApiParam(value = "示例对象",required = true) ExampleObject exampleObject);

}
