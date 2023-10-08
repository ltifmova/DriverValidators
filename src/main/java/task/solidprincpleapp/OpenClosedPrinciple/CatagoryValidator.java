package task.solidprincpleapp.OpenClosedPrinciple;

import org.springframework.stereotype.Component;

@Component
public class CatagoryValidator implements DriverLicenseValidator{
    @Override
    public boolean isValid(DriverLicenseDto dto) {
        if (dto.getCategory().equals("B")){
            return false;
        }
        return true;
    }
}
