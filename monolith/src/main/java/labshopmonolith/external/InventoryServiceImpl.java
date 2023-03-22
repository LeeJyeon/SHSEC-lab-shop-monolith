package labshopmonolith.external;

import org.springframework.stereotype.Service;

@Service
public class InventoryServiceImpl implements InventoryService {

    /**
     * Fallback
     */
    public Inventory getInventory(Long id) {
        Inventory inventory = new Inventory();
        return inventory;
    }
}
