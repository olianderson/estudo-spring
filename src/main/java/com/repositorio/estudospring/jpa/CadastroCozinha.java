package com.repositorio.estudospring.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.repositorio.estudospring.domain.model.Cozinha;

@Component
public class CadastroCozinha {

	@PersistenceContext
	private EntityManager manager;
	
	public List<Cozinha> listar() {
		return manager.createQuery("from Cozinha", Cozinha.class)
				.getResultList();
	}

    // Equevalente a SELECT * FROM cozinha WHERE id=<id passado no método>
    public Cozinha buscar(Long id) {
        return manager.find(Cozinha.class, id);
    }
	
	@Transactional
	public Cozinha salvar(Cozinha cozinha) {
		cozinha = buscar(cozinha.getId());
		return manager.merge(cozinha);
	}

	@Transactional
	public void remover(Cozinha cozinha) {
		manager.remove(cozinha);
	}
}
