import java.util.ArrayList;


/**
 * @author Nadeen
 * @author Asaad
 */
public class SharedData 
{
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	
	/**
	 * constructor
	 * @param array
	 * @param b 
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/**
	 * get the winArray
	 * @return 
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * set the winArray
	 * @param winArray
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * get array
	 * @return
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**
	 * get b 
	 * @return
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * get flag
	 * @return
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * set flag
	 * @param flag
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
