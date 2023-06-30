package github.gmess.furrward.infrastructure.config.seed;

import github.gmess.furrward.domain.vo.Color;

public class ColorSeed {

    public static final Color[] colors = {
            new Color(),
            new Color(),
            new Color(),
            new Color(),
            new Color(),
    };

    static {
        colors[0].setValue("Other");
        colors[1].setValue("Black");
        colors[2].setValue("White");
        colors[3].setValue("Brown");
        colors[4].setValue("Gray");
    }

    private ColorSeed() {

    }
}
