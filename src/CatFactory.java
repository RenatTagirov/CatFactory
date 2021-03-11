public class CatFactory {
        static Cat getCatByKey(String key) {
                Cat cat = null;
                switch (key) {
                        case "vaska":
                                cat = new MaleCat("Василий");
                                break;
                        case "murka":
                                cat = new FemaleCat("Мурочка");
                                break;
                        case "kiska":
                                cat = new FemaleCat("Кисюлька");
                                break;
                        default:
                                cat = new Cat(key);
                                break;
                }
                return cat;
        }
}
