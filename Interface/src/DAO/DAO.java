package DAO;

import java.sql.Connection;
import java.sql.SQLException;

public abstract class DAO<T> {
    protected Connection connect = null;

    public DAO(Connection conn){
        this.connect = conn;
    }

    /**
     * Méthode de création
     * @param obj
     * @return boolean
     */
    public abstract boolean create(T obj) throws SQLException;

    /**
     * Méthode pour effacer
     * @param obj
     * @return boolean
     */
    public abstract boolean delete(T obj) throws SQLException;

    /**
     * Méthode de mise à jour
     * @param obj
     * @return boolean
     */
    public abstract boolean update(T obj);

    /**
     * Méthode de recherche des informations
     * @param id
     * @return T
     */
    public abstract T find(Object id);
}