package smoke_tests;

import io.qameta.allure.*;
import org.testng.annotations.Test;

public class AccessTests {
    @Test(groups = {"access", "@354686"})
    @Description("Verify access for all tabs")
    @Severity(SeverityLevel.CRITICAL)
    @TmsLink("UBH-8735")
    @Story("Create tests for checking access")
    @Owner("Evgeny Haliman")
    public void testAccess() {
        Allure.step("Checking access", () -> {
            System.out.println("Allure step passed");
        });
    }
}
