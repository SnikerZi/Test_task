package telda.restservice;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class RegionRegionsDao implements RegionsDao {
    private final RegionMapper regionMapper;

    @Override
    public void saveRegion(Region region) {
        regionMapper.create(region);
    }

    @Override
    public Optional<Region> getRegion(int id) {
        return Optional.ofNullable(regionMapper.get(id));
    }

    @Override
    public List<Region> getAllRegions() {
        return regionMapper.getAll();
    }

    @Override
    public void updateRegion(Region region, String[] params) {
        regionMapper.update(region, params);
    }

    @Override
    public void deleteRegion(Region region) {
        regionMapper.delete(region);
    }
}
