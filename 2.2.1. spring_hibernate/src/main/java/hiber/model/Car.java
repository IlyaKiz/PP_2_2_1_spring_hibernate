package hiber.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cars")
public class Car {

    @Column(name = "model")
    private String model;

    public Car() {}

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    private int series;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }



}
