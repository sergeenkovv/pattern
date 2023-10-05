package structural.Proxy;

public class ProxyProject implements Project{
    private String url;
    private RealProject realProject;

    public ProxyProject(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if (realProject == null) {
            realProject = new RealProject(url);
            System.out.println("тебя взламывают через прокси лох ебаный");
        }
        realProject.run();
    }
}
