package Interfaces;
import Classes.Actor;
import java.util.List;

public interface iMarketBehaviour {
    /**
     * @param actor Object of abstract class Actor which implements iActorBehaviour
     * @return accept Actor to market
     */
    void acceptToMarket(iActorBehaviour actor);
    /**
     * @param actors list of objects of abstract class Actor which will go out from market
     */
    void releaseFromMarket(List<Actor> actors);
    /**
     * @return change of queue
     */
    void update();



}
