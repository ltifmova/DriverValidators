package task.solidprincpleapp.OpenClosedPrinciple;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BlackListValidator implements AbstractValidator{
    private List blacklist=List.of(123456L,234567L,987653L);

    @Override
    public boolean isValid(DriverLicenseDto dto) {
        boolean contains=blacklist.contains(dto.getId());
        if (contains)
            return false;
        return true;
    }
}
