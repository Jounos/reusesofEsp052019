package creator;

public class Tesla extends Carro{
	@Override
	public String toString() {
		
		StringBuilder str = new StringBuilder();

		str.append("Carro Tesla Roadster Eletricidade");

		return str.toString();
	}
}
