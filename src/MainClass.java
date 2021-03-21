public class MainClass {
    public static void main(String[] args) {

        Employee employeeFerhat = new Employee("ferhat", 33, 5467, "gonya", 3433,
                "örtmen");
        Employee employeeRecep = new Employee("serhan", 34, 5467, "gayseri", 2000,
                "örtmen");
        Employee employeeFatih = new Employee("orhan", 66, 5467, "muğla", 1500,
                "örtmen");

        System.out.println(employeeFerhat.getAddress());
        System.out.println(employeeFatih.getSalary());
        System.out.println(employeeRecep.getPhoneNumber());
    }
}
