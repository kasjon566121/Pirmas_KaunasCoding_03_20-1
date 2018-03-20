// Visas darbas vyksta sioje klaseje
public class MyFirstClass {
    // psvm greitai sukuria main metoda
    // metodai rasomi is mazosios, todel main is mazosios raides
    public static void main(String[] args){
        // isveda teksta i konsole
        // sout - greitai atspausdina
        System.out.println("Hello world");
        // metodo kvietimas maine

        int a = 10;

        // sukurtas objektas
        // tipas pavadinimas = new tipas
        MyFirstClass myFirstClass = new MyFirstClass();

        // per objekta kvieciamas metodas
        // ne statinis kvieciamas statiniame per klases objekta
        myFirstClass.myNotStaticMethod(a);

        // tiesiogiai per varda toje pacioje klaseje
        myStaticMethod();

        // float visada su f
        float b = 4.6f;

        // galima pridet d, bet nebutina
        double c = 2.4;

        // saugo true arba false(1 bito)
        boolean d = true;

        // viena raide, simbolis
        char e = 'A';

        // Javoj string neturi atskiro tipo, todel naudoja klase ir rasomas is didziosios(nes klase)
        String f = "This is string!!!";
    }
    // kitas metodas
    private void myNotStaticMethod(int numb){
        System.out.println("Jusu skaicius" + numb);
    }

    // kitas metodas
    private static void myStaticMethod(){
        System.out.println("Cia yra statinis metodas");
    }
}
// GIT komandos
// git init
// git add .
// git commit -m "TEKSTAS"
// git remote add origin