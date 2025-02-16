package pages;

public class HomePage extends BasePage {

    public HomePage() {
        super(driver);
    }

    private String homeText = "//div[text()=\"Home\"]";
    private String buttonHome = "//span[text()=\"Home\"]";
    private String getTable = "//a[@role=\"checkbox\"]";
    private String taskCreateModal = "//h2[text()=\"Crear nueva Tarea\"]";
    private String buttonTaskNew = "//button[text()=\"Nueva Tarea\"]";
    private String titleTask = "//input[@id=\"title\"]";
    private String descriptionTask = "//textarea[@id=\"title\"]";
    private String buttonTaskCreate = "//button[text()=\"Crear Tarea\"]";
    private String taskCreateSuccess = "//div[@role=\"alert\"]";
    private String dateTask = "//label[text()=\"Fecha Vencimiento\"]//following-sibling::div/input";
    private String priorityTask = "//label[text()=\"Prioridad\"]//following-sibling::div/input";
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

    public boolean TaskList() {
        return elementIsDisplayed(getTable);

    }

    public void clickTaskNew() {
        clickElement(buttonTaskNew);
    }

    public boolean taskCreateWindow() {
        return elementIsDisplayed(taskCreateModal);
    }

    public void fillNewTask(String titulo, String descripcion, String fechaDeVencimiento, String prioridad) {
        write(titleTask, titulo);
        write(descriptionTask, descripcion);
        write(dateTask, fechaDeVencimiento);
        write(priorityTask, prioridad);

    }

    public void clickTaskCreate() {
        clickElement(buttonTaskCreate);
    }

    public boolean taskCreateSuccess() {
        System.out.println(elementIsDisplayed(taskCreateSuccess));
        return elementIsDisplayed(taskCreateSuccess);
    }
    public void clickOnGrid(String option) {
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
    
    public void doubleClickOnGrid(String option) {
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
    
    