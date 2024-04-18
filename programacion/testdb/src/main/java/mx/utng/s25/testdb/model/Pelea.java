package mx.utng.s25.testdb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pelea {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(length = 30,nullable=false)
    private String namePelea;

    @Column(nullable = false)
    private String ganador;
    
}
