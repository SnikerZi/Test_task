package telda.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@Service
@RestController
public class RegionRestController
{
    @Autowired
    private RegionMapper regionMapper;

    @RequestMapping("/getAll")
        public List<Region> getAll()
    {

        List<Region> regionList = regionMapper.getAll();
        return regionList;
    }

    @RequestMapping("/get")
    public Region get(int id)
    {
        System.out.println("123");
        return regionMapper.get(id);
    }

    @RequestMapping("/delete")
    public void delete(int id)
    {

        regionMapper.delete(id);
    }
    @RequestMapping("/update")
    public void update(Region region)
    {
        regionMapper.update(region);
    }

}
