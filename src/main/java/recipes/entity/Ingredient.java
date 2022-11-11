package recipes.entity;

import java.math.BigDecimal;
import java.util.Objects;

import provided.entity.EntityBase;

public class Ingredient extends EntityBase {
	private Integer ingredientID;
	private Integer recipeId;
	private Unit unit;
	private String ingredientName;
	private String instruction;
	private Integer ingredientOrder;
	private BigDecimal amount;
	
	public Integer getIngredientsID() {
		return ingredientID;
	}

	public void setIngredientsID(Integer ingredientsID) {
		this.ingredientID = ingredientsID;
	}

	public Integer getRecipeId() {
		return recipeId;
	}

	public void setRecipeId(Integer recipeId) {
		this.recipeId = recipeId;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	public String getIngredientName() {
		return ingredientName;
	}

	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}

	public String getInstrucion() {
		return instruction;
	}

	public void setInstrucion(String instrucion) {
		this.instruction = instrucion;
	}

	public Integer getIngredientOrder() {
		return ingredientOrder;
	}

	public void setIngredientOrder(Integer ingredientOrder) {
		this.ingredientOrder = ingredientOrder;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		StringBuilder b = new StringBuilder();
		
		b.append("ID+").append(ingredientID).append(": ");
		b.append(toFraction(amount));
		
		if(Objects.nonNull(unit) && Objects.nonNull(unit.getUnitId())){
			String singular = unit.getUnitNameSingular();
			String plural = unit.getUnitNamePlural();
			String word = amount.compareTo(BigDecimal.ONE) > 0 ? plural : singular;
			
			b.append(word).append(" ");
		}
		b.append(ingredientName);
		
		if(Objects.nonNull(instruction)) {
			b.append(", ").append(instruction);
		}
		return b.toString();
	}

	
	
	
	
}
