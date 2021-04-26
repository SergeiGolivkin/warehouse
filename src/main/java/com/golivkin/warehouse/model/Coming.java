package com.golivkin.warehouse.model;



import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


@Data
@Entity
@Table(name = "coming" ,schema = "public")
public class Coming implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id",referencedColumnName = "id")
    private Product product;

    @Column(name = "coming_quantity")
    private int comingQuantity;

    @Column(name = "coming_price")
    private int comingPrice;

    @Column(name = "coming_provider")
    private String comingProvider;

    @Column(name = "coming_date")
    private Timestamp comingDate;
}
