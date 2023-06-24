package homework_6;


import java.util.List;

// оригинал: public class UserGroup implements Iterable<User>{
/* Заменил, чтобы не принимать классы типов, не работающих C UserGroupIterator 
 * соответственно во всех методах заменил класс User на обобщения 
*/
public class UserGroup<T extends User> implements Iterable<T>{
    private List<T> users;

    public UserGroup(List<T> users) {
        this.users = users;
    }

    public List<T> getUsers() {
        return users;
    }

    public void setUsers(List<T> users) {
        this.users = users;
    }

    // Убрал конкретную реализацию вывода,
    // т.к. для каждого класса-наследника предполагаем свою
    
    /* @Override
    public String toString() {
        return "UserGroup{" +
               "users=" + users +
               '}';
    } */

    @Override
    public UserGroupIterator<T> iterator() {
        return new UserGroupIterator<T>(this.users);
    }
}
