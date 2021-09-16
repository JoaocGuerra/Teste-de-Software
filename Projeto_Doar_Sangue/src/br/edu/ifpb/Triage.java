package br.edu.ifpb;

public class Triage {
    public boolean stepOne(String sex, int age, boolean isDonor, double weight ){
        if ((sex.equals("masculino") && weight >= 60) || (sex.equals("feminino") && weight >= 50)){
            if (age >= 16 && age<= 69){
                if (age < 60) return true;
                else{
                    if (isDonor) return true;
                    else{
                        System.out.println("Não é possível doar sangue\nNunca doou sangue antes.\n");
                        return false;
                    }
                }
            }
            else{
                System.out.println("Não é possível doar sangue\nIdade não permitida.\n");
                return false;
            }
        }
        else{
            System.out.println("Não é possível doar sangue\nPeso inferior ao peso mínimo.\n");
            return false;
        }
    }


    public boolean stepTwo(String sex, boolean isFever, boolean isPregnant, boolean isBreastfeeding, boolean isChildbirthOK) {
        if (!isFever){
            if(sex.equals("masculino")) return true;
            else{
               if (!isPregnant){
                   if (!isBreastfeeding || isChildbirthOK) return true;
                   else {
                       System.out.println("Não é possível doar sangue\nEstá amamentando há menos de 12 meses.\n");
                       return false;
                   }
               }
               else {
                   System.out.println("Não é possível doar sangue\nEstá grávida.\n");
                   return false;
               }
            }
        }
        else{
            System.out.println("Não é possível doar sangue\nEstá com febre.\n");
            return false;
        }
    }
}
