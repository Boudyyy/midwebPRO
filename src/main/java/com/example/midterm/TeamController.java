package com.example.midterm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TeamController {

    private final TeamService teamService;

    @Autowired
    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping(path = "/")
    public String homePage(Model model){
        List<Team> teamList = teamService.getAllTeams();
        model.addAttribute("teamList", teamList);
        model.addAttribute("team", new Team());
        return "home";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveTeam(@ModelAttribute("team") Team team){
        teamService.saveTeam(team);
        return "redirect:/";
    }

    @RequestMapping("/delete/{teamId}")
    public String deleteTeam(@PathVariable ("teamId") Long teamId){
        teamService.deleteTeam(teamId);
        return "redirect:/";
    }



}
