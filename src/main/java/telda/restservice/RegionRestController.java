package telda.restservice;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Service
@RestController
@RequiredArgsConstructor
public class RegionRestController {

    private final RegionsDao regionRegionsDao;

    @RequestMapping("/new")
    public void create(Region region)
    {
        regionRegionsDao.saveRegion( region);
    }

    @RequestMapping("/getAll")
    public List<Region> getAll()
    {
        return regionRegionsDao.getAllRegions();
    }

    @RequestMapping("/get")
    public Optional<Region> get(int id)
    {
        return regionRegionsDao.getRegion(id);
    }

    @RequestMapping("/delete")
    public void delete(Region region)
    {
        regionRegionsDao.deleteRegion(region);
    }

    @RequestMapping("/update")
    public void update(Region region, String[] params)
    {
        regionRegionsDao.updateRegion(region,params);
    }
}
