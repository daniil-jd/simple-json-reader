package domain.expense;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ExpensesItem{

	@JsonProperty("details")
	private List<DetailsItem> details;

	@JsonProperty("id")
	private int id;

	public ExpensesItem() {
	}

	public void setDetails(List<DetailsItem> details){
		this.details = details;
	}

	public List<DetailsItem> getDetails(){
		return details;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}
}