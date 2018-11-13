package be.one.test.ui.views.storefront.events;

import com.vaadin.flow.component.ComponentEvent;
import be.one.test.backend.data.entity.Product;
import be.one.test.ui.views.orderedit.OrderItemEditor;

public class ProductChangeEvent extends ComponentEvent<OrderItemEditor> {

	private final Product product;

	public ProductChangeEvent(OrderItemEditor component, Product product) {
		super(component, false);
		this.product = product;
	}

	public Product getProduct() {
		return product;
	}

}