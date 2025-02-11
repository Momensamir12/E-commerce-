package webdev.e_commerce.product_catalog_service.aggregate;


//
//@Aggregate
//@AllArgsConstructor
//@NoArgsConstructor
//@Slf4j
//public class ProductAggregate {
//    @AggregateIdentifier
//    private String id;
//    @Autowired
//    private ProductsEventHandler productsEventHandler;
//
//    @CommandHandler
//    public ProductAggregate(ProductOutOfStockCommand cmd) {
//
//        ProductOutOfStockEvent productOutOfStockEvent = new ProductOutOfStockEvent(cmd.getId(), cmd.getProductId());
//        AggregateLifecycle.apply(productOutOfStockEvent);
//    }
//
//    @CommandHandler
//    public ProductAggregate(ProductPriceChangedCommand cmd) {
//        ProductPriceChangedEvent event = new ProductPriceChangedEvent(cmd.getId(), cmd.getProductId(), cmd.getPrice());
//
//        AggregateLifecycle.apply(event);
//    }
//
//    @CommandHandler
//    public ProductAggregate(UpdateInventoryCommand cmd) {
//        InventoryUpdateEvent event = new InventoryUpdateEvent(cmd.getId(), cmd.getOrderedItems());
//        AggregateLifecycle.apply(event);
//    }
//
//    @EventSourcingHandler
//    void on(InventoryUpdateEvent event) {
//        log.info("Updating inventory for product " + event.getId());
//        this.id = event.getId();
//    }
//
//    @EventSourcingHandler
//    void on(ProductOutOfStockEvent event) {
//        this.id = event.getId();
//    }
//
//    @EventSourcingHandler
//    void on(ProductPriceChangedEvent event) {
//        this.id = event.getId();
//    }
//}
