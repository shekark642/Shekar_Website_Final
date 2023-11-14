package com.example.sping_portfolio.Minilab.Minilab4.Shekar;

import lombok.Getter;
import java.time.Duration;
@Getter
public abstract class backend {
    Duration timeElapsed;
    int num1;

    public abstract float findsum();
    public abstract String getMethod();

    //return runtime
    public int getTimeElapsed() {
        return timeElapsed.getNano();
    }
}


