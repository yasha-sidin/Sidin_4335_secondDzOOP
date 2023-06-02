package Classes;

import Interfaces.iActorBehaviour;

public class ActionClient extends Actor{
    private String actionName;
    private int iD = 0;
    private static int count = 0;
    private static int amountOfParticipants = 30;
    /**
     * @param name       name of the actor
     * @param actionName name of action
     */
    public ActionClient(String name, String actionName, boolean isToReturn) {
        super(name, isToReturn);
        iD = ++count;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isTakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean takeOrder) {
        super.isMakeOrder = takeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
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
