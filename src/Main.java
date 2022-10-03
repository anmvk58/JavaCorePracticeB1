import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //khoi tao Department
        Department department1 = new Department();
        department1.departmentId = 1;
        department1.departmentName = "Sale";

        // Khoi tao Position
        Position position1 = new Position();
        position1.positionId = 1;
        position1.positionName = PositionName.DEV;

        // Khoi tao Account
        Account account1 = new Account();
        account1.accountId = 1;
        account1.email = "anmv1@vpbank.com.vn";
        account1.username = "anmv1";
        account1.fullName = "Mai Van An";
        account1.department = department1;
        account1.position = position1;
        account1.createDate = new Date();

        // Khoi tao group
        Group group1 = new Group();
        group1.groupId = 1;
        group1.groupName = "CLB Basketball";
        group1.creator = account1;
        group1.createDate = new Date();
        Account[] listAccount = {account1};
        group1.accounts = listAccount;

        //Gan nguoc thuoc tinh group cho Account:
        Group[] listGroup = {group1};
        account1.groups = listGroup;

        System.out.println(account1);
    }
}
