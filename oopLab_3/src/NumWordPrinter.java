public class NumWordPrinter {
    public String printWord(int n){
        if(n%2==0 && n%11==0 && n%13==0) return "EvenPrimeLucky";
        if(n%2==0 && n%11==0) return "EvenPrimeEleven";
        if(n%2==0) return "Even";
        if(n%11==0) return "PrimeEleven";
        if(n%13==0) return "LuckyThirteen";
        return "OddOneOut";
    }
}
