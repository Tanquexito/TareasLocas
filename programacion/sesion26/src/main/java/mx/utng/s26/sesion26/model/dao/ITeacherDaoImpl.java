package mx.utng.s26.sesion26.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import mx.utng.s26.sesion26.model.entity.Teacher;

@Repository
public class ITeacherDaoImpl implements ITeacherDao{
        //entity manager y contexto persistencia
    //guarda internamente todas las entidades y utiliza como cache datos de db
    @Autowired
    private EntityManager em;
    @Override
    public List<Teacher> list() {
        return em.createQuery("from Teacher").getResultList();
        
       
    }

    @Override
    public void save(Teacher teacher) {
        if(teacher.getId()!=null&& teacher.getId()>0){
            //actualizar valores estudiante
            em.merge(teacher);
        }else {
            //creamos nuevo estudiante
            em.persist(teacher);
        }
    }

    @Override
    public Teacher getById(Long id) {
        return em.find(Teacher.class, id);
        
    }

    @Override
    public void delete(Long id) {
        //
        Teacher teacher =getById(id);
        em.remove(teacher);
    }
    
}
