package fundamentos;


public class Greeter {

    public static void main(String[] args) {
        String getGreeting = new Greeter().getGreeting();
        System.out.println(getGreeting);
    }

    private String getGreeting() {
        return "Hello, world";
    }
}

//@Nested
//class GreeterTest {
//    @Test
//    public void testThatGreeterReturnsTheCorrectGreeting() {
//        assertThat(new Greeter().getGreeting(), equalTo("Hello, world"));
//    }
//}