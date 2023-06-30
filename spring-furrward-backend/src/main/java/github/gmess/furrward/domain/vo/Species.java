package github.gmess.furrward.domain.vo;
import github.gmess.furrward.domain.entities.Pet;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "species", schema = "vo")
public class Species {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    private byte id;

    @NotBlank(message = "The species value is required")
    @Column(name = "value", nullable = false, unique = true)
    private String value;

    @OneToMany(mappedBy = "species")
    private List<Pet> pets;
}
