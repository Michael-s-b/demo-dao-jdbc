package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable {
    private static final long serialVersionUID = -2114176087L;
    private Integer Id;
    private String Name;

    public Department() {
    }

    public Department(Integer Id, String Name) {
        this.Id = Id;
        this.Name = Name;
    }

    public Integer getId() {
        return this.Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    // generate a equals and hashcode method
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Department)) {
            return false;
        }
        Department department = (Department) o;
        return Objects.equals(Id, department.Id) && Objects.equals(Name, department.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }

    @Override
    public String toString() {
        return "{" +
                " Id='" + getId() + "'" +
                ", Name='" + getName() + "'" +
                "}";
    }

}
