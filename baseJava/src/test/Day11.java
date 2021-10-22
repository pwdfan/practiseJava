package test;

import java.util.Arrays;

public class Day11 {
    public static void main(String[] args) {
        CustomerList customerList = new CustomerList(3);
        System.out.println(Arrays.toString(customerList.getAllCustomers()));
        customerList.addCustomer(new Customer("张三"));
        System.out.println(Arrays.toString(customerList.getAllCustomers()));
        customerList.addCustomer(new Customer("李四"));
        System.out.println(Arrays.toString(customerList.getAllCustomers()));
        customerList.addCustomer(new Customer("王五"));
        System.out.println(Arrays.toString(customerList.getAllCustomers()));
        customerList.addCustomer(new Customer("赵六")); // 添加失败
        System.out.println(Arrays.toString(customerList.getAllCustomers()));

        customerList.deleteCustomer(1); // 删除张三
        System.out.println(Arrays.toString(customerList.getAllCustomers()));

        customerList.replaceCustomer(2, new Customer("孙七")); // 修改李四为孙七
        System.out.println(Arrays.toString(customerList.getAllCustomers()));

        System.out.println(customerList.getCustomer(3)); // 获取3号王五
    }

    static class CustomerList {
        private Customer[] customers;
        private int count = 0;

        public CustomerList(int defaultCount) {
            this.customers = new Customer[defaultCount];
        }
        public CustomerList() {
            this (10);
        }

        public boolean addCustomer(Customer customer) {
            if (count >= customers.length) {
                System.out.println("空间已经满");
                return false;
            }
            customers[count++] = customer;
            return true;
        }

        public boolean replaceCustomer(int id, Customer customer) {
            int index = getIndexById(id);
            if (index >= 0){
                customers[index] = customer;
                return true;
            }
            System.out.println("该 id 不存在");
            return false;
        }

        public boolean deleteCustomer(int id) {
            int index = getIndexById(id);
            if (index >= 0){
                for (int i = index; i < count - 1; i++) {
                    customers[i] = customers[i + 1];
                }
                customers[--count] = null;
                return true;
            }
            System.out.println("该 id 不存在");
            return false;
        }

        public Customer[] getAllCustomers() {
            return Arrays.copyOf(customers, count);
        }

        public Customer getCustomer(int id) {
            return customers[getIndexById(id)];
        }

        public int size() {
            return count;
        }

        private int getIndexById(int id) {
            for (int i = 0; i < count; i++) {
                if (customers[i].getId() == id){
                    return i;
                }
            }
            return -1;
        }
    }

    static class Customer {
        private int id;
        private String name;
        private static int defaultId = 1;

        public Customer() {
        }

        public Customer(String name) {
            this.id = defaultId++;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
