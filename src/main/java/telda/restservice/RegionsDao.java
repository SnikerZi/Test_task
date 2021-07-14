package telda.restservice;

import java.util.List;

public interface RegionsDao {

    Region getRegion(Integer id);

    List<Region> getAllRegions();

    void saveRegion(Region t);

    void updateRegion(Region t);

    void deleteRegion(Integer id);}
