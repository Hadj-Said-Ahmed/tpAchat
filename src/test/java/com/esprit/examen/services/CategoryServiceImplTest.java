/*package com.esprit.examen.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
//JUNIT 4
// import org.junit.runner.RunWith;
// import static org.junit.Assert.*;
// import org.springframework.test.context.junit4.SpringRunner;
// import org.junit.Test;


//JUNIT 5
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.esprit.examen.entities.CategorieProduit;

import lombok.extern.slf4j.Slf4j;



// @RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class CategoryServiceImplTest {
	@Autowired
	ICategorieProduitService categorieProduitService;
	
	@Test
	public void testAddCategorie() throws ParseException {
		CategorieProduit cat = new CategorieProduit();
		cat.setCodeCategorie("CAT01");
		cat.setLibelleCategorie("categorie 1");
		categorieProduitService.addCategorieProduit(cat);
		log.info("categorie ajouter avec success");
	}
	
	@Test
	public void testModifierCategorie() throws ParseException {
		CategorieProduit cat = new CategorieProduit();
		cat.setCodeCategorie("CAT01");
		cat.setLibelleCategorie("categorie 1");
		categorieProduitService.addCategorieProduit(cat);
		log.info("categorie ajouter avec success");
		cat.setCodeCategorie("CAT02");
		cat.setLibelleCategorie("categorie 2");
		categorieProduitService.updateCategorieProduit(cat);
		log.info("categorie modifier avec success");
	}
	
	@Test
	public void testDeleteCategorie() throws ParseException {
		CategorieProduit cat = new CategorieProduit();
		cat.setCodeCategorie("CAT01");
		cat.setLibelleCategorie("categorie 1");
		categorieProduitService.addCategorieProduit(cat);
		categorieProduitService.deleteCategorieProduit(cat.getIdCategorieProduit());
		log.info("categorie supprimer avec success");
	}
	
	@Test
	public void testRetrieveAllCategorie() throws ParseException {
		List<CategorieProduit> listCategorie = categorieProduitService.retrieveAllCategorieProduits();
		log.info("Nombre categorie: " + listCategorie.size()+" \n");
		for(int i=0;i<listCategorie.size();i++){
			log.info(""+listCategorie.get(i).getLibelleCategorie());
		}
	}
	
}
*/