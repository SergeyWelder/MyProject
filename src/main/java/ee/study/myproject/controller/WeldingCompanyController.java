package ee.study.myproject.controller;

import ee.study.myproject.domain.WeldingCompany.WeldingCompany;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/weldingcompany")
public class WeldingCompanyController {
    @PostMapping
    public String save(@RequestBody WeldingCompany weldcomp) {

        System.out.println("Welding Company " + weldcomp.getCompanyName() + " added");

        return "Welding company " + weldcomp.getCompanyName() + " added! Company EXC is: " + weldcomp.getCompanyEXC() + ". Welding company age is " + weldcomp.getCompanyAge() + ".";

    }

    @GetMapping
    public List<WeldingCompany> getAll() {

        System.out.println("List of all companys");

        return List.of(new WeldingCompany(1, "Lth Baas", "3", "22", "Ship Welding"));

    }

    @PutMapping
    public String changeCompanyEXC(@RequestParam int id, @RequestParam String companyEXC) {
        System.out.println("Change EXC level for: " + companyEXC);

        return "New EXC: " + companyEXC;

    }

    @DeleteMapping
    public String delete(@RequestParam int id) {
        System.out.println("Deleted id: " + id);

        return "Deleted successfully, id: " + id;
    }

    @GetMapping("/{id}")
    public WeldingCompany getID(@PathVariable int id) {
        System.out.println("Get Customer by id " + id);

        return new WeldingCompany(1, "Marketex", "2", "33", "Shipp building");
    }
}
