package com.pedro_marin_sanchis.nomnomnectar.service.menu;

import com.pedro_marin_sanchis.nomnomnectar.model.Menu;

import java.util.List;
import java.util.Optional;

public interface IMenuService {
    List<Menu> getAllMenus();
    Optional<Menu> getMenuById(Long id);
    Menu createMenu(Menu menu);
    Menu updateMenu(Long id, Menu updatedMenu);
    void deleteMenu(Long id);
}
