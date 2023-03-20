package deisgn.patterns.mementoDesignPattern;

public class Stock {
private String stockData;


public Stock(String stockData) {
	super();
	this.stockData = stockData;
}

public String getStockData() {
	return stockData;
}

public void setStockData(String stockData) {
	this.stockData = stockData;
}

public Memento saveToMemento() {
	return new Memento(stockData);
}
public void restoreFromMemento(Memento memento) {
	this.stockData=memento.getState();
}
}
