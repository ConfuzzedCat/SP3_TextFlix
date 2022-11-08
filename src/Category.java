//fix
// fix

enum Category {
//TODO Fix empty.
        EMPTY,
        ACTION,
        KIDS,
        CRIME,
        COMEDY,
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
        SPORT;
        public static Category findCategory(String s){
                switch(s.toUpperCase().replace(" ","")){
                        case "KIDS":
                                return KIDS;
                        case "ACTION":
                                return ACTION;
                        case "CRIME":
                                return CRIME;
                        case "THRILLER":
                                return THRILLER;
                        case "COMEDY":
                                return COMEDY;
                        case "HORROR":
                                return HORROR;
                        case "DRAMA":
                                return DRAMA;
                        case "ADVENTURE":
                                return ADVENTURE;
                        case "ROMANCE":
                                return ROMANCE;
                        case "FAMILY":
                                return FAMILY;
                        case "WAR":
                                return WAR;
                        case "WESTERN":
                                return WESTERN;
                        case "MUSICAL":
                                return MUSICAL;
                        case "BIOGRAPHY":
                                return BIOGRAPHY;
                        case "SCI-FI":
                                return SCI_FI;
                        case "HISTORY":
                                return HISTORY;
                        case "MUSIC":
                                return MUSIC;
                        case "FILM-NOIR":
                                return FILM_NOIR;
                        case "MYSTERY":
                                return MYSTERY;
                        case "SPORT":
                                return SPORT;

                }
                return EMPTY;
        }


    }


