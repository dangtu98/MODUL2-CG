package framework.TH3.TreeSet;

import java.util.*;


    public class SweepTakes {

        Set<String> VoteBox = new TreeSet<>();

        public SweepTakes() {
        }

        public boolean adddPhieu(String giaTri) {
            return this.VoteBox.add(giaTri);
        }

        public boolean deletePhieu(String giaTri) {
            return this.VoteBox.remove(giaTri);
        }


        public boolean CheckPhieu(String giaTri) {
            return this.VoteBox.contains(giaTri);
        }

        public void deleteAllphieu() {
            this.VoteBox.clear();
        }

        public int SoLuongPhieu() {
            return this.VoteBox.size();
        }

        public String rutPhieu() {
            String ketQua = "";
            Random rd = new Random();
            int viTri = rd.nextInt(this.VoteBox.size() - 1);
            ketQua = (String) this.VoteBox.toArray()[viTri];
            return ketQua;
        }

        public void  DisplayPhieu(){
            System.out.println(Arrays.toString(this.VoteBox.toArray()));
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            framework.TH3.SweepTakes St = new framework.TH3.SweepTakes();
            int choice = 0;


            do {
                System.out.println("------");
                System.out.println("MENU");
                System.out.println("1.Thêm mã số ");
                System.out.println("2.Xóa mã số");
                System.out.println("3.Kiểm tra mã số có tồn tại trong box");
                System.out.println("4.Xóa tất cả các phiếu dự thưởng");
                System.out.println("5.Số lượng phiếu");
                System.out.println("6.Rút thăm Trúng thưởng");
                System.out.println("7.in ra tất cả các phiếu");
                System.out.println("0.Exit...");
                choice = scanner.nextInt();
                scanner.nextLine();
                if (choice == 1 || choice == 2 || choice == 3) {
                    System.out.println("nhập vào mã phiếu");
                    String giaTri = scanner.nextLine();
                    if (choice == 1) {
                        St.adddPhieu(giaTri);
                    } else if (choice == 2) {
                        St.deletePhieu(giaTri);
                    } else {
                        System.out.println("kết quả kiểm tra" + St.CheckPhieu(giaTri));
                    }
                } else if( choice == 4){
                    St.deleteAllphieu();
                }else  if (choice == 5){
                    System.out.println("số lượng phiếu là " + St.SoLuongPhieu());
                }else if ( choice == 6){
                    System.out.println("Mã số trúng thưởng " + St.rutPhieu());
                }else if ( choice == 7){
                    System.out.println("in ra tất cả phiếu ");
                    St.DisplayPhieu();
                }

            } while (choice != 0);


        }

    }
