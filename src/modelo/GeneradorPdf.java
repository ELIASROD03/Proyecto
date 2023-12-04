/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import javax.swing.table.DefaultTableModel;

public class GeneradorPdf {

    public static void generarTicketPDF(String numeroPedido, String nombreCliente, String fecha,
                                       String totalVenta, DefaultTableModel modeloCarrito, String pdfFilePath) {
        Document document = new Document();

        try {
            PdfWriter.getInstance(document, new FileOutputStream(pdfFilePath));
            document.open();

            document.add(new Paragraph("Número de pedido: " + numeroPedido));
            document.add(new Paragraph("Nombre del cliente: " + nombreCliente));
            document.add(new Paragraph("Fecha: " + fecha));
            document.add(new Paragraph("Total de la venta: " + totalVenta));
            document.add(new Paragraph("Detalles del pedido:"));

            for (int i = 0; i < modeloCarrito.getRowCount(); i++) {
                String nombrePlatillo = modeloCarrito.getValueAt(i, 0).toString();
                String cantidadPlatillos = modeloCarrito.getValueAt(i, 1).toString();
                String cantidadPorPlatillo = modeloCarrito.getValueAt(i, 2).toString();

                document.add(new Paragraph(nombrePlatillo + " - Cantidad: " + cantidadPlatillos + " - Precio por unidad: " + cantidadPorPlatillo));
            }

            System.out.println("Ticket guardado como: " + pdfFilePath);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (document != null && document.isOpen()) {
                document.close();
            }
        }
    }
}
