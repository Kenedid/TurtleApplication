package com.company.Controllers;

import com.company.Models.Model;
import com.company.Models.OpretBruger;

import javax.net.ssl.SSLContext;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Kenedid on 11-06-2017.
 */
public class OpretbrugerController extends klasseController {

    public OpretbrugerController(Model model) {
        super(model);
    }

    public void createbruger(String cpr,String navn,String addrese, String email,String age) throws SQLException{
       try {
           model.createbrugger(cpr,navn,addrese,email,age);
       }catch (SQLException a){
           a.printStackTrace();
       }
    }
}
