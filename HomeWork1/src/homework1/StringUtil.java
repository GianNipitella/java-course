/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package homework1;

/**
 *
 * @author gnipitella
 */
public class StringUtil{
	public static String addCommasToNumericString(String digits){
                //revisar si es un numero
        
            String ls_cadena= digits;
            String newCadena="";
            String cadenaFinal="";
            int longitudCadena=0;
            int contador=0;
            int longitudNewCadena=0;
            longitudCadena=ls_cadena.length();
//            System.out.println(longitudCadena);
//            System.out.println(ls_cadena);
            for (int i=longitudCadena; i>0; i--){
                contador=contador+1;
//                System.out.println("contador vale:"+contador);
                    if(contador==3 && i>1){
                       newCadena=newCadena+ls_cadena.charAt(i-1)+",";
                       contador=0;
                       }               
                    else{ 
                         newCadena=newCadena+ls_cadena.charAt(i-1);                              
                       }           
               }
            longitudNewCadena=newCadena.length();
//            System.out.println(longitudNewCadena);
//            System.out.println(newCadena);
            for (int j=longitudNewCadena; j>0; j--){
//                System.out.println("i vale:"+j);
                cadenaFinal=cadenaFinal+newCadena.charAt(j-1);
            }
//            System.out.println(longitudNewCadena);
//            System.out.println("Cadenafinal vale:"+cadenaFinal);
            return cadenaFinal;
	}

	public static String removeAllOccurrences(String str, char ch){
            String cadenaPrimera=str;
            String nuevaCadena="";
            char remobable=ch;
            char caracter;
            int longitudCadenaPrimera=0;
            
            longitudCadenaPrimera=cadenaPrimera.length();
            for (int i=0; i<longitudCadenaPrimera; i++){
            caracter=cadenaPrimera.charAt(i);
                if(caracter==remobable){
                
                }
                else{
                nuevaCadena=nuevaCadena+cadenaPrimera.charAt(i);
                }

            
            
            }
            
		return nuevaCadena;
	}

	public static int countWordsOfAText(String text){
            
            String cadenaPrimera=text;
            String nuevaCadena="";
            char prevCaracter='#';
            char caracter;
            int longitudCadenaPrimera=0;
            int contador=0;
            longitudCadenaPrimera=cadenaPrimera.length();
            for (int i=0; i<longitudCadenaPrimera; i++){
            caracter=cadenaPrimera.charAt(i);
            
             
            if (i>0){
            prevCaracter=cadenaPrimera.charAt(i-1);
            }
                if(caracter==' ' || caracter=='\t' || caracter=='\n' || caracter=='\r' || caracter=='\u0000'){
                    if(prevCaracter!=' ' && prevCaracter!='\t' && prevCaracter!='\n' && prevCaracter!='\r' && prevCaracter!='\u0000'){
                contador=contador+1;
                    }
                }
                if(longitudCadenaPrimera==i+1 && prevCaracter!=' ' && prevCaracter!='\t' && prevCaracter!='\n' && prevCaracter!='\r' && prevCaracter!='\u0000'){
                 contador=contador+1;
                }
            //System.out.println(i+":"+caracter+":"+contador+":"+prevCaracter);
            }
            
		return contador;
	}

	public static String blow(String str){
            String cadenaPrimera=str;
            String nuevaCadena="";
            String cadenaFinal;
            int valorDigito=0;
            int longitudCadenaPrimera=0;
            longitudCadenaPrimera=cadenaPrimera.length();
            char caracter ='#';
            

        for(int i=0; i<longitudCadenaPrimera;i++){
            //System.out.println("interaccion numero:"+i);
            caracter=cadenaPrimera.charAt(i);
            if(Character.isDigit(caracter)==true ){
               // System.out.println("es Digito:"+i);
            
               valorDigito=Character.digit(caracter , 10);
               switch (valorDigito) {
                    case 0:
                        nuevaCadena=nuevaCadena+"";
                        i=i+1;
                    break;
                    default:
                        for (int j=1; j<valorDigito;j++){
                        //System.out.println("lo Repito"+j+" veces");
                        nuevaCadena=nuevaCadena+cadenaPrimera.charAt(i+1);
                        }
                    break;
               }
               
               //System.out.println("el Valor es:"+valorDigito);
               
            }
            else{
                 //System.out.println("no es Digito:"+i);
            nuevaCadena=nuevaCadena+cadenaPrimera.charAt(i);
            }

        }

            
            
            cadenaFinal=nuevaCadena.trim();
		return cadenaFinal;
	}

	public static int maxRun(String str){
            String cadena=str;
            int longitudCadena=cadena.length();
            int contadorPrimario=1;
            int contadorFinal=1;
            if(longitudCadena==0){
                contadorFinal=0;
            }
            else{
            for (int i=0;i<longitudCadena-1;i++){
                ;
                Character caracterAComparar=cadena.charAt(i);
                Character siguienteCaracter=cadena.charAt(i+1);
                //System.out.println("es "+caracterAComparar+"= "+siguienteCaracter+"?");
                if (caracterAComparar.equals(siguienteCaracter)){
                    //System.out.println("Si es agrego uno al contadorPrimario");
                    contadorPrimario=contadorPrimario+1;
                    //System.out.println(contadorPrimario+">"+contadorFinal+"?");
                    if(contadorPrimario>contadorFinal){
                       // System.out.println("Si es Almaceno el contador primario en el contador final");
                    contadorFinal=contadorPrimario;
                    }


                }
                else {
                    contadorPrimario=1;
                }
            }}
            
		return contadorFinal;
	}
}
