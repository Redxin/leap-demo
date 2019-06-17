package demo.controller;

import leap.web.view.ViewData;

public class HomeController {
    public void index(ViewData vd, String name){
        vd.put("name", name);
    }
}