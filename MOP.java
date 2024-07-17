public class MOP extends Worker{
    //МОР - менеджер отдела продаж*
    private String profession;

    public MOP(String name, String lastName, String patronymic, String profession) {
        super(name, lastName, patronymic, profession);
        this.profession = profession;
    }

    @Override
    public void goToWork() {
        System.out.println("работает в компании ООО Ромашка, занимается сбытом продукции корпоративным клиентам, " +
                " поиском новых контрагентов,");
    }

    public void goToVacation() {
        int nday = 30;
        System.out.println("уходит в отпуск сроком на " + nday + " календарных дней" +
                " а также имеет дополнительный отпуск до 10 календарных дней, в связи с вредным производством");
    }

    public String getprofession() {
        return profession;
    }

    public void setMOP(String MOP) {
        profession = MOP;
    }
}

