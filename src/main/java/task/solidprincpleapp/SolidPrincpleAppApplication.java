package task.solidprincpleapp;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import task.solidprincpleapp.OpenClosedPrinciple.DriverLicenseDto;
import task.solidprincpleapp.OpenClosedPrinciple.DriverLicenseValidator;

import java.util.Date;

@Slf4j
@RequiredArgsConstructor
@SpringBootApplication
public class SolidPrincpleAppApplication implements CommandLineRunner {

 private final DriverLicenseValidator driverLicenseValidator;

    public static void main(String[] args) {
        SpringApplication.run(SolidPrincpleAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Started");
        DriverLicenseDto dto =new DriverLicenseDto();
         dto.setId(123456L);
        dto.setExpiredDate(new Date());
        dto.setCountry("Russia");
        dto.setCategory("B");
        System.out.println(driverLicenseValidator.isValid(dto));

        DriverLicenseDto dto1 =new DriverLicenseDto();
        dto1.setId(2L);
        dto1.setExpiredDate(new Date());
        dto1.setCountry("Azerbaijan");
        dto1.setCategory("C");
        System.out.println(driverLicenseValidator.isValid(dto1));
    }
}
