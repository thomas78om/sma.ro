package fr.smabtp.ro.web.rest;

import fr.smabtp.ro.domain.ParamExport;
import fr.smabtp.ro.service.ParamExportService;
import fr.smabtp.ro.web.rest.errors.BadRequestAlertException;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing {@link fr.smabtp.ro.domain.ParamExport}.
 */
@RestController
@RequestMapping("/api")
public class ParamExportResource {

    private final Logger log = LoggerFactory.getLogger(ParamExportResource.class);

    private static final String ENTITY_NAME = "paramExport";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final ParamExportService paramExportService;

    public ParamExportResource(ParamExportService paramExportService) {
        this.paramExportService = paramExportService;
    }

    /**
     * {@code POST  /param-exports} : Create a new paramExport.
     *
     * @param paramExport the paramExport to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new paramExport, or with status {@code 400 (Bad Request)} if the paramExport has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/param-exports")
    public ResponseEntity<ParamExport> createParamExport(@RequestBody ParamExport paramExport) throws URISyntaxException {
        log.debug("REST request to save ParamExport : {}", paramExport);
        if (paramExport.getId() != null) {
            throw new BadRequestAlertException("A new paramExport cannot already have an ID", ENTITY_NAME, "idexists");
        }
        ParamExport result = paramExportService.save(paramExport);
        return ResponseEntity.created(new URI("/api/param-exports/" + result.getId()))

                .body(result);
    }

    /**
     * {@code PUT  /param-exports} : Updates an existing paramExport.
     *
     * @param paramExport the paramExport to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated paramExport,
     * or with status {@code 400 (Bad Request)} if the paramExport is not valid,
     * or with status {@code 500 (Internal Server Error)} if the paramExport couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/param-exports")
    public ResponseEntity<ParamExport> updateParamExport(@RequestBody ParamExport paramExport) throws URISyntaxException {
        log.debug("REST request to update ParamExport : {}", paramExport);
        if (paramExport.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        ParamExport result = paramExportService.save(paramExport);
        return ResponseEntity.ok()

                .body(result);
    }

    /**
     * {@code GET  /param-exports} : get all the paramExports.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of paramExports in body.
     */
    @GetMapping("/param-exports")
    public List<ParamExport> getAllParamExports() {
        log.debug("REST request to get all ParamExports");
        return paramExportService.findAll();
    }

    /**
     * {@code GET  /param-exports/:id} : get the "id" paramExport.
     *
     * @param id the id of the paramExport to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the paramExport, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/param-exports/{id}")
    public ResponseEntity<ParamExport> getParamExport(@PathVariable Long id) {
        log.debug("REST request to get ParamExport : {}", id);
        Optional<ParamExport> paramExport = paramExportService.findOne(id);
        return null;
    }

    /**
     * {@code DELETE  /param-exports/:id} : delete the "id" paramExport.
     *
     * @param id the id of the paramExport to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */

}
