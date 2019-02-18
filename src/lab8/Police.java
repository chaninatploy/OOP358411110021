package lab8;

public class Police extends Person {
    private String workCountry;

    //con

    public Police(String pID, String name, String yearBorn, String workCountry) {
        super(pID, name, yearBorn);
        this.workCountry = workCountry;
    }

    //get

    public String getWorkCountry() {
        return workCountry;
    }

    public void setWorkCountry(String workCountry) {
        this.workCountry = workCountry;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I'm a police and work in " + workCountry + ".");

    }





}//class
