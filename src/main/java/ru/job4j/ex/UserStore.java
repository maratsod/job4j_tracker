package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(login)) {
                System.out.println(login + " is found");
            }
            break;
        }
        if (login == null) {
            throw new UserNotFoundException("User is not found");
        }
        return null;
    }


    public static boolean validate(User user) throws UserInvalidException {
        String username = user.getUsername();
        if (username.length()<3) {
            throw new UserInvalidException("User is not valid");
        }
        if (user.isValid() == false) {
            throw new UserInvalidException("User is not valid");
        }
        return false;
    }

    public static void main(String[] args) {
        try {
            User[] users = {new User("Petr Arsentev", true)};
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ea) {
            System.out.println("User is not found");
        } catch (UserNotFoundException en) {
            System.out.println("User is not valid");
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
