package med.voll.api.medico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface MedicoRepository  extends JpaRepository<Medico, Long> {

}
