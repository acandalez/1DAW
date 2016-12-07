/*
var nrocuenta;
  var nombre;
  var saldo=0;
  var saldoacre=0;
  do {
    nrocuenta=prompt('Ingrese nro de cuenta:','');    
    nrocuenta=parseInt(nrocuenta);
    if (nrocuenta>=0)
    {
      nombre=prompt('Nombre del cliente:');
      saldo=prompt('Saldo actual:','');
      saldo=parseInt(saldo);
      if (saldo>0)
      {
        saldoacre=saldoacre+saldo;
        document.write(nombre+' tiene saldo acreedor<br>');
      }
      else
      {
        if (saldo<0)
        {
          document.write(nombre+' tiene saldo deudor<br>');
        }
        else
        {
          document.write(nombre+' tiene saldo nulo<br>');
        }
      }
      
    }
  }while(nrocuenta>0);
  document.write('Suma total de saldos acreedores:'+saldoacre);
 */
package tema3.practicaobligatoria;

import java.util.Scanner;

/**
 En un banco se procesan datos de las cuentas corrientes de sus clientes. De cada cuenta corriente se conoce: número de cuenta y saldo actual. El ingreso de datos debe finalizar al ingresar un valor negativo en el número de cuenta.
Se pide confeccionar un programa que lea los datos de las cuentas corrientes e informe:
a)De cada cuenta: número de cuenta y estado de la cuenta según su saldo, sabiendo que:

Estado de la cuenta	'Acreedor' si el saldo es >0.
			'Deudor' si el saldo es <0.
			'Nulo' si el saldo es =0.
b) La suma total de los saldos acreedores.

 * @author Alexander Acanda
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ncuenta = 0, saldo, saldoAcreedor = 0;
         Scanner sc = new Scanner(System.in);
        
        for(int i=0; ncuenta >= 0; i++){
            System.out.println("Ingrese numero de cuenta");
            ncuenta=sc.nextInt();
            System.out.println("Ingrese el saldo");
            saldo=sc.nextInt();
            
            if (saldo>0){
                saldoAcreedor=saldoAcreedor+saldo;
                System.out.println("Tiene un saldo positivo de "+saldoAcreedor);
            }else if(saldo<0){
            	
            	System.out.println("saldo deudor "+saldoAcreedor);
            }else
            {
                System.out.println("Tiene un saldo nulo");
            }
            
        }
        System.out.println("el saldo total de los acreedores es de "+saldoAcreedor);
        }
    }
    

