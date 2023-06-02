package Classes;

import Interfaces.*;

public abstract class Actor implements iActorBehaviour, iReturnOrder {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    protected boolean isToReturn;

    /**
     * @param name name of the actor
     * @return new object Actor with name
     */
    public Actor(String name, boolean isToReturn) {
        this.name = name;
        this.isToReturn = isToReturn;
    }

    /**
     * @return name of this actor
     */
    abstract public String getName();

}