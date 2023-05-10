package view;

import java.util.List;

import controller.EstudianteController;
import model.Estudiante;

public class DatosDeTabla {

	/**
	 * 
	 * @return
	 */
	public static String[] getTitulosColumnas() {
		return new String[] { "Id", "Nombre", "Primer Apell", "Segundo Apell", "DNI.", "Direccion", "Email", "Telef" };
	}

	/**
	 * 
	 * @return
	 */
	public static Object[][] getDatosDeTabla() {
		// Obtengo todas los Estudiantes
		List<Estudiante> personas = EstudianteController.findAll();
		// Preparo una estructura para pasar al constructor de la JTable
		Object[][] datos = new Object[personas.size()][8];
		// Cargo los datos de la lista de Estudiantes en la matriz de los datos
		for (int i = 0; i < personas.size(); i++) {
			Estudiante persona = personas.get(i);
			datos[i][0] = persona.getId();
			datos[i][1] = persona.getNombre();
			datos[i][2] = persona.getApellido1();
			datos[i][3] = persona.getApellido2();
			datos[i][4] = persona.getDni();
			datos[i][5] = persona.getDireccion();
			datos[i][6] = persona.getEmail();
			datos[i][7] = persona.getTelefono();
		}

		return datos;
	}

}
