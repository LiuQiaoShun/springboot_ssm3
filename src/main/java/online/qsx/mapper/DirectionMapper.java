package online.qsx.mapper;

import online.qsx.model.Direction;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DirectionMapper {

    @Select("select * from direction")
    List<Direction> findDirection();

}
