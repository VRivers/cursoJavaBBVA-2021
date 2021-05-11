package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import repaso.Circulo;
import repaso.Cuadrado;
import repaso.Figura;
import repaso.Triangulo;

public class FiguraFileUtil {

	private static ArrayList<Figura> figuras = new ArrayList<Figura>();
	private String nombreArchivo;
	private String path;
	
	
	public FiguraFileUtil() { super(); }

	public FiguraFileUtil(ArrayList<Figura> figuras, String nombreArchivo, String path) {
		super();
		FiguraFileUtil.figuras = figuras;
		this.nombreArchivo = nombreArchivo;
		this.path = path;
	}
	
	public static void generarArchivo (ArrayList<Figura> figuras, String nombreArchivo, String path) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(path+"/"+nombreArchivo+".json");
            pw = new PrintWriter(fichero);

            for (Figura figura : figuras) {
                if (figura instanceof Cuadrado) {
                	pw.println(" {“tipo”:1,“nombre”:”"+figura.getNombre()+"”, “valores”:”"+figura.getValores()+"”} ");               	
                }
                else if (figura instanceof Circulo) {
                	pw.println(" {“tipo”:2,“nombre”:”"+figura.getNombre()+"”, “valores”:”"+figura.getValores()+"”} ");              	
                }
                else if (figura instanceof Triangulo) {
                	pw.println(" {“tipo”:4,“nombre”:”"+figura.getNombre()+"”, “valores”:”"+figura.getValores()+"”} ");               	
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
        System.out.println("finalizo felizmente");
	}
	
	public void generarArchivo () {
		
	}
	
	public static ArrayList<Figura> leerArchivo (String nombreArchivo, String path) {
		
	      File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;

	      try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         archivo = new File (path+"/"+nombreArchivo+".json");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);

	         // Lectura del fichero
	         String linea;
	         while((linea=br.readLine())!=null) {
	        	 int finNombre=linea.indexOf(',',9);
	            String[] campos=linea.split(",");
	         	String tipo=linea.substring(8,9);  
	         	String nombre = linea.substring(13, finNombre-2);
	         	
	         	int itipo=Integer.parseInt(tipo);
	         	
	         	if (itipo == 1) {
	         		
	         		int inValor=linea.indexOf('=');
	         		int finValor=linea.indexOf('"', inValor);
	         		String valor=linea.substring(inValor+1,finValor);
	         		float fvalor=Float.parseFloat(valor);
	         		
	         		Figura cua=new Cuadrado(nombre,fvalor);
	         		figuras.add(cua);
	         	}
	         	
	         }
	         
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         // En el finally cerramos el fichero, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta 
	         // una excepcion.
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
		return figuras;
	}
	
	public ArrayList<Figura> leerArchivo () {
		return null;
	}

	//GETTERS Y SETTERS
	public ArrayList<Figura> getFiguras() {
		return figuras;
	}

	public void setFiguras(ArrayList<Figura> figuras) {
		FiguraFileUtil.figuras = figuras;
	}

	public String getNombreArchivo() {
		return nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
	
	
	
	
}
