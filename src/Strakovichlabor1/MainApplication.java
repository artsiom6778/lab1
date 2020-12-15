package Strakovichlabor1;

public class MainApplication {
        public static void main(String[] args) throws Exception {
            // Определение ссылок на продукты завтрака
            Food[] breakfast = new Food[20];
// Анализ аргументов командной строки и создание для них // экземпляров соответствующих классов для завтрака
            int itemsSoFar = 0;
            int howmanyapples = 0;
            int howmanywtea = 0;
            int howmanycheese = 0;
            for (String arg : args) {
                String[] parts = arg.split("/");
                if (parts[0].equals("Cheese")) {
                  howmanycheese++;
                    // У сыра дополнительных параметров нет
                    breakfast[itemsSoFar] = new Cheese();
                } else if (parts[0].equals("Apple")) {
                    howmanyapples++;
// У яблока – 1 параметр, который находится в
// parts[1]
 breakfast[itemsSoFar] = new Apple(parts[1]);
                }
                else if (parts[0].equals("Tea")){
                    howmanywtea++;
                    breakfast[itemsSoFar] = new Tea(parts[1]);}
// ... Продолжается анализ других продуктов для завтрака
                itemsSoFar++;
            }
// Перебор всех элементов массива
            for (Food item : breakfast)
                if (item != null)
                    // Если элемент не null – употребить продукт
                    item.consume();
                else
                    break;
            System.out.println("Съедено сыра " + howmanycheese);
            System.out.println("Съедено яблок " + howmanyapples);
            System.out.println("Выпито кружек чая " + howmanywtea);
        }

}

