package Interfaces;

public interface iReturnOrder {
    /**
     * @return shows the customer here to return the goods or not
     */
    boolean isToReturn();
    /**
     * @param actor actor Object of abstract class Actor which implements iActorBehaviour
     * @return      info about returning order and actor which returns
     */
    void returnOrder(iActorBehaviour actor);
    /**
     * @param actor          actor Object of abstract class Actor which implements iActorBehaviour
     * @param reasonToReturn why actor return good
     * @return               info about reason of return
     */
    void getReasonForReturn(iActorBehaviour actor, String reasonToReturn);

}
