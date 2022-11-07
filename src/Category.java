//fix
// fix

enum Category {
//TODO Fix empty.
        EMPTY,
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
        SPORT;
        public static Category findCategory(String s){
                switch(s.toUpperCase().replace(" ","")){
                        case "KIDS":
                                return KIDS;
                        case "CRIME":
                                return CRIME;
                        case "THRILLER":
                                return THRILLER;
                        case "HORROR":
                                return HORROR;
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
                        case "SCI_FI":
                                return SCI_FI;
                        case "HISTORY":
                                return HISTORY;
                        case "MUSIC":
                                return MUSIC;
                        case "FILM_NOIR":
                                return FILM_NOIR;
                        case "MYSTERY":
                                return MYSTERY;
                        case "SPORT":
                                return SPORT;

                }
                return EMPTY;
        }


    }


