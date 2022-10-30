package queen.underpressure.underpressure.repository;


import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import queen.underpressure.underpressure.model.Atividade;
import queen.underpressure.underpressure.model.Disciplina;

@Repository
public interface DisciplinaRepository extends JpaRepository <Disciplina, Long>{
    

    void deleteDisciplinaById(Long id);

    Disciplina findDisciplinaById(Long id);

}
