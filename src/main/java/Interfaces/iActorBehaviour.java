package Interfaces;

import Classes.Actor;

public interface iActorBehaviour {
    /**
     * @param makeOrder     have a new order
     * @return setMakeOrder change makeOrder to takeOrder
     */
    void setMakeOrder(boolean makeOrder);

    /**
     * @param takeOrder accept the order
     * @return setTakeOrder change makeOrder to takeOrder
     */
    void setTakeOrder(boolean takeOrder);

    /**
     * @return true or false in dependence of condition of actor, is he/she on make order
     */
    boolean isMakeOrder();
    /**
     * @return true or false in dependence of condition of actor, is he/she on take order
     */
    boolean isTakeOrder();

    /**
     * @return help to get object which instance of Actor
     */
    Actor getActor();
}
