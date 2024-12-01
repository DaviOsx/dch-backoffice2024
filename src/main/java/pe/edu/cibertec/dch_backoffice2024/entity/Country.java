package pe.edu.cibertec.dch_backoffice2024.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer countryId;
    private String country;
    private Date lastUpdate;

// "country" es el campo con que tenemos que enlazar"
    @OneToMany(mappedBy = "country")
    private List<City> citys;


}


