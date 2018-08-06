class WelcomeUsers{
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public void welcomeMe(){
        System.out.println("Welcome "+name);
    }
}
class FirstTest{
    public static void main(String[] args) {
        WelcomeUsers wu = new WelcomeUsers();
        wu.setName("Swamy Sriharsha");
        wu.welcomeMe();
    }
}