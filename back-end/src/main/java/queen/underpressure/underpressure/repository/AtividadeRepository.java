package queen.underpressure.underpressure.repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import queen.underpressure.underpressure.model.Atividade;

@Repository
public interface AtividadeRepository extends JpaRepository <Atividade, Long>{
    
    void deleteAtividadeById(Long id);

    Atividade findAtividadeById(Long id);
}

