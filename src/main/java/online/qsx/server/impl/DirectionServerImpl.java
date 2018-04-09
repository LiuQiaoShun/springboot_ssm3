package online.qsx.server.impl;

import online.qsx.mapper.DirectionMapper;
import online.qsx.model.Direction;
import online.qsx.server.DirectionServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectionServerImpl implements DirectionServer {
    @Autowired
    private DirectionMapper directionMapper;

    @Override
    public List<Direction> findDirection() {
        return directionMapper.findDirection();
    }
}
