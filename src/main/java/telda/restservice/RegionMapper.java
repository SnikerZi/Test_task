package telda.restservice;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository

public interface RegionMapper {

    void create(Region region);

    Region get(Integer id);

    List<Region> getAll();

    void update(Region region);

    void delete(Integer id);
}
