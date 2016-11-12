package br.com.core.softpet.controller;

import br.com.core.softpet.dao.FactoryDAO;
import br.com.core.softpet.dao.AnimalDAO;
import java.util.List;

public class AnimalController<Animal> implements IController<Animal> {

    private AnimalDAO animalDao = FactoryDAO.getInstanceAnimalDao();

    public void salvar(Animal animal) {
        animalDao.persist(animal);
    }

    public void alterar(Animal animal) {
        animalDao.update(animal);
    }

    public void deletar(Animal entidade) {
        animalDao.delete(entidade);
    }

    public List<Animal> procurarPorTodos(String query) {
        return animalDao.findByAll(query);
    }

    public List<Animal> procurarPorNome(String query, String nome) {
        return animalDao.findByName(query, nome);
    }
    
    public List<Animal> procurarPorParam(String query, String param, String descricao) {
        return animalDao.findByParam(query, param, descricao);
    }

    public Animal procurarPorId(String query, String nomeParametro, int id) {
        return (Animal) animalDao.findById(query, nomeParametro, id);
    }

    @Override
    public List<Animal> procurarPorId(String query, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
