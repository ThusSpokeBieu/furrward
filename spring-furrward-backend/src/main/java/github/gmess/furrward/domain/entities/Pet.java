package github.gmess.furrward.domain.entities;

import github.gmess.furrward.domain.entities.base.EntityBase;
import github.gmess.furrward.domain.vo.Breed;
import github.gmess.furrward.domain.vo.Color;
import github.gmess.furrward.domain.vo.Species;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "pets", schema = "entities")
public class Pet extends EntityBase {

    @NotBlank(message = "The animal's name is required")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "species_id")
    @NotNull(message = "The animal's species is required")
    private Species species;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "breed_id")
    @NotNull(message = "The animal's breed is required")
    private Breed breed;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "color_id")
    @NotNull(message = "The animal's color is required")
    private Color color;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @NotBlank(message = "The animal's gender is required")
    @Pattern(regexp = "^(Male|Female)$", message = "The animal's gender must be 'Male' or 'Female'")
    private String gender;

    private String size;

    @Column(name = "is_neutered")
    private boolean neutered;

    @Column(name = "is_vaccinated")
    private boolean vaccinated;

    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

}
