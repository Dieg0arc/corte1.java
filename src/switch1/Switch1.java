package switch1;

public class Switch1 {
        public int option;

        public String showOptions(){
            switch (option){
                case 1:{
                    return "su premio es una gorra";
                }
                case 2:{
                    return "su premio es un bombom";
                }
                default :{
                    return "opcion incorrecta";
                }
            }
        }
    }


