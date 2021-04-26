package com.golivkin.warehouse.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "consumption" ,schema = "public")
public class Consumption implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id",referencedColumnName = "id")
    private Product product;

    @Column(name = "consumption_quantity")
    private int consumptionQuantity;

    @Column(name = "consumption_price")
    private int consumptionPrice;

    @Column(name = "consumption_date")
    private Timestamp consumptionDate;
}
