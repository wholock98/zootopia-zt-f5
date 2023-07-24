package f5.ztf5.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="continentes")
public class Continent {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idcontinente")
    public int id;

    @Column(name="nombre")
    public String nombre;


    public Continent() {
    }

    public Continent(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }


    public int getId() {
        return this.id;
    }

    // public void setId(int id) {
    //     this.id = id;
    // }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @OneToMany(mappedBy = "continente")
    public List<Animal> animales;


}
