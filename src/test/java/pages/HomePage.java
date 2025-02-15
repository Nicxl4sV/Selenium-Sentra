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
    private String tituloTask = "//input[@id=\"title\"]";
    private String descripcionTask = "//textarea[@id=\"title\"]";
    private String buttonTaskCreate = "//button[text()=\"Crear Tarea\"]";
    private String taskCreateSuccess = "//div[@role=\"alert\"]";
    private String fechaTask = "//label[text()=\"Fecha Vencimiento\"]//following-sibling::div/input";
    private String prioridadTask ="//label[text()=\"Prioridad\"]//following-sibling::div/input";

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
         write(tituloTask, titulo);
         write(descripcionTask, descripcion);
         write(fechaTask, fechaDeVencimiento);
         write(prioridadTask, prioridad);
         
    }

    public void clickTaskCreate() {
        clickElement(buttonTaskCreate);
    }

    public boolean taskCreateSuccess() {
        System.out.println(elementIsDisplayed(taskCreateSuccess));
        return elementIsDisplayed(taskCreateSuccess);
    }
}
