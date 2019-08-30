package fr.smabtp.ro.repository;

import fr.smabtp.ro.domain.ParamExport;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the ParamExport entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ParamExportRepository extends JpaRepository<ParamExport, Long> {

}
