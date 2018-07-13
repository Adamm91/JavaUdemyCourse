package klasy_zagniezdzone;

public class KlasaZagniezdzona {
    public static void main(String[] args) {

        A a = new A();

        A.B b = a.new B(); // zeby stworzyc B nalezy najpierw stworzyc klase A

        A.C c = new A.C(); // C jest statyczne dlatego mozna ja stworzyc odrazu

    }
}

    class A {
        A() {
            System.out.println("jestem z zewnatrz");

        }

        private int test;

        class B {

            B() {
                System.out.println("jestem z wewnatrz");
            }

            void costam() {
                test = 5; // w klasie zagniezdzonej mamy dostep do wartosci z klasy zewnetrznej
            }

            private int test2;

        }

        static class C {
            C() {
                System.out.println("jestem z wewnatrz C");
            }
        }

        void costam2() {
            B b = new B();
            b.test2 = 4; // zeby miec dostep do wartosci z klasy wewnetrzej musimy stworzyc jej instancje
        }


    }

