package ee.study.myproject.domain.WeldingCompany;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository

public interface WeldingCompanyRepository extends JpaRepository<WeldingCompanyDao, Integer> {
    @Transactional
    @Modifying
    @Query("update WeldingCompanyDao w set w.companyExc = ?1 where w.id = ?2")
    int changeCompanyEXC(String companyExc, int id);

    @Override
    void deleteById(Integer integer);
}
