enum Category {

        KIDS,
        CRIME,
        DRAMA,
        THRILLER,
        HORROR,
        ADVENTURE,
        ROMANCE,
        FAMILY,
        WAR,
        WESTERN,
        MUSICAL,
        BIOGRAPHY,
        SCI_FI,
        HISTORY,
        MUSIC,
        FILM_NOIR,
        MYSTERY,
        SPORT,

}

    class Main_Category {
        public static void main(String[] args) {
            Category myCategory = Category.ADVENTURE;

            switch(myCategory) {
                case KIDS:
                    System.out.println("Kids");
                    break;
                case CRIME:
                    System.out.println("Crime");
                    break;
                case DRAMA:
                    System.out.println("Drama");
                    break;
                case THRILLER:
                    System.out.println("Thriller");
                    break;
                case HORROR:
                    System.out.println("Horror");
                    break;
                case ADVENTURE:
                    System.out.println("Adventure");
                    break;
                case ROMANCE:
                    System.out.println("Romance");
                    break;
                case FAMILY:
                    System.out.println("Family");
                    break;
                case WAR:
                    System.out.println("War");
                    break;
                case WESTERN:
                    System.out.println("Western");
                    break;
                case MUSICAL:
                    System.out.println("Musical");
                    break;
                case BIOGRAPHY:
                    System.out.println("Biography");
                    break;
                case SCI_FI:
                    System.out.println("Sci-fi");
                    break;
                case HISTORY:
                    System.out.println("History");
                    break;
                case MUSIC:
                    System.out.println("Music");
                    break;
                case FILM_NOIR:
                    System.out.println("Film-Noir");
                    break;
                case MYSTERY:
                    System.out.println("Mystery");
                    break;
                case SPORT:
                    System.out.println("Sport");
                    break;
            }
        }
    }
