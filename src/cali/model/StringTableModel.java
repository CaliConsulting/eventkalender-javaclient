package cali.model;

import javax.swing.table.AbstractTableModel;

public class StringTableModel extends AbstractTableModel {

	private static final long serialVersionUID = -8616428338422326887L;

	private String columnName;
	private String[] data;

	public StringTableModel(String[] data) {
		this.columnName = data[0];

		this.data = new String[data.length];

		for (int i = 1; i < data.length; i++) {
			this.data[i - 1] = data[i];
		}
	}

	@Override
	public int getColumnCount() {
		return 1;
	}

	@Override
	public String getColumnName(int col) {
		return columnName;
	}

	@Override
	public int getRowCount() {
		return this.data.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return this.data[rowIndex];
	}

}