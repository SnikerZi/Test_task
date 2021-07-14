package telda.restservice;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository

public interface RegionMapper {
    Region create(String name, String short_name);

    List<Region> getAll();

    Region get(int id);

    void update(int id, String name, String short_name);

    void delete(int id);
}
