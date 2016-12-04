package main.j.hj;

import javax.swing.*;

public class vg extends AbstractListModel<String> {
	private static final long serialVersionUID = 1L;
	
	private main.core.TodoList list;
	
	public vg(main.core.TodoList list) {
		this.list = list;
	}
	
	public void moveUp(int i) {
		this.list.moveUp(i);
		this.fireContentsChanged(this, i - 1, i);
	}
	
	public void moveDown(int i) {
		this.list.moveDown(i);
		this.fireContentsChanged(this, i, i + 1);
	}
	
	public void removeAt(int i) {
		this.list.removeAt(i);
		this.fireContentsChanged(this, i, i);
	}
	
	public void add(String task) {
		this.list.add(task);
		this.fireContentsChanged(this, 
				this.list.size() - 1, this.list.size() - 1);
	}
	
	@Override
	public int getSize() {
		return this.list.size();
	}
	@Override
	public String getElementAt(int index) {
		return this.list.elementAt(index);
	}
}
