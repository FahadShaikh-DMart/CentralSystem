package in.dmart.CentralSystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractJpaDao<T> {

	@PersistenceContext(unitName = "entityManagerFactory")
	private EntityManager entityManager;

	public T findOne(Class<T> clazz, final int id) {
		return entityManager.find(clazz, id);
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll(Class<T> clazz) {
		return entityManager.createQuery("from " + clazz.getName()).getResultList();
	}

	public T create(final T entity) {
		entityManager.persist(entity);
		return entity;
	}

	public T update(final T entity) {
		return entityManager.merge(entity);
	}
	
	public void delete(final T entity) {
		entityManager.remove(entityManager.contains(entity) ? entity : entityManager.merge(entity));
	}

	public int deleteById(Class<T> clazz, final int entityId) {
		final T entity = findOne(clazz, entityId);
		this.delete(entity);
		return entityId;
	}

}