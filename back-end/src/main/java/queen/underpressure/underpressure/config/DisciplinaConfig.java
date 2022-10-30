package queen.underpressure.underpressure.config;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import queen.underpressure.underpressure.model.Atividade;
import queen.underpressure.underpressure.model.Disciplina;
import queen.underpressure.underpressure.repository.DisciplinaRepository;

@Configuration
public class DisciplinaConfig {

    @Bean
    CommandLineRunner commandLineRunner(DisciplinaRepository disciplinaRepository) {
        return args -> {
            Atividade a1 = new Atividade("Atividade 1", "Descrição Atividade 1", LocalDateTime.now(), 10,
                    UUID.randomUUID().toString());
            Atividade a2 = new Atividade("Atividade 2", "Descrição Atividade 2", LocalDateTime.now().plusWeeks(2), 10,
                    UUID.randomUUID().toString());
            Atividade a3 = new Atividade("Atividade 3", "Descrição Atividade 3", LocalDateTime.now().plusWeeks(3), 10,
                    UUID.randomUUID().toString());
            Atividade a4 = new Atividade("Atividade 4", "Descrição Atividade 4", LocalDateTime.now().plusWeeks(4), 10,
                    UUID.randomUUID().toString());

            Disciplina d1 = new Disciplina("Ciencias", "Joseph", UUID.randomUUID().toString());
            Disciplina d2 = new Disciplina("Matemática", "Jonathan", UUID.randomUUID().toString());
            d1.addAtividade(a1);
            d1.addAtividade(a2);
            d2.addAtividade(a3);
            d2.addAtividade(a4);
            disciplinaRepository.saveAll(List.of(d1, d2));
        };
    }
}
