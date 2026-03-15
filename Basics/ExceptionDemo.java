class ExceptionDemo {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0) {
                throw new AkashExceptions("I dont want zero");
            }
        }

        catch (AkashExceptions e) {
            j = 18 / 1;
            System.out.println("thats the default Output " + e);
        }

        catch (ArithmeticException e) {
            j = 18 / 1;
            System.out.println("thats the default Output");
        }

        catch (Exception e) {
            System.out.println("Something went wrong " + e);
        }
        System.out.println(j);
    }
}

class AkashExceptions extends Exception {
    public AkashExceptions(String message) {
    }
}

//10:15