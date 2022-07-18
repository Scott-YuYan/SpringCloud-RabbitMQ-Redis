package cn.itcast.order.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderVo {

    /**
     * 主键
     */
    @NotNull(message = "主键不能为空")
    private Long id;

    /**
     * 商品价格
     */
    @NotNull(message = "商品价格不能为空")
    private Long price;

    /**
     * 商品名称
     */
    @NotNull(message = "商品名称不能为空")
    private String name;

    /**
     * 数量
     */
    private Integer num;

    /**
     * 用户id
     */
    private Integer userId;

}
