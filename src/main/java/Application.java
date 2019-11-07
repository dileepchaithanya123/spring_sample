import model.Customer;
import service.CustomerService;
import service.CustomerServiceImpl;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        CustomerService service = new CustomerServiceImpl();

        for(int i=0; i<service.findAll().size(); i++) {
            System.out.println(service.findAll().get(i).getFirstname()
                    + ", " + service.findAll().get(i).getLastname());
        }
//        System.out.println(service.findAll().get(0).getFirstname());
//        System.out.println((service.findAll().get(0).getLastname()));
      }
}
