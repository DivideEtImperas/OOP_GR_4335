package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;
import Interfaces.iReturnOrder;

public class Market implements iMarketBehaviour, iQueueBehaviour, iReturnOrder {

    private List<iActorBehaviour> queue;

    /**
     * К-тор класса Market
     */
    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    // приход клиента в магазин
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }

    // добавление в очередь
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
    }

    // уход клиента
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }

    }

    // получение скидки
    @Override
    public void giveDiscount() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeDiscount()) {
                actor.setMakeDiscount(true);
                System.out.println(actor.getActor().getName() + " клиент получил скидку ");
            }
        }
    }

    @Override
    public void update() {
        takeOrder();
        giveDiscount();
        returnOrder();
        giveOrder();
        releaseFromQueue();

    }

    // получение заказа
    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент получил свой заказ ");
            }
        }
    }

    // возврат заказа
    @Override
    public void returnOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isReturnOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент вернул свой заказ ");
            }
        }

    }

    // уход из очереди
    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
            }

        }
        releaseFromMarket(releaseActors);
    }

    // получение заказа
    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");

            }
        }

    }

}
