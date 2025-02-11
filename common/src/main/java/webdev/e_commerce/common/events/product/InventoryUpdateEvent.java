package webdev.e_commerce.common.events.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import webdev.e_commerce.common.dto.OrderItemDTO;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class InventoryUpdateEvent {
    String id;
    private List<OrderItemDTO> orderedItems;
}
