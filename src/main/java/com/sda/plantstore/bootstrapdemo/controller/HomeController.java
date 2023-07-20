package com.sda.plantstore.bootstrapdemo.controller;

import java.time.LocalDate;
import java.util.List;

import com.sda.plantstore.bootstrapdemo.dto.ColorDto;
import com.sda.plantstore.bootstrapdemo.dto.PersonDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//http://localhost:8080
@Controller
@RequestMapping("/")
public class HomeController {

    //http://localhost:8080
    @GetMapping
    public String home(Model model) {
        model.addAttribute("people", generateSimplePeopleData());
        model.addAttribute("colors", generateSimpleColorDtos());
        model.addAttribute("newPerson", new PersonDto());
        return "home";
    }

    @PostMapping("/person/add")
    public String addPerson(@ModelAttribute PersonDto personDto) {
        System.out.println(personDto);
        return "redirect:/";
    }

    private List<PersonDto> generateSimplePeopleData() {
        return List.of(new PersonDto("Anna", "Nowak", LocalDate.of(1980, 11, 10), "Księgowa", "niebieski"),
                       new PersonDto("Adam", "Kowalczyk", LocalDate.of(1990, 8, 27), "Programista", "pomarańczowy"),
                       new PersonDto("Krystyna", "Nowakowska", LocalDate.of(1985, 6, 17), "Tester", "pomarańczowy"),
                       new PersonDto("Przemysław", "Smith", LocalDate.of(1996, 7, 26), "Analityk", "czarny"),
                       new PersonDto("Dorota", "Kuśmierek", LocalDate.of(1994, 4, 12), "Analityk", "niebieski"),
                       new PersonDto("Błażej", "Wypych", LocalDate.of(1981, 1, 2), "Sprzedawca", "zielony"));
    }

    private List<ColorDto> generateSimpleColorDtos() {
        return List.of(new ColorDto("czarny"), new ColorDto("niebieski"), new ColorDto("zielony"), new ColorDto("pomarańczowy"));
    }
}
