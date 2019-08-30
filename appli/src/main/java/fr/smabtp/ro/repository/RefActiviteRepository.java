package fr.smabtp.ro.repository;


import fr.smabtp.ro.domain.RefActivite;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the RefActivite entity.
 */
@SuppressWarnings("unused")
@Repository
public interface RefActiviteRepository extends JpaRepository<RefActivite, Long> {

}
