package task.solidprincpleapp.OpenClosedPrinciple;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public interface DriverLicenseValidator  {

    boolean isValid(DriverLicenseDto dto);
}
