package ee.study.myproject.controller;

import ee.study.myproject.domain.WeldingCompany.WeldingCompany;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weldingcompany")
public class WeldingCompanyController {
    @PostMapping
    public String save(@RequestBody WeldingCompany weldcomp) {

        System.out.println("Welding Company " + weldcomp.getCompanyName() + " added");

        return "Welding company " + weldcomp.getCompanyName() + " added! Company EXC is: " + weldcomp.getCompanyEXC() + ". Welding company age is " + weldcomp.getCompanyAge() + ".";

    }
}
