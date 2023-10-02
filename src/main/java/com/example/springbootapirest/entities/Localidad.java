package com.utn.parcial1.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "localidad")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Localidad extends Base {
    @Column(name = "denominacion")
    private String denominacion;
}