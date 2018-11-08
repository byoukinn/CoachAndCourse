package servlet.pub;

import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public abstract class BaseServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        Handle(req, resp);
    }

    protected abstract void Handle(HttpServletRequest req, HttpServletResponse resp);

    protected Object getJson(String param, Object tmp){
        JSONObject json = JSONObject.fromObject(param);
        return JSONObject.toBean(json, tmp.getClass());
    }
}
