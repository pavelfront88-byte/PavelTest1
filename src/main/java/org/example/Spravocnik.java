void main() {}
static class Directory
{
    public Map<String,List<String>>directory_hm=new HashMap<>();
    public List<String>phone_number_list;
    public void add(String surname, String phone_number) {
        if (directory_hm.containsKey(surname))
        {
            phone_number_list = directory_hm.get(surname);
            phone_number_list.add(phone_number);
            directory_hm.put(surname,phone_number_list);
        } else
        {
            phone_number_list=new ArrayList<>();
            phone_number_list.add(phone_number);
            directory_hm.put(surname,phone_number_list);
        }}
    public List<String> get(String surname)
    {
        return directory_hm.get(surname);
    }}

private static void Spisok() {
    Directory directory=new Directory();

    directory.add("Novikov", "8999124444");
    directory.add("Semenov", "8917133333");
    directory.add("Novikov", "899999999");
    directory.add("Fedin", "899111111");
    directory.add("Semenov", "89923239999");
    directory.add("Fedin", "832455555");

    System.out.println(directory.get("Novikov"));
    System.out.println(directory.get("Fedin"));
    System.out.println(directory.get("Semenov"));
}