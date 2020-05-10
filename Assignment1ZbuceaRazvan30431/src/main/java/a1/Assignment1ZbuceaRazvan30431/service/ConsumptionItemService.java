package a1.Assignment1ZbuceaRazvan30431.service;

import a1.Assignment1ZbuceaRazvan30431.model.ConsumptionItem;
import a1.Assignment1ZbuceaRazvan30431.repository.ConsumptionItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ConsumptionItemService {
    private final ConsumptionItemRepository consumptionItemRepository;

    public ConsumptionItem saveConsumptionItem(ConsumptionItem consumptionItem) {
        return consumptionItemRepository.save(consumptionItem);
    }
}
