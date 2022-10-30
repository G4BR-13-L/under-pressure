package queen.underpressure.underpressure.service;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import queen.underpressure.underpressure.model.Disciplina;
import queen.underpressure.underpressure.repository.DisciplinaRepository;


@Service
public class DisciplinaService {
    private final DisciplinaRepository disciplinaRepo;

    @Autowired
    public DisciplinaService(DisciplinaRepository disciplinaRepo) {
        this.disciplinaRepo = disciplinaRepo;
    }

    public Disciplina addDisciplina(Disciplina disciplina) {
        disciplina.setCodigoDisciplina(UUID.randomUUID().toString());
        return disciplinaRepo.save(disciplina);
    }

    public List<Disciplina> findAllDisciplinas() {
        return disciplinaRepo.findAll();
    }

    public Disciplina updateDisciplina(Disciplina disciplina) {
        return disciplinaRepo.save(disciplina);
    }

    public Disciplina findDisciplinaById(Long id){
        return disciplinaRepo.findDisciplinaById(id);
    }

    public void deleteDisciplina(Long id) {
        disciplinaRepo.deleteDisciplinaById(id);
    }

   
}
