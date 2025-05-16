/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PDF;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.*;
import javax.swing.JOptionPane;
import Conexion.Conexion;
/**
 *
 * @author blanc
 */
import Conexion.Conexion;
public class pdf {
    
        
    public void generarPDF(String ruta , String usuario , String ingreso , String cliente){
    
        Conexion con = new Conexion();
        PDDocument document = new PDDocument();
        PDPage page = new PDPage();
        document.addPage(page);
        
        try {
            
            PDPageContentStream pg = new PDPageContentStream(document, page);
            pg.beginText();
            pg.setFont(PDType1Font.TIMES_ROMAN, 16);
            pg.newLineAtOffset(100, 700);
            pg.showText(" Usuario : " + usuario + "  ");
            pg.showText(" ");
            pg.showText(" Fruta ingresada : " + ingreso + "  ");
            pg.showText(" ");
            pg.showText(" Cliente " + cliente + "  ");
            pg.endText();
            pg.close();
            document.save(ruta);
            
            
            JOptionPane.showMessageDialog(null,"PDF Guardado exitosamente");
            
            
        } catch (Exception e) {
            
            System.out.println("Errores : " + e);
            
        }
        
    }
    
    
}
