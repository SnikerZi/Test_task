package telda.restservice;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository

public interface RegionMapper {

    Region create(Region region);
    Region get(int id);
    List<Region> getAll();
    void update(Region region, String[] params );
    void delete(Region region);
}
