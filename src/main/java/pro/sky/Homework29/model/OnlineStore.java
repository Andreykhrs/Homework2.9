package pro.sky.Homework29.model;

import java.util.Objects;

public class OnlineStore {
    private Integer ID;

    public OnlineStore(Integer ID) {
        this.ID = ID;
    }

    public Integer getID() {
        return ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OnlineStore that = (OnlineStore) o;
        return Objects.equals(ID, that.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }
}
