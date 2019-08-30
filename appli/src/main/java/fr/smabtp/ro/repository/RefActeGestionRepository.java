package fr.smabtp.ro.repository;

import fr.smabtp.ro.domain.RefActeGestion;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the RefActeGestion entity.
 */
@SuppressWarnings("unused")
@Repository
public interface RefActeGestionRepository extends JpaRepository<RefActeGestion, Long> {

}
