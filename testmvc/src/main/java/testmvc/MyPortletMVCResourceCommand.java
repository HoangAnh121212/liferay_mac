package testmvc;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import org.osgi.service.component.annotations.Component;
import testmvc.constants.MyPortletKeys;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import java.io.PrintWriter;
import java.util.List;

@Component(
        property = {
                "javax.portlet.name=" + MyPortletKeys.MY_PORTLET,
                "mvc.command.name=/myportlet/get_data"
        },
        service = MVCResourceCommand.class
)
public class MyPortletMVCResourceCommand implements MVCResourceCommand {
    @Override
    public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
        MyTableService myTableService = new MyTableService();
        List<String> data = myTableService.getData();

        try {
            PrintWriter writer = resourceResponse.getWriter();
            for (String record : data) {
                writer.println(record);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
}