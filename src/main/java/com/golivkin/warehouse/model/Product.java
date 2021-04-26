package com.golivkin.warehouse.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
@Table(name = "product" ,schema = "public")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "product_name")
    private String productName;

    @ManyToOne
    @JoinColumn(name = "group_id",referencedColumnName = "id")
    private Group group;

    @Column(name = "product_quantity")
    private int productQuantity;
}
