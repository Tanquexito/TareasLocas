package mx.utng.s28.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Partido {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_equipo_1",referencedColumnName = "id")
    private Equipo equipo1;

    @ManyToOne
    @JoinColumn(name = "ID_equipo_2",referencedColumnName = "id")
    private Equipo equipo2;

    @Column(name = "marcador_Local")
    private Integer marcadorEquip1;
    @Column(name = "marcador_Visitante")
    private Integer marcadorEquip2;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Equipo getEquipo1() {
        return equipo1;
    }
    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }
    public Equipo getEquipo2() {
        return equipo2;
    }
    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }
    public Integer getMarcadorEquip1() {
        return marcadorEquip1;
    }
    public void setMarcadorEquip1(Integer marcadorEquip1) {
        this.marcadorEquip1 = marcadorEquip1;
    }
    public Integer getMarcadorEquip2() {
        return marcadorEquip2;
    }
    public void setMarcadorEquip2(Integer marcadorEquip2) {
        this.marcadorEquip2 = marcadorEquip2;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((equipo1 == null) ? 0 : equipo1.hashCode());
        result = prime * result + ((equipo2 == null) ? 0 : equipo2.hashCode());
        result = prime * result + ((marcadorEquip1 == null) ? 0 : marcadorEquip1.hashCode());
        result = prime * result + ((marcadorEquip2 == null) ? 0 : marcadorEquip2.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Partido other = (Partido) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (equipo1 == null) {
            if (other.equipo1 != null)
                return false;
        } else if (!equipo1.equals(other.equipo1))
            return false;
        if (equipo2 == null) {
            if (other.equipo2 != null)
                return false;
        } else if (!equipo2.equals(other.equipo2))
            return false;
        if (marcadorEquip1 == null) {
            if (other.marcadorEquip1 != null)
                return false;
        } else if (!marcadorEquip1.equals(other.marcadorEquip1))
            return false;
        if (marcadorEquip2 == null) {
            if (other.marcadorEquip2 != null)
                return false;
        } else if (!marcadorEquip2.equals(other.marcadorEquip2))
            return false;
        return true;
    }

    

    

    
}
