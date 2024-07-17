public class Zakupwik extends Worker{
    private String profession;

    public Zakupwik(String name, String lastName, String patronymic, String profession) {
        super(name, lastName, patronymic, profession);
        this.profession = profession;
    }

    @Override
    public void goToWork() {
        System.out.println("работает в компании ООО Ромашка, контролирует объёмы закупок," +
                " проверяет соответсвие документации поставщиков требованиям компании," +
                " осуществляет мониторинг рыночных цен у конкурентов,");
    }

    public void goToVacation() {
        int nday = 45;
        System.out.println("работник уходит в отпуск сроком на " + nday + " календарных дней," +
                " а также имеет дополнительный отпуск, в связи непосредственным контактом с хим веществами (продукцией)");
    }

    public String getprofession() {
        return profession;
    }

    public void setprofession(String Zakupwik) {
        profession = Zakupwik;
    }
}

