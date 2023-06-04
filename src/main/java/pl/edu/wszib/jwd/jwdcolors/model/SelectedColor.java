package pl.edu.wszib.jwd.jwdcolors.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity //mechanizm jpa - obiekty javy mapujemy i automatycznie zapisujemy w bazie jako wiersze
@Table(name = "SelectedColors", schema="jwdcolors")
public class SelectedColor {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    private String color;
    private Date ctime; //czas stworzenia

    public SelectedColor(String colorBlue, Date date) {
    }

    public SelectedColor(Integer id, String color, Date ctime) {
        this.color = color;
        this.ctime = ctime;
    }

    public SelectedColor() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}
