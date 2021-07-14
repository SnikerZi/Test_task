package telda.restservice;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class RegionRegionsDao implements RegionsDao {
    private final RegionMapper regionMapper;

    @Override
    @CacheEvict(value= "regions",key = "#region.id")
    public void saveRegion(Region region) {
        regionMapper.create(region);
    }

    @Override
    @Cacheable(value= "regions",key = "#id")
    public Region getRegion(Integer id) {
        return regionMapper.get(id);
    }

    @Override
    public List<Region> getAllRegions() {
        return regionMapper.getAll();
    }

    @Override
    @CacheEvict(value= "regions",key = "#region.id")
    public void updateRegion(Region region) {
        regionMapper.update(region);
    }

    @Override
    @CacheEvict(value= "regions",key="#id")
    public void deleteRegion(Integer id) {
        regionMapper.delete(id);
    }
}
