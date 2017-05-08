package de.wwu.pi.fooddelivery.ejb;

import javax.ejb.Remote;
import de.wwu.pi.fooddelivery.jpa.Product;

@Remote
public interface ProductService extends EntityService<Product> {

}
