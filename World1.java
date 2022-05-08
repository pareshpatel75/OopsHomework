package Inheritance1;

public class World1 {
    void World() {
        System.out.println("World is Fantastic place to live");
    }}
    class India extends World1{
        void Gujarat(){
            System.out.println("Gujarat is peaceful place");
        }}
        class England extends India{
            void London(){
                System.out.println("Its a Capital City");
            }}
            class Usa extends England {
                void Newyork() {
                    System.out.println("Its a Larger city of usa");
                }
                public static void main(String[] args) {
                 Usa u= new Usa();
                 u.Newyork();
                 u.Gujarat();
                 u.London();
                 u.World();
                }
            }



