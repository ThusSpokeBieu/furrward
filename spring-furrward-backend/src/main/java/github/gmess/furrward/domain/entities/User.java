package github.gmess.furrward.domain.entities;

import github.gmess.furrward.domain.entities.base.EntityBase;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "users", schema = "entities")
public class User extends EntityBase {

    private String name;

    private String document;

    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    private String country;

    private String state;

    private String city;

    private String neighborhood;

    @Column(name = "street_address")
    private String streetAddress;

    @Column(name = "postal_code")
    private String postalCode;

    private String password;

}
