package pe.edu.cibertec.dch_backoffice2024.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cityId;
    private String city;
    private Date lastUpdate;


    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
}



