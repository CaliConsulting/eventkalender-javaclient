package cali.model;

import javax.swing.table.AbstractTableModel;

import eventkalender.cali.Person;

public class PersonTableModel extends AbstractTableModel {

	private static final long serialVersionUID = -8616428338422326887L;

	private String[] columnNames;
	private String[][] data;

	public PersonTableModel(Person data) {
		this(new Person[] { data });
	}
	
	public PersonTableModel(Person[] data) {
		this.columnNames = new String[] { "Id", "First Name", "Last Name" };

		this.data = new String[data.length][this.columnNames.length];

		for (int i = 0; i < this.data.length; i++) {
			Person p = data[i];
			this.data[i] = new String[] { String.valueOf(p.getId()), p.getFirstName(), p.getLastName() };
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