public class Buh extends Worker {
    //Buh - бухгалтер*
    private String profession;

    public Buh(String name, String lastName, String patronymic, String profession) {
        super(name, lastName, patronymic, profession);
        this.profession = profession;
    }

    @Override
    public void goToWork() {
        System.out.println("работает в компании ООО Ромашка, осуществляет контроль финансово-хозяйственной деятельности предприятия," +
                " занимается оформлением первичной документации," +
                " формированием финансовой отчетности,");
    }

    public void goToVacation() {
        int nday = 40;
        System.out.println("уходит в отпуск сроком на " + nday + " календарных дней" +
                " имеет дополнительный отпуск в связи с длительным трудовым стажем");
    }

    public String getprofession() {
        return profession;
    }

    public void setprofession(String Buh) {
        profession = Buh;
    }
}


