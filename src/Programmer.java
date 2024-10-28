public class Programmer {
    public String name;
    public String company;
    public String position = "intern";

    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getPosition() {
        return position;

    }

    public void work() {
        switch (position) {
            case "intren":
                position = "junior";
                break;
            case "junior":
                position = "middle";
                break;
            case "senior":
                position = "lead";
                break;
        }
    }
}
