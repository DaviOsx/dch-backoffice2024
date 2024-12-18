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
public class Address {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer  id;
        private String address;
        private String address2;
        private String district;
        //private Integer cityId;
        private String postalCode;
        private String phone;
        private Integer location;
        private Date lastUpdate;

        @ManyToOne
        @JoinColumn(name = "city_id")
        private City city;

}









