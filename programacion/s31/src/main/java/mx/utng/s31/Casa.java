package mx.utng.s31;


import java.util.Collection;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Casa {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String JefeFamilia;

    @ElementCollection
    @Column(name = "integrante")
    private Collection<String> otros;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getJefeFamilia() {
        return JefeFamilia;
    }

    public void setJefeFamilia(String jefeFamilia) {
        JefeFamilia = jefeFamilia;
    }

    public Collection<String> getOtros() {
        return otros;
    }

    public void setOtros(Collection<String> otros) {
        this.otros = otros;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + ((JefeFamilia == null) ? 0 : JefeFamilia.hashCode());
        result = prime * result + ((otros == null) ? 0 : otros.hashCode());
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
        Casa other = (Casa) obj;
        if (id != other.id)
            return false;
        if (JefeFamilia == null) {
            if (other.JefeFamilia != null)
                return false;
        } else if (!JefeFamilia.equals(other.JefeFamilia))
            return false;
        if (otros == null) {
            if (other.otros != null)
                return false;
        } else if (!otros.equals(other.otros))
            return false;
        return true;
    }

    





}
