package telda.restservice;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface RegionsDao {

    Optional<Region> getRegion(int id);

    List<Region> getAllRegions();

    void saveRegion(Region t);

    void updateRegion(Region t, String[] params);

    void deleteRegion(Region t);
}
