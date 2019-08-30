package fr.smabtp.ro.repository;

import fr.smabtp.ro.domain.RefGroupeActivite;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the RefGroupeActivite entity.
 */
@SuppressWarnings("unused")
@Repository
public interface RefGroupeActiviteRepository extends JpaRepository<RefGroupeActivite, Long> {

}
