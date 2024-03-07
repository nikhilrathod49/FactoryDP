
public class CreateDependentObjects { // Container

	public static Tyre CreateTyreObj(String tyreType) {

		if (tyreType.equals("Base")) {
			return new TvsTyre();
		}
		if (tyreType.equals("Int") || tyreType.equals("Top")) {
			return new MrfTyre();
		}
		return null;
	}
}
