package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.text.ParseException;
import java.util.Objects;

public class Seller implements Serializable {
    private static final long serialVersionUID = 2575630555L;
    private Integer Id;
    private String Name;
    private String Email;
    private Date BirthDate;
    private Double BaseSalary;
    private Department Department;

    public Seller() {
    }

    public Seller(Integer Id, String Name, String Email, Date BirthDate, Double BaseSalary, Department Department)
            throws ParseException {
        this.Id = Id;
        this.Name = Name;
        this.Email = Email;
        this.BirthDate = BirthDate;
        this.BaseSalary = BaseSalary;
        this.Department = Department;
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

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Date getBirthDate() {
        return this.BirthDate;
    }

    public void setBirthDate(Date BirthDate) {
        this.BirthDate = BirthDate;
    }

    public Double getBaseSalary() {
        return this.BaseSalary;
    }

    public void setBaseSalary(Double BaseSalary) {
        this.BaseSalary = BaseSalary;
    }

    public Department getDepartment() {
        return this.Department;
    }

    public void setDepartment(Department Department) {
        this.Department = Department;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Seller)) {
            return false;
        }
        Seller seller = (Seller) o;
        return Objects.equals(Id, seller.Id);
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
                ", Email='" + getEmail() + "'" +
                ", BirthDate='" + getBirthDate() + "'" +
                ", BaseSalary='" + getBaseSalary() + "'" +
                ", Department='" + getDepartment() + "'" +
                "}";
    }

}
