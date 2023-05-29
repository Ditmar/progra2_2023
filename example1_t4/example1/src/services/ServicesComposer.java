package services;

public class ServicesComposer {
    private UserServices userServices;
    private StudentServices studenServices;

    public UserServices getUserServices() {
        return userServices;
    }

    public StudentServices getStudenServices() {
        return studenServices;
    }

}
