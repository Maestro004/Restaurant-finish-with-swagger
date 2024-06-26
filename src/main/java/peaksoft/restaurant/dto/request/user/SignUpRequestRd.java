package peaksoft.restaurant.dto.request.user;

import lombok.Builder;
import peaksoft.restaurant.enums.Role;
import peaksoft.restaurant.validator.ValidPhoneNumber;

import java.time.LocalDate;

@Builder
public record SignUpRequestRd(
        String firstName,
        String lastName,
        LocalDate dateOfBirth,
        String email,
        String password,
//        @ValidPhoneNumber
        String phoneNumber,
        Role role,
        int experience
        ) {
}
