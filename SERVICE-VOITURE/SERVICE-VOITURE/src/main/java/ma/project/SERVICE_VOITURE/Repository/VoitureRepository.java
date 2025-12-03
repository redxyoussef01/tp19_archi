package ma.project.SERVICE_VOITURE.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.project.SERVICE_VOITURE.entities.Voiture;



@Repository
public interface VoitureRepository extends JpaRepository<Voiture, Long> {

	List<Voiture> findByClientId(Long id);

	}
