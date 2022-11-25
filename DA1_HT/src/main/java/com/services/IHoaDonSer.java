/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.services;

import com.custommodel.QLHoaDon;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IHoaDonSer {

    List<QLHoaDon> getAll();

    QLHoaDon update(QLHoaDon hd);
}
