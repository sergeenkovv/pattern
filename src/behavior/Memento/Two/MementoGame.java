package behavior.Memento.Two;

public class MementoGame {
    public static void main(String[] args) {
        Game game = new Game();
        game.set("lvl 2", 30000);
        System.out.println(game);

        File file = new File();
        file.setSave(game.save());

        game.set("lvl 2", 55000);
        System.out.println(game);

        System.out.println("Я проигрваю, нужно перезагрузить \nЗагружаемся");
        game.load(file.getSave());
        System.out.println(game);
    }
}
