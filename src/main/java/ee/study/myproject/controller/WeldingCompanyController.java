package ee.study.myproject.controller;

import ee.study.myproject.domain.WeldingCompany.WeldingCompanyDao;
import ee.study.myproject.domain.WeldingCompany.WeldingCompanyDto;
import ee.study.myproject.domain.WeldingCompany.WeldingCompanyService;
import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/weldingcompany")
@RequiredArgsConstructor
public class WeldingCompanyController {
    @Resource
    private WeldingCompanyService weldingCompanyService;

    @PostMapping
    public WeldingCompanyDao save(@RequestBody WeldingCompanyDto weldcomp) {


        return weldingCompanyService.save(weldcomp);
        //"Welding company " + weldcomp.getCompanyName() + " added! Company EXC is: " + weldcomp.getCompanyExc() + ". Welding company age is " + weldcomp.getCompanyAge() + ".";

    }

    @GetMapping
    public List<WeldingCompanyDao> getAll() {

        return weldingCompanyService.getAll();

    }

    @PutMapping
    public int changeCompanyEXC(@RequestParam int id, @RequestParam String companyEXC) {

        return weldingCompanyService.changeCompanyEXC(id, companyEXC);

    }

    @DeleteMapping
    public void delete(@RequestParam int id) {
        weldingCompanyService.delete(id);
    }

    @GetMapping("/{id}")
    public WeldingCompanyDao getID(@PathVariable int id) {

        return weldingCompanyService.getID(id);
    }
}
