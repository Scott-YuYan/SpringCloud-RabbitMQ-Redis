package cn.itcast.order.mapper;

import cn.itcast.order.model.po.OrderDao;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<OrderDao> {
}
