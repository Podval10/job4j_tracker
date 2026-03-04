package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String name) throws UserNotFoundException {
         User result = null;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername() == name) {
               result = users[i];
               break;
            }

        }
        if (result == null){
            throw new UserNotFoundException("Пользователя не найдено");
        }
        return result;
    }

    public static boolean validate(User user) throws UserInvalidException {
      //   boolean result = true;

        if ( !user.isValid()  || user.getUsername().length() < 3) {
        //   result = false;
            throw new UserInvalidException("Пользователь не валидный");

        }
        return true;
    }

    public static void main(String[] args) {
        try {
        User[] users = {
                new User("Petr Arsentev", false),
            //    new User("Pe", true)
        };
        String login = "Petr Arsentev";
        User user = UserStore.findUser(users, login);
        if (validate(user)) {
            System.out.println("This user has an access");
        }
        } catch (UserInvalidException ea) {
            ea.printStackTrace();
        } catch (UserNotFoundException ea) {
            ea.printStackTrace();
        } catch (Exception e) {

        }

    }
}
