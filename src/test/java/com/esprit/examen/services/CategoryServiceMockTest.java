/*package com.esprit.examen.services;

import static org.junit.Assert.assertNotNull;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.esprit.examen.entities.CategorieProduit;
import com.esprit.examen.repositories.CategorieProduitRepository;

@SpringBootTest
public class CategoryServiceMockTest {
	
	@Mock
	CategorieProduitRepository cRepo;
	
	@InjectMocks
	CategorieProduitServiceImpl cServ;
	
	@Test
	public void testGetCategory(){
		
		CategorieProduit cat = new CategorieProduit();
		cat.setIdCategorieProduit(1L);
		cat.setCodeCategorie("CAT01");
		cat.setLibelleCategorie("categorie 1");
		
		Mockito.when(cRepo.findById(Mockito.anyLong())).thenReturn(Optional.of(cat));
		assertNotNull(cServ.retrieveCategorieProduit(1L));
	}

}
*/
