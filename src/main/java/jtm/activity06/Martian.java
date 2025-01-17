package jtm.activity06;

public class Martian implements Humanoid, Alien, Cloneable {
	

	private Object stomach;
	private int weight;

	
	public Martian() {
		weight = Alien.BirthWeight;

	}
	
	/*
	 * Implementation of Object clone() method for Cloneable interface
	 * @see https://docs.oracle.com/javase/7/docs/api/java/lang/Cloneable.html
	 */
//	@Override
//	    public Object clone() throws CloneNotSupportedException {
//	    return clone(this);
//	}
//
//	private Object clone(Object current)throws CloneNotSupportedException {
//		Object result = null;
//		if(current instanceof Martian) {
//			Martian currentMartian = (Martian) current;
//			Martian newMartian = new Martian (currentMartian.getWeight(), currentMartian.stomach, currentMartian.isAlive(), currentMartian.foodEaten);
//			newMartian.contentOfStomach = clone(currentMartian.contentOfStomach);
//			result = newMartian;
//			
//		}else if(current instanceof Human) {
//			Human currentHuman = (Human) current;
//			result = new Human(currentHuman.getWeight(), currentHuman.getStomach(), currentHuman.isAlive(), currentHuman.getFoodEaten());
//			
//			
//		}else if(current instanceof Integer) {
//			result = new Integer (((Integer)current).intValue());
//		}
//		
//	
//	    // TODO implement cloning of current object
//	    // and its stomach
//		
//		return result;
//	}

	/*
	 * If Alien is hungry (stomach is empty), eat Object. Possibly eaten
	 *           items are:
	 * 
	 *           1. Integer, 2. Humanoid, 3. Alien.
	 * 
	 *           Gain weight of eaten item, and kill it, if possible
	 */
	@Override
	public void eat(Object item) {
		
		

	}

	@Override
	public void eat(Integer food) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object vomit() {
		// return content of the Alien stomach
		return null;
	}

	@Override
	public String isAlive() {
		// TODO Auto-generated method stub
		return "I AM IMMORTAL!";
	}

	@Override
	public String killHimself() {
		// TODO Auto-generated method stub
		return this.isAlive();
	}

	@Override
	public int getWeight() {

		return weight;
	}
	

	
	@Override
	public String toString() {
		return getClass().getSimpleName() + weight + " [" + stomach + "]";
	}

}
