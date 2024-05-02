package OOP;

import java.security.PrivateKey;

public class cv2 {
    public class Country{
        private int Population;
        private double Area;
        private String Code;
        private String Name;

        public String getCode(){
            return Code;
        }

        public double getArea(){
            return Area;
        }

        public void setCode(String countryCode){
            if (countryCode.length() == 3){
                this.Code = Code;
            }
            System.out.println("Nelze nastavit");
        }

        public void setPopulation(int Population){
            if (Population > 0){
                this.Population = Population;
            }
        }

        public Country(int population, double area, String code, String name) {
            Population = population;
            Area = area;
            Code = code;
            Name = name;
        }

    }
}
