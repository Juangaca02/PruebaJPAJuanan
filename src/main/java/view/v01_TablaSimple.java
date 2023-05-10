package view;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class v01_TablaSimple extends JPanel {

	/**
	 * 
	 */
	public v01_TablaSimple() {
		// Creo un objeto JTable con el constructor m�s sencillo del que dispone
		JTable table = new JTable(DatosDeTabla.getDatosDeTabla(), DatosDeTabla.getTitulosColumnas());
		// Creamos un JscrollPane y le agregamos la JTable
		JScrollPane scrollPane = new JScrollPane(table);

		// Accedo a los clics realizados sobre la tabla
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				int indiceFilaSel = table.getSelectedRow();
				System.out.println("Clic en JTAble: " + DatosDeTabla.getDatosDeTabla()[indiceFilaSel][2]);
			}
		});

		// Agregamos el JScrollPane al contenedor
		this.setLayout(new BorderLayout());
		this.add(scrollPane, BorderLayout.CENTER);
	}
}