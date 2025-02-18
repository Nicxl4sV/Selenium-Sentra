package pages;

public class HomePage extends BasePage {

    public HomePage() {
        super();
    }

    private String homeText = "//div[text()=\"Home\"]";
    private String buttonHome = "//span[text()=\"Home\"]";
    private String titleGrid = "//th/span[contains(text(),'T')]";
    private String expireDateGrid = "//th/span[contains(text(),'Fecha Venc')]";
    private String priorityGrid = "//th/span[contains(text(),'Prio')]";
    private String validateOrder = "//th[@aria-sort]";

    public boolean NavigateHome() {
        return elementIsDisplayed(homeText);

    }

    public void clickHome() {
        clickElement(buttonHome);
    }

    public void descClickOnGrid(String option) {
        option = option.toLowerCase();

        if (option.equals("titulo")) {
            clickElement(titleGrid);

        } else if (option.equals("prioridad")) {
            clickElement(priorityGrid);
            clickElement(priorityGrid);
        } else if (option.equals("fecha vencimiento")) {
            clickElement(expireDateGrid);
            clickElement(expireDateGrid);
        }
    }

    public void ascClickOnGrid(String option) {
        option = option.toLowerCase();

        if (option.equals("titulo")) {
            clickElement(titleGrid);
            clickElement(titleGrid);
        } else if (option.equals("prioridad")) {
            clickElement(priorityGrid);
        } else if (option.equals("fecha vencimiento")) {
            clickElement(expireDateGrid);
        }
    }

    public String validateOrder() {
        return attributeAriaSortFromElement(validateOrder);
    }

}
