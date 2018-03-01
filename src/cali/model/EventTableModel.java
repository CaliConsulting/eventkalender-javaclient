package cali.model;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import javax.swing.table.AbstractTableModel;

import eventkalender.cali.Event;

public class EventTableModel extends AbstractTableModel {

	private static final long serialVersionUID = -8616428338422326887L;

	private String[] columnNames;
	private String[][] data;

	public EventTableModel(Event data) {
		this(new Event[] { data });
	}

	public EventTableModel(Event[] data) {
		this.columnNames = new String[] { "Id", "Namn", "Beskrivning", "Start", "Slut", "NationId" };

		this.data = new String[data.length][this.columnNames.length];

		for (int i = 0; i < this.data.length; i++) {
			Event e = data[i];

			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

			LocalDateTime startTime = LocalDateTime.ofInstant(e.getStartTime().toInstant(), ZoneId.systemDefault());
			LocalDateTime endTime = LocalDateTime.ofInstant(e.getEndTime().toInstant(), ZoneId.systemDefault());

			this.data[i] = new String[] { String.valueOf(e.getId()), e.getName(), e.getSummary(),
					startTime.format(formatter), endTime.format(formatter), String.valueOf(e.getNationId()) };
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