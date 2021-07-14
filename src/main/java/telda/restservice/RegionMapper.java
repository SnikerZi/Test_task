package telda.restservice;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository

public interface RegionMapper {
    @Cacheable("regions")
    Region create(Region region);
    @Cacheable("regions")
    Region get(int id);
    @Cacheable("regions")
    List<Region> getAll();
    void update(Region region, String[] params );
    @CacheEvict("regions")
    void delete(Region region);
}
