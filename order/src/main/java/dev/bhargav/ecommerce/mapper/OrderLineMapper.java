package dev.bhargav.ecommerce.mapper;

import dev.bhargav.ecommerce.dto.OrderLineRequest;
import dev.bhargav.ecommerce.dto.OrderLineResponse;
import dev.bhargav.ecommerce.entity.Order;
import dev.bhargav.ecommerce.entity.OrderLine;
import org.springframework.stereotype.Service;

@Service
public class OrderLineMapper {

    public OrderLine toOrderLine(OrderLineRequest request, Order order) {
        return OrderLine.builder()
                .productId(request.productId())
                .order(order)
                .quantity(request.quantity())
                .build();
    }

    public OrderLineResponse toOrderLineResponse(OrderLine orderLine) {
        return new OrderLineResponse(
                orderLine.getId(),
                orderLine.getProductId(),
                orderLine.getQuantity()
        );
    }

}
