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
@Table(name = "breed")
public class Breed {

    @Id
    @Column(name = "id")
    private int id;

    @NotBlank(message = "The breed value is required")
    @Column(name = "value", unique = true)
    private String value;

    @ManyToOne
    @JoinColumn(name = "species_id", referencedColumnName = "id")
    private Species species;

    @OneToMany(mappedBy = "breed")
    private List<Pet> pets;

}
