package kz.kbtu.customer.request;

import lombok.Data;
@Data
public class CustomerRegistrationRequest {
    private String firstname;
    private String lastname;
    private String email;
}
