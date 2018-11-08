package servlet.user;

import handle.user.LoginHandle;
import net.sf.json.JSONObject;
import pojo.user.User;
import servlet.pub.BaseServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



/**
 * 接收返回登录操作
 */

@WebServlet("/servlet/user/login")
public class LoginServlet extends BaseServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    protected void Handle(HttpServletRequest req, HttpServletResponse resp){

        User user = (User) getJson(req.getParameter("user"), User.class);
        System.out.println(user.toString());
        try{
            if(new LoginHandle().confirm(user)){
                resp.getWriter().print("RESULT_OK");
            }else{
                resp.getWriter().print("RESULT_FAILED");
            }
        }catch (Exception e){

        }
    }
}
