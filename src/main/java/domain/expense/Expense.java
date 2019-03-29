package domain.expense;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Expense{

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private int id;

	@JsonProperty("expenses")
	private List<ExpensesItem> expenses;

	public Expense() {
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setExpenses(List<ExpensesItem> expenses){
		this.expenses = expenses;
	}

	public List<ExpensesItem> getExpenses(){
		return expenses;
	}
}