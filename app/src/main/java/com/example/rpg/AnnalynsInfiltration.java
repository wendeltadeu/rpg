/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarefaum;
import java.util.Scanner; // import the Scanner class 

/**
 *
 * @author isa_p
 */
public class AnnalynsInfiltration {
    public static boolean checkSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if(archerIsAwake ==true) {
            return true;
        }
        return false;
    }
    
    public static String checkSignalPrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if(prisonerIsAwake == false) {
            return "";
        } else if (knightIsAwake ==true) {
            return "O cavaleiro esta acordado!";
        } 
         return "O cavaleiro esta acordado? " + knightIsAwake + "\n O arqueiro esta acordado? " + 
                archerIsAwake + "\n O prisioneiro esta acordado? " + prisonerIsAwake;
    } 
    
    public static boolean actionAttack(boolean knightIsAwake) {
        if(knightIsAwake ==true){
            return true;
        } 
        return false;
    }
    
    public static boolean actionFreePrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if(archerIsAwake == false && prisonerIsAwake == true) {
            return true;
        }
        return false;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        //dois menus um para verificação [0,1] e um para ação [0,1]
        Scanner myObjOne = new Scanner(System.in);
        Scanner myObjTwo = new Scanner(System.in);
        int optionOne;
        int optionTwo;
        boolean knightIsAwake = false;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = true;       
    
        // Enter username and press Enter
        System.out.println("Escolha a funcao de verificacao:\n" 
                + " Digite 0 para funcao de Espiar (checkSpy())\n" 
                + " Digite 1 para funcao de Assoviar para o prisioneiro (checkSignalPrisoner())"); 
        optionOne = myObjOne.nextInt();   
        switch (optionOne) {
            case 0:
                //checkSpy()
                if(checkSpy(knightIsAwake, archerIsAwake, prisonerIsAwake)) {
                    System.out.println("O arqueiro está acordado!");
                } else {
                    System.out.println("O arqueiro nao esta acordado!\n"
                            + " O cavaleiro esta acordado?" + archerIsAwake
                            + "\n O prisioneiro esta acordado?" + prisonerIsAwake);
                }   break;
            case 1:
                //checkSignalPrisoner()
                System.out.println(checkSignalPrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake));
                break;
            default:
                System.out.println("Opção incorreta!");
                break;
        }
        System.out.println("Escolha a funcao de acao:\n" 
                + " Digite 0 para funcao de Atacar(actionAttack())\n" 
                + " Digite 1 para funcao de Libertar Prisioneiro(actionFreePrisoner())"); 
        optionTwo = myObjTwo.nextInt();  
        switch (optionTwo) {
            case 0:
                //actionAttack()
                if(actionAttack(knightIsAwake)) {
                    System.out.println("O cavaleiro está acordado! Seu ataque falhou!");
                } else {
                    System.out.println("O cavaleiro nao esta acordado! Seu ataque foi bem sucedido!");
                }   break;
            case 1:
                //actionFreePrisoner()
                if(actionFreePrisoner(archerIsAwake, prisonerIsAwake)) {
                    System.out.println("O arqueiro nao está acordado! Seu ataque foi bem sucedido!");
                } else {
                    System.out.println("O arqueiro esta acordado ou o prisioneiro nao esta acordado! Seu ataque falhou!");
                }   break;
            default:
                System.out.println("Opção incorreta! Reinicie o jogo!");
                break;
        }
    } 
}


