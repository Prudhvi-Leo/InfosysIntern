package module.two.service;
import module.one.service.ModuleOneService;
public class ModuleTwoService {
	
	static ModuleOneService modOneServ = new ModuleOneService();
	
	public static void main(String[] args) {
		modOneServ.externalAccessible("Module Two Service");
	}
}
