package buildertest;

public class Main {

    public static void main(String[] args) {


        User user = User.builder()
                .id("5") // UserBuilder 객체에 채워짐
                .name("baer") // UserBUilder 채워지는것
                .build();
    }
}
