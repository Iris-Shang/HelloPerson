package sayhi;

public class UnderAgeException extends Exception
{

	private static final long serialVersionUID = 6950081586479477001L;

	/**
	 * 
	 */
	public UnderAgeException()
	{
		super("Parent is too Young");
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public UnderAgeException(String message)
	{
		super(message);
		// TODO Auto-generated constructor stub
	}

}
