package telda.restservice;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/region")

public class RegionRestController {

    private final RegionsDao regionRegionsDao;


    @PostMapping()
    public void create(@RequestBody Region region) {
        regionRegionsDao.saveRegion(region);
    }

    @GetMapping("/getAll")
    public List<Region> getAll() {
        return regionRegionsDao.getAllRegions();
    }

    @GetMapping()
    public Region get(@RequestParam Integer id) {
        return regionRegionsDao.getRegion(id);
    }

    @DeleteMapping()
    public void delete(@RequestParam Integer id) {
        regionRegionsDao.deleteRegion(id);
    }

    @PutMapping()
    public void update(@RequestBody Region region) {
        regionRegionsDao.updateRegion(region);
    }
}
