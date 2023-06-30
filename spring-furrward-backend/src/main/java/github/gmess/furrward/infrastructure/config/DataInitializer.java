package github.gmess.furrward.infrastructure.config;

import github.gmess.furrward.domain.entities.User;
import github.gmess.furrward.domain.vo.Color;
import github.gmess.furrward.infrastructure.config.seed.ColorSeed;
import github.gmess.furrward.infrastructure.config.seed.UserSeed;
import github.gmess.furrward.infrastructure.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    private final UserRepository userRepository;
    private final ColorRepository colorRepository;
    private final SpeciesRepository speciesRepository;
    private final BreedRepository breedRepository;
    private final PetRepository petRepository;

    public DataInitializer(     UserRepository userRepository, 
                                ColorRepository colorRepository, 
                                SpeciesRepository speciesRepository,
                                BreedRepository breedRepository,
                                PetRepository petRepository) {
        this.userRepository = userRepository;
        this.colorRepository = colorRepository;
        this.speciesRepository = speciesRepository;
        this.breedRepository = breedRepository;
        this.petRepository = petRepository;
    }

    @Override
    public void run(String... args) {
        if (userRepository.count() == 0) {
            seedUsers();
        }

        if (colorRepository.count() == 0) {
            seedColors();
        }
    }

    private void seedUsers() {
        for (User user : UserSeed.users) {
            if (user != null) {
                userRepository.save(user);
            }
        }

    }

    private void seedColors() {
        for (Color color : ColorSeed.colors){
            if(color!=null){
                colorRepository.save(color);
            }
        }
    }
}
