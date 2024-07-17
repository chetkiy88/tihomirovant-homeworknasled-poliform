public class РОП extends Worker {
    //РОП - Руководитель отдела продаж*
    private String profession;

    public РОП(String name, String lastName, String patronymic, String profession) {
        super(name, lastName, patronymic, profession);
        this.profession = profession;
    }

    @Override
    public void goToWork() {
        System.out.println("работает в компании ООО Ромашка, руководит отделом продаж," +
                " осуществляет контроль за показателями подразделения продаж и деятельностью менеджеров отдела продаж (МОР)," +
                " формирует еженедельную и ежемесячную отчетность для генерального директора компании,");
    }

    public void goToVacation() {
        int nday = 28;
        System.out.println("уходит в отпуск сроком на " + nday + " календарных дней");
    }

    public String getprofession() {
        return profession;
    }

    public void setprofession(String РОП) {
        profession = РОП;
    }
}

