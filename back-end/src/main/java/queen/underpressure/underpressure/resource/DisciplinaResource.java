package queen.underpressure.underpressure.resource;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import queen.underpressure.underpressure.model.Atividade;
import queen.underpressure.underpressure.model.Disciplina;
import queen.underpressure.underpressure.service.DisciplinaService;


@RestController
@RequestMapping("/disciplina")
public class DisciplinaResource {

    private final DisciplinaService disciplinaService;


    public DisciplinaResource(DisciplinaService disciplinaService) {
        this.disciplinaService = disciplinaService;

    }

    @GetMapping("/all")
    public ResponseEntity<List<Disciplina>> getAllDisciplinas() {
        List<Disciplina> disciplinas = disciplinaService.findAllDisciplinas();
        return new ResponseEntity<>(disciplinas, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Disciplina> getDisciplinaById(@PathVariable("id") Long id) {
        Disciplina disciplina = disciplinaService.findDisciplinaById(id);
        return new ResponseEntity<>(disciplina, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Disciplina> addDisciplina(@RequestBody Disciplina disciplina){
        Disciplina novaDisciplina = disciplinaService.addDisciplina(disciplina);
        return new ResponseEntity<>(disciplina, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Disciplina> updateDisciplina(@RequestBody Disciplina disciplina){
        Disciplina updateDisciplina = disciplinaService.updateDisciplina(disciplina);
        return new ResponseEntity<>(disciplina, HttpStatus.CREATED);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteDisciplina(@PathVariable("id") Long id){
        disciplinaService.deleteDisciplina(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}/atividade/all")
    public ResponseEntity<List<Atividade>> getAllAtividadesFromDisciplina(@PathVariable("id") Long id){
        Disciplina disciplina = disciplinaService.findDisciplinaById(id);
        List<Atividade> atividades = disciplina.getAtividades();
        return new ResponseEntity<>(atividades, HttpStatus.OK);

    }

    /*@GetMapping("/{id_disciplina}/atividade/{id_atividade}")
    public ResponseEntity<List<Atividade>> getAtividadeFromDisciplina(
        @PathVariable("id_disciplina") Long id_disciplina,
        @PathVariable("id_atividade") Long id_atividade
        ){
        Disciplina disciplina = disciplinaService.findDisciplinaById(id_disciplina);
        List<Atividade> atividades = disciplina.getAtividade();
        return new ResponseEntity<>(atividades, HttpStatus.OK);

    }*/

   



}
