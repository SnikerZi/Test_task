package telda.restservice;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RegionMapper {
    List<Region> getAll();
    Region get(int id);
    void update(Region region);
    void delete(int id);
}
