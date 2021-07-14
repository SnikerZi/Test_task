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
    @CachePut(value= "regions", cacheNames = "regions",key = "region.id")
    public void saveRegion(Region region) {
        regionMapper.create(region);
    }

    @Override
    @Cacheable(value= "regions",cacheNames = "regions",key = "")
    public Region getRegion(int id) {
        return regionMapper.get(id);
    }

    @Override
    public List<Region> getAllRegions() {
        return regionMapper.getAll();
    }

    @Override
    @CachePut(value= "regions",cacheNames = "regions",key = "region.id")
    public void updateRegion(Region region, String[] params) {
        regionMapper.update(region, params);
    }

    @Override
    @CacheEvict(value= "regions",cacheNames = "regions",key = "region.id")
    public void deleteRegion(Region region) {
        regionMapper.delete(region);
    }
}
