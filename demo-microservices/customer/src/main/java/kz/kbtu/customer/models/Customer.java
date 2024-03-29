package kz.kbtu.customer.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {

    @Id
//    @SequenceGenerator(
//            name = "customer_id_sequence",
//            sequenceName = "customer_id_sequence"
//    )
    @GeneratedValue(
            strategy = GenerationType.AUTO
//            generator = "customer_id_sequence"
    )
    private Integer customer_id;
    private String firstname;
    private String lastname;
    private String email;
}
