package test;

import java.util.ArrayList;
import java.util.List;

public class PagingPrice {
	
	private Integer start;
	private Integer count;
	private Integer total;
	public List<Priceout> prices = new ArrayList<>();
	
	public Integer getstart() {
		return start;
	}
	
	public Integer getcount() {
		return count;
	}
	
	public Integer gettotal() {
		return total;
	}
	
	public List<Priceout> getprices() {
		return prices;
	}
	
	public PagingPrice(Integer start, Integer count, Integer total) {
		this.start = start;
		this.count = count;
		this.total = total;
	}

}
