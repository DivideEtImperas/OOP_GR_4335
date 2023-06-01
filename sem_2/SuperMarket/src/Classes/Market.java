package Classes;

import java.io.IOException;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;
import Interfaces.iReturnOrder;

public class Market implements iMarketBehaviour, iQueueBehaviour, iReturnOrder {

    private List<iActorBehaviour> queue;

    Logger logger = Logger.getLogger("Logger");
    FileHandler fh;

    /**
     * К-тор класса Market
     */
    public Market() {
        try {
            fh = new FileHandler("X:\\Programming\\OOP_GR_4335\\sem_2\\SuperMarket\\Logger.txt");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            logger.info("StartLogger");

        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.queue = new ArrayList<iActorBehaviour>();
    }

    // приход клиента в магазин
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        String log = actor.getActor().getName() + " клиент пришел в магазин ";
        System.out.println(log);
        logger.info(log);
        takeInQueue(actor);
    }

    // добавление в очередь
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        String log = actor.getActor().getName() + " клиент добавлен в очередь ";
        System.out.println(log);
        logger.info(log);
    }

    // уход клиента
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            String log = actor.getName() + " клиент ушел из магазина ";
            System.out.println(log);
            logger.info(log);
            queue.remove(actor);
        }

    }

    // получение скидки
    @Override
    public void giveDiscount() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeDiscount()) {
                actor.setMakeDiscount(true);
                String log = actor.getActor().getName() + " клиент получил скидку ";
                System.out.println(log);
                logger.info(log);
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
                String log = actor.getActor().getName() + " клиент получил свой заказ ";
                System.out.println(log);
                logger.info(log);
            }
        }
    }

    // возврат заказа
    @Override
    public void returnOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isReturnOrder()) {
                actor.setTakeOrder(true);
                String log = actor.getActor().getName() + " клиент вернул свой заказ ";
                System.out.println(log);
                logger.info(log);
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
                String log = actor.getActor().getName() + " клиент ушел из очереди ";
                System.out.println(log);
                logger.info(log);
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
                String log = actor.getActor().getName() + " клиент сделал заказ ";
                System.out.println(log);
                logger.info(log);

            }
        }

    }

}
