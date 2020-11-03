package example.api.pojo.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author linan
 * @date 2020-07-28 15:13
 */

@ApiModel(value="示例对象",description="请求参数对象" )
@Data
public class ExampleObject {
    @ApiModelProperty(value = "字符串对象", required = true, example="linan")
    private String stringObject;
    @ApiModelProperty(value = "Integer对象",required = true, example = "10")
    private Integer age;
    @ApiModelProperty(value = "Double对象",required = true, example = "3.0")
    private Double len;
    @ApiModelProperty(value = "BigDecimal对象",required = true, example = "5")
    private BigDecimal money;
    @ApiModelProperty(value = "日期对象",required = true, example = "2020-10-10 12:32:54")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    /**
     * get入参格式
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date date;


}
