import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ActionTest extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        LoginForm loginForm = (LoginForm)form;
        String userName = loginForm.getUserName();
        String password = loginForm.getPassword();
        if ("zhang".equals(userName) && "123".equals(password))
            return mapping.findForward("success");
        else
            return mapping.findForward("fail");
    }
}
