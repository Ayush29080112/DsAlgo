
public class Main {

	public static void main(String[] args) {
		TreeNode drinks = new TreeNode("Drinks");
		TreeNode hotDrinks = new TreeNode("Hot");
		TreeNode tea = new TreeNode("Tea");
		TreeNode coffee = new TreeNode("Coffee");
		hotDrinks.addChild(tea);
		hotDrinks.addChild(coffee);
		TreeNode coldDrinks = new TreeNode("Cold");
		TreeNode alcoholic = new TreeNode("Alcoholic");
		TreeNode nonAlcoholic = new TreeNode("Non-Alcoholic");
		coldDrinks.addChild(alcoholic);
		coldDrinks.addChild(nonAlcoholic);
		drinks.addChild(hotDrinks);
		drinks.addChild(coldDrinks);

		System.out.println(drinks.print(0));

	}
}
