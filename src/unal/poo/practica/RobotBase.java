package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class RobotBase
{    
    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
          public static void turn180(){
          for(int n=1;n<3;n++) estudiante.turnLeft();
          
          }
          public static void turnRight (){
         for (int n=0;n<3;n++) estudiante.turnLeft();
              
          }
          public static void move3(){
          for(int n=0;n<3;n++)estudiante.move(); }
           public static void move2(){
          for(int n=0;n<2;n++)estudiante.move(); }
          
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,0, 2, Direction.WEST,10);
            
           turn180();
	estudiante.move();
             turnRight(); 
             move3();
             turnRight();
             move3();
             turnRight();
             move3();
             turnRight();
             move2();
             turn180();
          }
        }

