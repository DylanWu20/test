package sy.cxf.demo;

import javax.jws.WebParam;
import javax.jws.WebService;

import sy.model.base.Syuser;

@WebService
public interface WebServiceDemoI {

	public String helloWs(@WebParam(name = "userName") String name);

	public Syuser getUser(@WebParam(name = "userId") String id);

}
