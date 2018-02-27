package cali.model;

import javax.swing.table.AbstractTableModel;

import cronus.cali.Employee;

public class EmployeeTableModel extends AbstractTableModel {

	private static final long serialVersionUID = -8616428338422326887L;

	private String[] columnNames;
	private String[][] data;

	public EmployeeTableModel(Employee data) {
		this(new Employee[] { data });
	}

	public EmployeeTableModel(Employee[] data) {
		this.columnNames = new String[] { "Id", "Kön", "First Name", "Last Name" };

		this.data = new String[data.length][this.columnNames.length];

		for (int i = 0; i < this.data.length; i++) {
			Employee e = data[i];
			this.data[i] = new String[] { String.valueOf(e.getNo()), String.valueOf(e.getSex()), e.getFirstName(),
					e.getLastName() };
		}
	}

	@Override
	public int getColumnCount() {
		return this.columnNames.length;
	}

	@Override
	public String getColumnName(int col) {
		return this.columnNames[col];
	}

	@Override
	public int getRowCount() {
		return this.data.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return this.data[rowIndex][columnIndex];
	}

}