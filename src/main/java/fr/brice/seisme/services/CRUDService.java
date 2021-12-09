package fr.brice.seisme.services;

import java.util.List;

/**
 * Interface Crud appliqué à LocalisationService et SeismeService
 * @param <T> pour entité
 * @param <S> pour Save
 * @param <U> pour Update
 * @param <D> pour Delete
 */

public interface CRUDService<T, S, U, D>{
    public List<T> findAll();

    public T find(String id);

    public T save(S obj);

    public T update(U obj);

    public void delete(D obj);
}
