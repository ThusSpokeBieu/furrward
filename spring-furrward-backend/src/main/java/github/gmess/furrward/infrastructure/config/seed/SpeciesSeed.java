package github.gmess.furrward.infrastructure.config.seed;

import github.gmess.furrward.domain.vo.Species;

public class SpeciesSeed {

    private static final Species[] species = {
            new Species(),
            new Species(),
            new Species(),
    };

    static {
        species[0].setValue("Dog");
        species[1].setValue("Cat");
        species[2].setValue("Rabbit");
    }

    private SpeciesSeed() {}
}
