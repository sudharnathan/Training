
public class ConstructorOverloading {
	String company_name;
    String emp_name;
    int emp_id;
    String working_mode;

    ConstructorOverloading()
    {
        System.out.println("Employee Details :");
    }
    ConstructorOverloading(String name, String e_name, int e_id, String mode){
        System.out.println("Employee Details :");
        this.company_name=name;
        this.emp_name=e_name;
        this.emp_id=e_id;
        this.working_mode=mode;
    }
    public void show() {
        System.out.println("company Name is :" + company_name);
        System.out.println("Employee name is :" + emp_name);
        System.out.println("employee id is :" + emp_id);
        System.out.println("working mode is :" + working_mode);
    }
}
