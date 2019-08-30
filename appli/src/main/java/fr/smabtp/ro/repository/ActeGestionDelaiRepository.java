package fr.smabtp.ro.repository;
import fr.smabtp.ro.domain.ActeGestionDelai;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the ActeGestionDelai entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ActeGestionDelaiRepository extends JpaRepository<ActeGestionDelai, Long> {

}
