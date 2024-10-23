package testmvc.entty;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import org.osgi.service.component.annotations.Component;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=UserPortlet",
                "javax.portlet.display-name=User Portlet",
                "javax.portlet.init-param.template-path=/",
                "javax.portlet.init-param.view-template=/view.jsp",
                "javax.portlet.security-role-ref=power-user,user"
        },
        service = Portlet.class
)
public class UserPortlet extends MVCPortlet {

    private UserDAO userDAO;

    public UserPortlet() throws SQLException {
        userDAO = new UserDAO();
    }

    @Override
    public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
        try {
            List<User> users = userDAO.getAllUsers();
            renderRequest.setAttribute("users", users);
            System.out.println(users);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        super.doView(renderRequest, renderResponse);
    }

    // Add methods for add, update, and delete actions
}