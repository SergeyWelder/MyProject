package ee.study.myproject.domain.WeldingCompany;

import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor

public class WeldingCompanyService {
    @Resource
    private WeldingCompanyRepository weldingCompanyRepository;

    public WeldingCompanyDao save(WeldingCompanyDto weldcomp) {
        System.out.println("Welding Company " + weldcomp.getCompanyName() + " added");
        WeldingCompanyDao weldingCompanyDao = new WeldingCompanyDao();
        weldingCompanyDao.setCompanyName(weldcomp.getCompanyName());
        weldingCompanyDao.setArea(weldcomp.getArea());
        weldingCompanyDao.setCompanyExc(weldcomp.getCompanyExc());
        weldingCompanyDao.setCompanyAge(weldcomp.getCompanyAge());
        weldingCompanyDao.setCreatedAt(LocalDateTime.now());
        return weldingCompanyRepository.save(weldingCompanyDao);
    }

    public List<WeldingCompanyDao> getAll() {
        System.out.println("List of all companys");

        return weldingCompanyRepository.findAll();
    }

    public int changeCompanyEXC(int id, String companyEXC) {
        System.out.println("Change EXC level for: " + companyEXC);

        return weldingCompanyRepository.changeCompanyEXC(companyEXC, id);
    }

    public void delete(int id) {
        System.out.println("Deleted id: " + id);
        weldingCompanyRepository.deleteById(id);
    }

    public WeldingCompanyDao getID(int id) {
        System.out.println("Get Customer by id " + id);
        return weldingCompanyRepository.findById(id).get() ;
    }
}
