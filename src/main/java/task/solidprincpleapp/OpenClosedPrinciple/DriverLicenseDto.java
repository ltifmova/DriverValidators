package task.solidprincpleapp.OpenClosedPrinciple;

import lombok.Data;

import java.util.Date;

@Data
public class DriverLicenseDto {
    private Long id;
    private Date issueData;
    private Date expiredDate;
private String category;
private String country;
}
