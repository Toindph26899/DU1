 
package com.repositories;

import com.entities.HoaDon;
import java.util.List;

 
public interface IHoaDonRepo {
    List<HoaDon> getAll();
    
    HoaDon update(HoaDon hd);
    
   
}
