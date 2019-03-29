package domain.expense;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class DetailsItem{

	@JsonProperty("amount")
	private long amount;

	@JsonProperty("category")
	private String category;

	public DetailsItem() {
	}

	public void setAmount(long amount){
		this.amount = amount;
	}

	public long getAmount(){
		return amount;
	}

	public void setCategory(String category){
		this.category = category;
	}

	public String getCategory(){
		return category;
	}
}