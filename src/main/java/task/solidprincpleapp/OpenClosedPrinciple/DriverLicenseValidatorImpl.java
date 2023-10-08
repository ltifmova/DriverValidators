package task.solidprincpleapp.OpenClosedPrinciple;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class DriverLicenseValidatorImpl implements DriverLicenseValidator{

    private final List<AbstractValidator> validators;
    public boolean isValid(DriverLicenseDto dto){
        boolean valid=true;
        for(AbstractValidator abstractValidator : validators){
            boolean valid1 = abstractValidator.isValid(dto);
            if(!valid1)
                return false;
        }
        return false;
    }



}