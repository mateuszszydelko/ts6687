package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile uzytkownik : Adres serwisu</p>
     */
    public static Object url
     
    /**
     * <p>Profile uzytkownik : Login uzytkownika</p>
     */
    public static Object login_id
     
    /**
     * <p>Profile uzytkownik : Haslo uzytkownika</p>
     */
    public static Object pwd
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            url = selectedVariables['url']
            login_id = selectedVariables['login_id']
            pwd = selectedVariables['pwd']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
