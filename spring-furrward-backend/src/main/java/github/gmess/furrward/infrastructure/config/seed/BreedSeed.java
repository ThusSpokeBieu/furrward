package github.gmess.furrward.infrastructure.config.seed;

import github.gmess.furrward.domain.vo.Breed;

public class BreedSeed {
    public static final Breed[] breeds = {
            new Breed(),
            new Breed(),
            new Breed(),
            new Breed()
    };

    static {
      //  breeds[0].set
    }
    private BreedSeed(){}
}
