public class Main {
    public static void main(String[] args) {

        Worker worker = new Worker("Петров ", "Петр ", "Петрович ", ", Дворник");
        РОП роп = new РОП("Суворов ", "Юрий ", "Александрович ", ", Руководитель отдела продаж");
        MOP мор = new MOP("Голубчиков ", "Роман ", "Михайлович ", ", Менеджер отдела продаж");
        Zakupwik zakupwik = new Zakupwik("Аношкин ", "Владимир ", "Александрович ", ", Закупщик");
        Buh buh = new Buh("Кавкаева ", "Екатерина ", "Юрьевна ", ", Бухгалтер");

        Worker[] professions = {worker, zakupwik, мор, роп, buh};
        Wtat profession = new Wtat(professions);
        profession.viewWtat();
    }
}

