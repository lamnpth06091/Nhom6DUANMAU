package poly.cafe.dao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */


import java.util.Date;
import java.util.List;
import poly.cafe.entity.Bill;

/**
 *
 * @author ADMIN
 */
public interface BillDAO extends CrudDAO<Bill, Long> {
 List<Bill> findByUsername(String username);
 List<Bill> findByCardId(Integer cardId);
 public List<Bill> findByTimeRange(Date begin, Date end);
}
