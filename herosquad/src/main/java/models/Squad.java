package models;

import java.util.Objects;

public class Squad {
    private String name;
    private int id;

    public Squad (String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Squad)) return false;
        Squad squad = (Squad) o;
        return id == squad.id &&
                Objects.equals(name,squad.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
