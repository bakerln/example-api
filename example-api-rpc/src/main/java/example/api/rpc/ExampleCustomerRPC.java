package example.api.rpc;

import common.framework.wrapper.ResultWrapper;
import example.api.pojo.vo.Food;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * <p>Description: RPC 业务服务接口</p>
 *
 * @author linan
 * @date 2020-12-29
 */
@FeignClient(name = "EXAMPLE-CUSTOMER")
public interface ExampleCustomerRPC {
    @RequestMapping (value = "/rpc/customer.api.rpc.EatExampleRPC/createFood",method = RequestMethod.GET)
    ResultWrapper createFood();

    @GetMapping (value = "/rpc/customer.api.rpc.EatExampleRPC/createFoodGet")
    ResultWrapper createFoodGet(@RequestParam("foodName") Food foodName);

    @PostMapping(value = "/rpc/customer.api.rpc.EatExampleRPC/createDrink")
    ResultWrapper createDrink(@RequestParam("foodName")  String foodName,@RequestParam("drinkName") String drinkName);

    @PostMapping(value = "/rpc/customer.api.rpc.EatExampleRPC/createDrink12")
    ResultWrapper createDrink12(@RequestParam("foodNameList") List<String> foodNameList);

    @PostMapping(value = "/rpc/customer.api.rpc.EatExampleRPC/createDrink1")
    ResultWrapper createDrink1(@RequestBody List<Food> foodNameList);

    @PostMapping(value = "/rpc/customer.api.rpc.EatExampleRPC/createDrink11")
    ResultWrapper createDrink11(@RequestBody List<String> foodNameList);

    @PostMapping(value = "/rpc/customer.api.rpc.EatExampleRPC/createDrink2")
    ResultWrapper createDrink2(@RequestBody Map<String,Food> foodNameMap);

    @PostMapping(value = "/rpc/customer.api.rpc.EatExampleRPC/createDrink3")
    ResultWrapper createDrink3(@RequestBody Food food);

    @PostMapping(value = "/rpc/customer.api.rpc.EatExampleRPC/createDrink4")
    ResultWrapper createDrink4();
}
