package com.company.DataData;


import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Kenedid on 19-05-2017.
 */
public class Datawrapper {


  public void createbrugger(String cpr,String navn,String addrsse, String email,String age) throws SQLException{

      String sql ="INSERT Into Brugerinfo value (?,?,?,?,?)";
      PreparedStatement preparedStatement = Database.getDatabase().connection().prepareStatement(sql);
      preparedStatement.setString(1,cpr);
      preparedStatement.setString(2,navn);
      preparedStatement.setString(3,addrsse);
      preparedStatement.setString(4,email);
      preparedStatement.setString(5,age);
      Database.getDatabase().updatetheDatabase(preparedStatement);
  }


}
