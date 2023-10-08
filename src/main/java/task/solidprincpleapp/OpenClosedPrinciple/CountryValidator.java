package task.solidprincpleapp.OpenClosedPrinciple;

import org.springframework.stereotype.Component;

@Component
public class CountryValidator implements DriverLicenseValidator {
    @Override
    public boolean isValid(DriverLicenseDto dto) {
        if (dto.getCountry().equals("Amerika")) {
            return false;
        }
        return true;
    }

}
