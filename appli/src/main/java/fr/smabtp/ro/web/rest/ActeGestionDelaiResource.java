package fr.smabtp.ro.web.rest;

import fr.smabtp.ro.domain.ActeGestionDelai;
import fr.smabtp.ro.service.ActeGestionDelaiService;
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
 * REST controller for managing {@link fr.smabtp.ro.domain.ActeGestionDelai}.
 */
@RestController
@RequestMapping("/api")
public class ActeGestionDelaiResource {

    private final Logger log = LoggerFactory.getLogger(ActeGestionDelaiResource.class);

    private static final String ENTITY_NAME = "acteGestionDelai";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final ActeGestionDelaiService acteGestionDelaiService;

    public ActeGestionDelaiResource(ActeGestionDelaiService acteGestionDelaiService) {
        this.acteGestionDelaiService = acteGestionDelaiService;
    }

    /**
     * {@code POST  /acte-gestion-delais} : Create a new acteGestionDelai.
     *
     * @param acteGestionDelai the acteGestionDelai to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new acteGestionDelai, or with status {@code 400 (Bad Request)} if the acteGestionDelai has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/acte-gestion-delais")
    public ResponseEntity<ActeGestionDelai> createActeGestionDelai(@RequestBody ActeGestionDelai acteGestionDelai) throws URISyntaxException {
        log.debug("REST request to save ActeGestionDelai : {}", acteGestionDelai);
        if (acteGestionDelai.getId() != null) {
            throw new BadRequestAlertException("A new acteGestionDelai cannot already have an ID", ENTITY_NAME, "idexists");
        }
        ActeGestionDelai result = acteGestionDelaiService.save(acteGestionDelai);
        return ResponseEntity.created(new URI("/api/acte-gestion-delais/" + result.getId()))

                .body(result);
    }

    /**
     * {@code PUT  /acte-gestion-delais} : Updates an existing acteGestionDelai.
     *
     * @param acteGestionDelai the acteGestionDelai to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated acteGestionDelai,
     * or with status {@code 400 (Bad Request)} if the acteGestionDelai is not valid,
     * or with status {@code 500 (Internal Server Error)} if the acteGestionDelai couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/acte-gestion-delais")
    public ResponseEntity<ActeGestionDelai> updateActeGestionDelai(@RequestBody ActeGestionDelai acteGestionDelai) throws URISyntaxException {
        log.debug("REST request to update ActeGestionDelai : {}", acteGestionDelai);
        if (acteGestionDelai.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        ActeGestionDelai result = acteGestionDelaiService.save(acteGestionDelai);
        return ResponseEntity.ok()

                .body(result);
    }

    /**
     * {@code GET  /acte-gestion-delais} : get all the acteGestionDelais.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of acteGestionDelais in body.
     */
    @GetMapping("/acte-gestion-delais")
    public List<ActeGestionDelai> getAllActeGestionDelais() {
        log.debug("REST request to get all ActeGestionDelais");
        return acteGestionDelaiService.findAll();
    }

    /**
     * {@code GET  /acte-gestion-delais/:id} : get the "id" acteGestionDelai.
     *
     * @param id the id of the acteGestionDelai to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the acteGestionDelai, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/acte-gestion-delais/{id}")
    public ResponseEntity<ActeGestionDelai> getActeGestionDelai(@PathVariable Long id) {
        log.debug("REST request to get ActeGestionDelai : {}", id);
        Optional<ActeGestionDelai> acteGestionDelai = acteGestionDelaiService.findOne(id);
        return null;
    }


}
