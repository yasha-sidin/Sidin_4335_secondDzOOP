package Classes;

import Interfaces.iActorBehaviour;

public class OrdinaryClient extends Actor {
    /**
     * @param name name of the ordinary client
     */
    public OrdinaryClient(String name, boolean isToReturn) {
        super(name, isToReturn);
    }

    @Override
    public String getName() {
        return super.name;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setTakeOrder(boolean takeOrder) {
        super.isMakeOrder = takeOrder;
    }

    public void setMakeOrder(boolean makeOrder) {
        super.isTakeOrder = makeOrder;
    }

    public Actor getActor() {
        return this;
    }


    @Override
    public boolean isToReturn() {
        return super.isToReturn;
    }

    @Override
    public void returnOrder(iActorBehaviour actor) {
        System.out.printf("%s, вернул товар\n", actor.getActor().getName());
    }

    @Override
    public void getReasonForReturn(iActorBehaviour actor, String reasonToReturn) {
        System.out.printf("%s, вернул товар, потому что %s\n", actor.getActor().getName(), reasonToReturn);
    }
}
