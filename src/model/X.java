package model;

import java.util.HashMap;
import java.util.Vector;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class X {

    public static void main(String[] args) {
        try {
            JasperReport jr = JasperCompileManager.compileReport("src/reports/barcode.jrxml");

            HashMap parameter = new HashMap();

            Vector v = new Vector();
            v.add(new Z("123"));
            v.add(new Z("467931442"));
            v.add(new Z("256853456"));
            v.add(new Z("868451"));
            v.add(new Z("84651"));

            JRBeanCollectionDataSource datasource = new JRBeanCollectionDataSource(v);

            JasperPrint jp = JasperFillManager.fillReport(jr, parameter, datasource);

            JasperViewer.viewReport(jp);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


