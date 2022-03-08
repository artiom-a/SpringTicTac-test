package ru.tiktaktoe.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.tiktaktoe.repository.GameInstanceRepo;
import ru.tiktaktoe.entity.GameInstance;
import ru.tiktaktoe.entity.ListedGameSimpleForm;

import java.util.ArrayList;


/**
 * Controller for the template-driven html frontend
 */

@Controller
public class TemplateController {
    @Autowired
    private GameInstanceRepo gameInstanceRepo;

    @RequestMapping("/")
    public Object menu(Model model){
        ArrayList<ListedGameSimpleForm> newGames = new ArrayList<>();

        for (GameInstance item: gameInstanceRepo.findAll()) {
            if (item.getPlayers().size()==1){
                newGames.add(new ListedGameSimpleForm(item.getId(),item.getPlayers().get(0).getName()));
            }
        }
        model.addAttribute("newGames",newGames);
        return "mainMenu";
    }

    @RequestMapping("/game/")
    public Object gamePlay(Model model){
        return "gameplayArea";
    }
}
