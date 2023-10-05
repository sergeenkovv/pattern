package creational.Builder;

public class VisitCardWebsiteBuilder extends WebsiteBuilder{
    @Override
    void buildCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildName() {
        website.setName("Visit card");
    }

    @Override
    void buildPrice() {
        website.setPrice(500);
    }
}
