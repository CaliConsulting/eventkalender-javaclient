package cali.model;

import javax.swing.table.AbstractTableModel;

import eventkalender.cali.Nation;

public class NationTableModel extends AbstractTableModel {

	private static final long serialVersionUID = -8616428338422326887L;

	private String[] columnNames;
	private String[][] data;

	public NationTableModel(Nation data) {
		this(new Nation[] { data });
	}

	public NationTableModel(Nation[] data) {
		this.columnNames = new String[] { "Id", "Namn" };

		this.data = new String[data.length][this.columnNames.length];

		for (int i = 0; i < this.data.length; i++) {
			Nation n = data[i];
			this.data[i] = new String[] { String.valueOf(n.getId()), n.getName() };
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