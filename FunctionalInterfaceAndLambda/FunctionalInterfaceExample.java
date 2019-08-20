
@FunctionalInterface
interface CreateName{
    public String makeName(String firstName, String lastName);
}

class FunctionalInterfaceExample{
    public static void main(String args[]){

        CreateName dan = (String firstName, String lastName) -> {return String.format("%s %s", firstName, lastName); };

        String ans = dan.makeName("Dan", "Krueger");
        System.out.println(ans);
    }
}