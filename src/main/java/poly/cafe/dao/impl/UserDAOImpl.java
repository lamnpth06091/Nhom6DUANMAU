/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.cafe.dao.impl;

import poly.cafe.dao.UserDAO;
import java.util.List;
import poly.cafe.entity.Category;
import poly.cafe.entity.User;
import poly.cafe.util.XJdbc;
import poly.cafe.util.XQuery;

/**
 *
 * @author ADMIN
 */
public class UserDAOImpl implements UserDAO{
    String createSql = "…";
 String updateSql = "…";
 String deleteSql = "…";
 String findAllSql = "…";
 String findByIdSql = "…";

    @Override
    public User create(User entity) {
          Object[] values = {
    entity.getId(),
    entity.getName()
    };
      XJdbc.executeUpdate(createSql, values);
     return entity;
    }

    @Override
    public void update(User entity) {
               Object[] values = {
 entity.getName(),
 entity.getId()
 };
 XJdbc.executeUpdate(updateSql, values);
    }
x
    @Override

   public void deleteById(String id) {
 XJdbc.executeUpdate(deleteSql, id);
    }

    @Override
    public List<User> findAll() {
 return XQuery.getEntityList(User.class, findAllSql);
    }

    @Override
    public User findById(String id) {
         
 return XQuery.getSingleBean(User.class, findByIdSql, id);
    }
}
