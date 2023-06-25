package HW14;

import java.util.ArrayList;
import java.util.Objects;

import static HW14.Homework14.MAX_MUSHROOM_IN_BASKET;

public class Basket {
    private int mushroomcount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return mushroomcount == basket.mushroomcount && Objects.equals(name, basket.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mushroomcount, name);
    }

    public int getMushroomCount() {
        return mushroomcount;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "грибов=" + mushroomcount +
                ", name='" + name + '\'' +
                '}';
    }

    private String name;
    ArrayList<Mushroom> mushrooms;

    public Basket(int basketcount, String name) throws MushroomException {
        this.mushroomcount = basketcount;
        this.name = name;

        if(basketcount > MAX_MUSHROOM_IN_BASKET)
          throw new MushroomException(this, "В корзине нет места");
      mushrooms = new ArrayList<>(this.mushroomcount);
    }
}
