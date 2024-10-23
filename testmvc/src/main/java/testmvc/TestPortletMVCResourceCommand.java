//package testmvc;
//
//import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
//import org.osgi.service.component.annotations.Component;
//
//import javax.portlet.ResourceRequest;
//import javax.portlet.ResourceResponse;
//import java.io.PrintWriter;
//import java.util.List;
//
//@Component(
//        immediate = true,
//        property = {
//                "javax.portlet.name=testmvc",
//                "mvc.command.name=/test/get_data"
//        },
//        service = MVCResourceCommand.class
//)
//public class TestPortletMVCResourceCommand implements MVCResourceCommand {
//    @Override
//    public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
//        TestTableService testTableService = new TestTableService();
//        List<String> data = testTableService.getData();
//
//        try {
//            PrintWriter writer = resourceResponse.getWriter();
//            for (String record : data) {
//                writer.println(record);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return true;
//    }
//}