public class Persister extends User implements Persister_Save{
	private User user;

	public Persister(String name){
		super(name);
		this.user = new User(name);
	}

	@Override
	public void save() {
			System.out.println("Save user: " + user.getName());
	}
}