package PIN;

public class Pin {
    
    public boolean validatePIN(String pin) {
        if(pin.trim() == "") return false;
        if( (pin.length() != 4) && (pin.length() != 6) ) return false;
        
        for(int c : pin.toCharArray()) {
            if( (c > 57) || (c < 48) ) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Pin newPin = new Pin();
        System.out.println(newPin.validatePIN("123456"));
    }
}
