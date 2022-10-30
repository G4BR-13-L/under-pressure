package queen.underpressure.underpressure.service;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import queen.underpressure.underpressure.model.Atividade;
import queen.underpressure.underpressure.repository.AtividadeRepository;


@Service
public class AtividadeService {
    private final AtividadeRepository atividadeRepo;

    @Autowired
    public AtividadeService(AtividadeRepository atividadeRepo) {
        this.atividadeRepo = atividadeRepo;
    }

    public Atividade addAtividade(Atividade Atividade) {
        Atividade.setCodigoAtividade(UUID.randomUUID().toString());
        return atividadeRepo.save(Atividade);
    }

    public List<Atividade> findAllAtividades() {
        return atividadeRepo.findAll();
    }

    public Atividade updateAtividade(Atividade Atividade) {
        return atividadeRepo.save(Atividade);
    }

    public Atividade findAtividadeById(Long id){
        return atividadeRepo.findAtividadeById(id);
    }

    public void deleteAtividade(Long id) {
        atividadeRepo.deleteAtividadeById(id);
    }

   
}
