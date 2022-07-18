package cn.itcast.user.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserVo {
    /**
     * 主键
     */
    @NotEmpty(message = "主键不能为空")
    private Long id;

    /**
     * 用户名
     */
    @NotEmpty(message = "用户名不能为空")
    private String username;

    /**
     * 地址
     */
    @NotEmpty(message = "地址不能为空")
    private String address;

}
