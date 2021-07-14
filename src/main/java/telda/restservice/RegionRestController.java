package telda.restservice;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
@RestController
public class RegionRestController {
    private final RegionMapper regionMapper;

    public RegionRestController(RegionMapper regionMapper) {
        this.regionMapper = regionMapper;
    }

    @RequestMapping("/new")
    public void create(String name, String short_name) {
        regionMapper.create(name, short_name);
    }

    @RequestMapping("/getAll")
    public List<Region> getAll() {

        return regionMapper.getAll();
    }

    @RequestMapping("/get")
    public Region get(int id) {
        System.out.println("123");
        return regionMapper.get(id);
    }

    @RequestMapping("/delete")
    public void delete(int id) {
        regionMapper.delete(id);
    }

    @RequestMapping("/update")
    public void update(int id, String name, String short_name) {
        regionMapper.update(id, name, short_name);
    }
}
