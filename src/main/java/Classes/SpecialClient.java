package Classes;

import Interfaces.iActorBehaviour;

public class SpecialClient extends Actor{
    private int idVip = 0;
    private static int count = 0;
    /**
     * @param name  name of the special client
     */
    public SpecialClient(String name, boolean isToReturn) {
        super(name, isToReturn);
        idVip = ++count;
    }

    /**
     * @return idVip of this SpecialClient
     */
    public int getIdVip() {
        return idVip;
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
