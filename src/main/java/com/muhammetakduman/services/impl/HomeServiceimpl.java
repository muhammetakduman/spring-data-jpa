package com.muhammetakduman.services.impl;

import com.muhammetakduman.dto.DtoHome;
import com.muhammetakduman.dto.DtoRoom;
import com.muhammetakduman.entities.Home;
import com.muhammetakduman.entities.Room;
import com.muhammetakduman.repository.HomeRepository;
import com.muhammetakduman.services.IHomeServices;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HomeServiceimpl implements IHomeServices {

    @Autowired
    private HomeRepository homeRepository;

    public DtoHome findHomeById(Long id){
    DtoHome dtoHome = new DtoHome();
    Optional<Home> optional = homeRepository.findById(id);
    if (optional.isEmpty()){
        return null;
    }
    Home dbHome = optional.get();
    List<Room> dbRooms = optional.get().getRoom();

    BeanUtils.copyProperties(dbHome,dtoHome);

    if (dbRooms != null && !dbRooms.isEmpty()){
        for (Room room : dbRooms){
            DtoRoom dtoRoom = new DtoRoom();
            BeanUtils.copyProperties(room,dtoRoom);
            dtoHome.getRooms().add(dtoRoom);
        }
    }

    return dtoHome;
    }
}
