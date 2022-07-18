package cn.itcast.user.model.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "tb_user")
public class UserDao {

    @TableField(value = "id")
    private Long id;

    @TableField(value = "username")
    private String username;

    @TableField(value = "address")
    private String address;
}
