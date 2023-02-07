package org.launchcode.studio10.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping("")
    @ResponseBody
    public String homePage(){
        return "<html>" +
                "<head>" +
                    "<h1>Skills Tracker</h1>" +
                "</head>" +
                "<body>" +
                    "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                    "<ol>" +
                        "<li>Java</li>" +
                        "<li>Javascript</li>" +
                        "<li>Python</li>" +
                    "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/form")
    @ResponseBody
    public String formToFillOut(){
        return "<html>" +
                "<body>" +
                    "<form method = 'post' action = '/form'>" +
                        "<label for = 'name'>Name: </label><br>" +
                        "<input type='text' id='name'><br>" +
                        "<label for = 'firstFav'>My favorite language: </label><br>" +
                        "<select name='firstFav' id='firstFav'>" +
                            "<option value='python'>Python</option>" +
                            "<option value='java'>Java</option>" +
                            "<option value='javascript'>Javascript</option>" +
                            "<option value='php'>PHP</option>" +
                            "<option value='c++'>C++</option>" +
                        "</select><br>" +
                        "<label for = 'secondFav'>My second favorite language: </label><br>" +
                        "<select name='secondFav' id='secondFav'>" +
                            "<option value='python'>Python</option>" +
                            "<option value='java'>Java</option>" +
                            "<option value='javascript'>Javascript</option>" +
                            "<option value='php'>PHP</option>" +
                            "<option value='c++'>C++</option>" +
                        "</select><br>" +
                        "<label for = 'thirdFav'>My third favorite language: </label><br>" +
                        "<select name='thirdFav' id='thirdFav'>" +
                            "<option value='python'>Python</option>" +
                            "<option value='java'>Java</option>" +
                            "<option value='javascript'>Javascript</option>" +
                            "<option value='php'>PHP</option>" +
                            "<option value='c++'>C++</option>" +
                        "</select><br><br>" +
                        "<input type='submit' value='Submit'>" +
                    "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("/form")
    @ResponseBody
    public String formResults(@RequestParam String name, @RequestParam String firstFav, @RequestParam String secondFav, @RequestParam String thirdFav){
        return "<html>" +
                "<head>" +
                    "<h1>" + name + "</h1>" +
                "</head>" +
                "<body>" +
                    "<ol>" +
                        "<li>" + firstFav + "</li>" +
                        "<li>" + secondFav + "</li>" +
                        "<li>" + thirdFav + "</li>" +
                    "</ol>" +
                "</body>" +
                "</html>";
    }
}
