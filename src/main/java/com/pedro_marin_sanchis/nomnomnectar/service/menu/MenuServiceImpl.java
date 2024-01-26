package com.pedro_marin_sanchis.nomnomnectar.service.menu;

import com.pedro_marin_sanchis.nomnomnectar.model.Menu;
import com.pedro_marin_sanchis.nomnomnectar.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuServiceImpl implements IMenuService {

    private final MenuRepository menuRepository;

    @Autowired
    public MenuServiceImpl(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public List<Menu> getAllMenus() {
        return menuRepository.findAll();
    }

    public Optional<Menu> getMenuById(Long id) {
        return menuRepository.findById(id);
    }

    public Menu createMenu(Menu menu) {
        return menuRepository.save(menu);
    }

    public Menu updateMenu(Long id, Menu updatedMenu) {
        Optional<Menu> existingMenu = menuRepository.findById(id);

        if (existingMenu.isPresent()) {
            Menu menuToUpdate = existingMenu.get();
            menuToUpdate.setName(updatedMenu.getName());
            menuToUpdate.setPrice(updatedMenu.getPrice());
            menuToUpdate.setProducts(updatedMenu.getProducts());
            menuToUpdate.setImageReference(updatedMenu.getImageReference());
            return menuRepository.save(menuToUpdate);
        } else {
            return null;
        }
    }

    public void deleteMenu(Long id) {
        menuRepository.deleteById(id);
    }

}
