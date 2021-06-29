package pe.edu.upeu.mhc.examenmhc;
import pe.edu.upeu.mhc.utils.LeerTeclado;

public class Resolucion {

    public static void EmpresaCoches() {
        System.out.println("Sistema para conocer el impuesto que pagará por los vehiculos");
        LeerTeclado teclado=new LeerTeclado();
        int totalcoches, categoria;
        double precio, totalimpuesto1=0, impuesto1=0, totalimpuesto2=0, impuesto2=0, impuesto3=0, totalimpuesto3=0, preciofinal=0;
        totalcoches=teclado.leer(0,"Cantidad total de coches :");
        
        for (int i=1; i <= totalcoches ; i++){
            precio=teclado.leer(0,"Precio del coche "+i+":");
            categoria=teclado.leer(0,"Categoria del coche 1 2 o 3:");
            switch(categoria){
            case 1: impuesto1=precio*0.12;
                System.out.println("El impuesto a pagar por este coche es de: "+impuesto1);
                break;
            case 2: impuesto2=precio*0.08;
                System.out.println("El impuesto a pagar por este coche es de: "+impuesto2);
                break;
            case 3: impuesto3=precio*0.05;
                System.out.println("El impuesto a pagar por este coche es de: "+impuesto3);
                break;
            default: System.out.println("La categoria ingresada es incorrecta.");
            }
            totalimpuesto1=totalimpuesto1+impuesto1;
            totalimpuesto2=totalimpuesto2+impuesto2;
            totalimpuesto3=totalimpuesto3+impuesto3;
            preciofinal=preciofinal+precio;
        }

        System.out.println("El total de impuesto que pagara por la categoría 1 es de: "+totalimpuesto1+"\nEl total de impuesto que pagara por la categoria 2 es de: "+totalimpuesto2+"\nEl total de impuesto que pagara por la categoria 3 es de: "+totalimpuesto3);
        System.out.println("El total de impuesto que pagara por todos los coches es de: "+(totalimpuesto1+totalimpuesto2+totalimpuesto3)+"\nEl total de paga que hara por todos los coches considerando los duescuentos es de: "+(preciofinal-(totalimpuesto1+totalimpuesto2+totalimpuesto3)));    
    }
         
    public static void tabladeMultiplicar() {
        System.out.println("tabla de multiplicar");
        LeerTeclado dato = new LeerTeclado();
        int totaltabla, resultado=0;
        totaltabla=dato.leer(0,"Ingrese el número total de la tabla que quiere ver:");
        for(int tabla=1; tabla<=totaltabla; tabla++){
            for(int multiplicando=1; multiplicando<=10; multiplicando++)
            System.out.println(tabla+"*"+multiplicando+"="+(resultado=tabla*multiplicando));
        System.out.println("\n");
        }
        
    }
    public static void numerosperfecto() {
        System.out.println("Bienvenido al sistema de numeros perfectos");
        LeerTeclado ingresar= new LeerTeclado();
        int perfecto, perfectos=0, i=1;
        perfecto=ingresar.leer(0,"Ingrese el numero para verificar si es perfeceto o no");
        while(i<perfecto){
            if(perfecto%i==0){
                perfectos=perfectos+i;
                System.out.print("+"+i);
            }
            i++;
        }
        if(perfectos==perfecto){
                System.out.print(" = "+perfecto+" es perfecto");
            }
        else{
                System.out.println(" = "+perfectos+"\n"+perfecto+" No es perfecto");
            }
        
    }
    public int metodorevursivo(int numero){
        LeerTeclado valor= new LeerTeclado();
        int resultado=0, valorx, valorn;
        valorx=valor.leer(0,"Ingrese el valor de X:");
        valorn=valor.leer(0,"Ingrese el valor de N:");
        if(valorx>=1){
            
        }

        return resultado;
    }

    public static void metodorecursivo() {
        LeerTeclado valor= new LeerTeclado();
        int resultado=0, valorx, valorn;
        valorx=valor.leer(0,"Ingrese el valor de X:");
        valorn=valor.leer(0,"Ingrese el valor de N:");
        if(valorx>=1){
            
        }
        
    }
    }
        

