package cali.model;

import javax.swing.table.AbstractTableModel;

public class SerializableKeyValuePairTableModel extends AbstractTableModel {

	private static final long serialVersionUID = -8616428338422326887L;

	private String[] columnNames;
	private String[][] data;

	public SerializableKeyValuePairTableModel(String[] columnNames, String[][] data) {
		this.columnNames = columnNames;
		this.data = data;
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
