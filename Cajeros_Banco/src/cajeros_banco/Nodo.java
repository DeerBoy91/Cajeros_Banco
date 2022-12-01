/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeros_banco;

/**
 *
 * @author vikhu
 */
public class Nodo {
 //Declaracion de atributos
 private int dato;
 private Nodo next;
 
 //Constructor
 public Nodo(int dato){
 this.dato=dato;
 }
 
 //Metodos getter and setter
 public int getDato() 
 {
 return dato;
 }
 public void setDato(int dato) 
 {
 this.dato = dato;
 }
 public Nodo getNext() 
 {
 return next;
 }
 public void setNext(Nodo next) 
 {
 this.next = next;
 }
 
 //Metodo toString
 public String toString()
 {
 String s=" "+dato+" ";
 return s;
 }
}
