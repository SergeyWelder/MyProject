package ee.study.myproject.domain.WeldingCompany;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table (name = "weldingcompany")
@Getter
@Setter

public class WeldingCompanyDao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String companyName;
    private String companyEXC;
    private String companyAge;
    private String area;
    private LocalDateTime createdAt;
}
