/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.cafe.util;

import poly.cafe.entity.User;

/**
 *
 * @author Admin
 */
public class XAuth {
public static User user = User.builder()
.username("Phuclam456")
.password("123")
.enabled(true)
.manager(true)
.fullname("Nguyen Phuc Lam")
.photo("trump.png")
.build(); // biến user này sẽ được thay thế sau khi đăng nhập
}