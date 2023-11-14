package com.example.sping_portfolio.Minilab.Minilab4.Shekar;

//imports

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import java.util.ArrayList;


@Controller
public class SKcontroller {
    @GetMapping("/backend")
    //@RequestParam pulls data from frontend
    public String backend(@RequestParam(name="num0", required=false, defaultValue="0") ArrayList<Integer> num0, @RequestParam(name="num2", required=false, defaultValue="0") ArrayList<Integer> num2,
                      Model model){


        summation mySum = new summation(num0);
        summation2 mySigma = new summation2(num2);

        model.addAttribute("sum", mySum.findsum());
        model.addAttribute("sum2", mySigma.sigma());

        //renders  template
        return "Minilab/ratingsource";
    }



}
