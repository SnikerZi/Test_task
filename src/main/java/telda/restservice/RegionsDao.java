package telda.restservice;

import java.util.List;

public interface RegionsDao {

    Region getRegion(int id);

    List<Region> getAllRegions();

    void saveRegion(Region t);

    void updateRegion(Region t, String[] params);

    void deleteRegion(Region t);
}
