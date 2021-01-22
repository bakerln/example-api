package example.api.rpc;

import common.framework.wrapper.ResultWrapper;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <p>Description: RPC 业务服务接口</p>
 *
 * @author linan
 * @date 2020-12-29
 */
@FeignClient(name = "EXAMPLE-CUSTOMER")
public interface ExampleCustomerRPC {

    @GetMapping("/foodOperation/getFood")
    ResultWrapper createFood();
}
