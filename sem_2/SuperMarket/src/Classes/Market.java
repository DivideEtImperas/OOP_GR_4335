package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;
import Interfaces.iReturnOrder;

public class Market implements iMarketBehaviour,iQueueBehaviour,iReturnOrder{

  /**
 * Список для хранения интерфейсов
 */
private List<iActorBehaviour> queue;
  /**
 * 
 */
public Market() {
      this.queue = new ArrayList<iActorBehaviour>();
  }

  @Override
  public void acceptToMarket(iActorBehaviour actor) {
      System.out.println(actor.getActor().getName()+" клиент пришел в магазин ");
      takeInQueue(actor);
  }

  @Override
  public void takeInQueue(iActorBehaviour actor) {
      this.queue.add(actor);
      System.out.println(actor.getActor().getName()+" клиент добавлен в очередь ");
  }

  @Override
  public void releaseFromMarket(List<Actor> actors) {
      for(Actor actor:actors)
      {
          System.out.println(actor.getName()+" клиент ушел из магазина ");
          queue.remove(actor);
      }
      
  }
  @Override
  public void giveDiscount(){
    for(iActorBehaviour actor: queue)
    {
        if(!actor.isMakeDiscount())
        {
            actor.setMakeDiscount(true);
            System.out.println(actor.getActor().getName()+" клиент получил скидку ");
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

  @Override
  public void giveOrder() {
      for(iActorBehaviour actor: queue)
      {
          if(actor.isMakeOrder())
          {
              actor.setTakeOrder(true);
              System.out.println(actor.getActor().getName()+" клиент получил свой заказ ");
          }
      }
    }

@Override
  public void returnOrder() {
      for(iActorBehaviour actor: queue)
      {
          if(!actor.isReturnOrder())
          {
              actor.setTakeOrder(true);
              System.out.println(actor.getActor().getName()+" клиент вернул свой заказ ");
          }
      }
      
  }

  @Override
  public void releaseFromQueue() {
     List<Actor> releaseActors = new ArrayList<>();
     for(iActorBehaviour actor:queue)
     {
      if(actor.isTakeOrder())
      {
          releaseActors.add(actor.getActor());
          System.out.println(actor.getActor().getName()+" клиент ушел из очереди ");
      }

     }
  releaseFromMarket(releaseActors);
  }



  @Override
  public void takeOrder() {
      for(iActorBehaviour actor:queue)
      {
          if(!actor.isMakeOrder())
          {
              actor.setMakeOrder(true);
              System.out.println(actor.getActor().getName()+" клиент сделал заказ ");

          }
      }
      
  }



  
}
