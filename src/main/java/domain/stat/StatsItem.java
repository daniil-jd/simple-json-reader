package domain.stat;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class StatsItem{

	@JsonProperty("total")
	private long total;

	@JsonProperty("category")
	private String category;

	public StatsItem() {
	}

	public StatsItem(long total, String category) {
		this.total = total;
		this.category = category;
	}

	public void setTotal(long total){
		this.total = total;
	}

	public long getTotal(){
		return total;
	}

	public void setCategory(String category){
		this.category = category;
	}

	public String getCategory(){
		return category;
	}
}