//package testmvc.portlet;
//
//import testmvc.constants.TestmvcPortletKeys;
//
//import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
//
//import javax.portlet.Portlet;
//
//import org.osgi.service.component.annotations.Component;
//
///**
// * @author DEV000
// */
//@Component(
//	property = {
//		"com.liferay.portlet.display-category=category.sample",
//		"com.liferay.portlet.header-portlet-css=/css/main.css",
//		"com.liferay.portlet.instanceable=true",
//		"javax.portlet.display-name=Testmvc",
//		"javax.portlet.init-param.template-path=/",
//		"javax.portlet.init-param.view-template=/view.jsp",
//		"javax.portlet.name=" + TestmvcPortletKeys.TESTMVC,
//		"javax.portlet.resource-bundle=content.Language",
//		"javax.portlet.security-role-ref=power-user,user"
//	},
//	service = Portlet.class
//)
//public class TestmvcPortlet extends MVCPortlet {
//}