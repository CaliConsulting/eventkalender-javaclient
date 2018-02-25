package cali.model;

import javax.swing.table.AbstractTableModel;

import cali.utility.Utility;
import cronus.cali.SerializableKeyValuePairOfStringString;

public class SerializableKeyValuePairTableModel extends AbstractTableModel {

	private static final long serialVersionUID = -8616428338422326887L;

	private String[] columnNames;
	private String[][] data;

	public SerializableKeyValuePairTableModel(SerializableKeyValuePairOfStringString[] data) {
		this(new SerializableKeyValuePairOfStringString[][] { data });
	}

	public SerializableKeyValuePairTableModel(SerializableKeyValuePairOfStringString[][] data) {
		String[][] tempData = Utility.getData(data);
		this.columnNames = tempData[0];

		this.data = new String[tempData.length - 1][tempData[0].length];

		for (int i = 1; i < tempData.length; i++) {
			this.data[i - 1] = tempData[i];
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
