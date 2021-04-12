package web.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    private String model;
    private int speed;
    private int series;

    public Car(String model, int speed, int series) {
        this.model = model;
        this.speed = speed;
        this.series = series;
    }
}
