package be.one.test.ui.views.storefront.events;

import com.vaadin.flow.component.ComponentEvent;
import be.one.test.ui.views.orderedit.OrderItemEditor;

public class CommentChangeEvent extends ComponentEvent<OrderItemEditor> {

	private final String comment;

	public CommentChangeEvent(OrderItemEditor component, String comment) {
		super(component, false);
		this.comment = comment;
	}

	public String getComment() {
		return comment;
	}

}