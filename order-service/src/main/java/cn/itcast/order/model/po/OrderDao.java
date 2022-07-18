package cn.itcast.order.model.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tb_order")
public class OrderDao {

    @TableId
    private Long id;

    @TableField(value = "price")
    private Long price;

    @TableField(value = "name")
    private String name;

    @TableField(value = "num")
    private Integer num;

    @TableField(value = "user_id")
    private Integer userId;
}
