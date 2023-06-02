package Interfaces;

import Classes.Actor;

public interface iQueueBehaviour {
    /**
     * @param actor Object of abstract class Actor which implements iActorBehaviour
     * @return new object take in queue
     */
    void takeInQueue(iActorBehaviour actor);
    /**
     * @return leaving the queue
     */
    void releaseFromQueue();
    /**
     * @return accept order
     */
    void takeOrder();
    /**
     * @return receiving an order
     */
    void giveOrder();

}
