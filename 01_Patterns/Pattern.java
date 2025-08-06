package ProblemSolving.Patterns;

public class Pattern {
    // Pattern 1
    public static void Rectangular_Star_Pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    // Pattern 2
    public static void Right_Angled_Triangle_Pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    // Pattern 3
    public static void Right_Angled_Number_Pyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println("");
        }
    }

    // Pattern 4
    public static void Right_Angled_Number_Pyramid_II(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1 + " ");
            }
            System.out.println("");
        }
    }

    // Pattern 5
    public static void Inverted_Right_Pyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j >= 0; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    // Pattern 6
    public static void Inverted_Numbered_Right_Pyramid(int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println("");
        }
    }

    // Pattern 7
    public static void Increasing_Number_Triangle_Pattern(int n) {
        int cnt = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(cnt + " ");
                cnt++;
            }
            System.out.println("");
        }
    }

    // Pattern 8
    public static void Increasing_Letter_Triangle_Pattern(int n) {
        for (int i = 0; i < n; i++) {
            char ch = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(ch++ + " ");
            }
            System.out.println("");
        }
    }

    // Pattern 9
    public static void Reverse_Letter_Triangle_Pattern(int n) {
        for (int i = n - 1; i >= 0; i--) {
            char ch = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(ch++ + " ");
            }
            System.out.println("");
        }
    }

    // Pattern 10
    public static void Alpha_Ramp_Pattern(int n) {
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println("");
        }
    }

    // Pattern 11
    public static void Alpha_Triangle_Pattern(int n) {
        for (int i = 0; i < n; i++) {
            char ch = 'A';
            ch += +(n - i - 1);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println("");
        }
    }

    // Pattern 12
    public static void Half_Diamond_Star_Pattern(int n) {
        // Upper Part
        Right_Angled_Triangle_Pattern(n);
        // Lower Part
        Inverted_Right_Pyramid(n - 1);
    }

    // Pattern 13
    public static void Star_Pyramid(int n) {
        for (int i = 0; i < n; i++) {
            // Space
            for (int sp = 0; sp < n - i - 1; sp++)
                System.out.print(" ");
            // Star
            for (int st = 0; st < 2 * i + 1; st++)
                System.out.print("*");
            // Next Line
            System.out.println();
        }
    }

    // Pattern 14
    public static void Inverted_Star_Pyramid(int n) {
        for (int i = 0; i < n; i++) {
            // Space
            for (int sp = 0; sp < i; sp++)
                System.out.print(" ");
            // Star
            for (int st = 0; st < 2 * (n - i) - 1; st++)
                System.out.print("*");
            // Next Line
            System.out.println();
        }
    }

    // Pattern 15
    public static void Diamond_Star_Pattern(int n) {
        // Upper Part
        Star_Pyramid(n);
        // Lower Part
        Inverted_Star_Pyramid(n);
    }

    // Pattern 16
    public static void Hollow_Rectangle_Pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1)
                    System.out.print("*");
                else if (j == 0 || j == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }

    // Pattern 17
    public static void _0_1_Trinage(int n) {
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            flag = (i % 2 == 0) ? true : false;
            char val;
            for (int j = 0; j <= i; j++) {
                val = flag ? '1' : '0';
                flag = !flag;
                System.out.print(val + " ");
            }
            System.out.println("");
        }
    }
    
    // Pattern 18
    public static void butterfly_pattern(int n) {
        // Upperpart
        for(int i=0;i<n;i++){
            // Star
            for(int st=0;st<=i;st++)
                System.out.print("*");
            // Space
            for(int sp=0;sp<(n-i-1)*2;sp++)
                System.out.print(" ");
            // Star
            for(int st=0;st<=i;st++)
                System.out.print("*");
            
                // Next Line
            System.out.println("");
        }
    
        // LowerPart
        for(int i=0;i<n;i++){
            // Star
            for(int st=0;st<n-i;st++)
                System.out.print("*");
            // Space
            for(int sp=0;sp<i*2;sp++)
                System.out.print(" ");
            // Star
            for(int st=0;st<n-i;st++)
                System.out.print("*");
            
                // Next Line
            System.out.println("");
        }
    }

    // Pattern 19
    public static void solid_Rombus_pattern(int n){
        for(int i=0;i<n;i++){
            // Space
            for(int sp=0;sp<n-i-1;sp++)
                System.out.print(" ");
            // Star
            for(int st=0;st<n;st++)
                System.out.print("*");
            
            System.out.println("");
        }
    }

    // Pattern 20
    public static void hollow_Rombus_pattern(int n){
        for(int i=0;i<n;i++){
            // Space
            for(int sp=0;sp<n-i-1;sp++)
                System.out.print(" ");
            // Star
            for(int st=0;st<n;st++){
                if(i==0 || i==n-1)
                    System.out.print("*");
                else if(st==0 || st==n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            
            System.out.println("");
        }
    }

    // Pattern 21
    public static void number_Pyramid(int n){
        for(int i=0;i<n;i++){
        //    Space
        for(int sp=0;sp<n-i-1;sp++)
            System.out.print(" ");
        // Number
        for(int num=0;num<=i;num++)
            System.out.print(i+1+" ");
        // Next Line
            System.out.println("");
        }
    }

    // Pattern 22
    public static void palindromic_Number_Pattern(int n){
        for(int i=0;i<n;i++){
        //    Space
        for(int sp=0;sp<n-i-1;sp++)
            System.out.print(" ");
        // Number (desc)
        for(int num=i+1;num>=1;num--)
            System.out.print(num);
        // Number (asc)
        for(int num=2;num<=i+1;num++)
            System.out.print(num);
        // Next Line
            System.out.println("");
        }
    }

    // Pattern 23
    public static void alpha_hill_pattern(int n){
        for(int i=0;i<n;i++){
        //    Space
        for(int sp=0;sp<n-i-1;sp++)
            System.out.print(" ");
            char ch='A';
        // Number (desc)
        for(int num=i+1;num>=1;num--)
            System.out.print(ch++);
            --ch;
        // Number (asc)
        for(int num=2;num<=i+1;num++)
            System.out.print(--ch);
        // Next Line
            System.out.println("");
        }
    }

    // Pattern 24
    public static void Number_Crown_Pattern(int n) {
        for(int i=0;i<n;i++){
            // Number
            for(int num=0;num<=i;num++)
                System.out.print(num+1);
            
            // Space
            for(int sp=0;sp<(n-i-1)*2;sp++)
                System.out.print(" ");
            
            // Number
            for(int num=i+1;num>=1;num--)
                System.out.print(num);
            

            System.out.println("");
        }
    }


    // Pattern 25
    public static void Symmetric_Void_Pattern(int n) {
        // LowerPart
        for(int i=0;i<n;i++){
            // Star
            for(int st=0;st<n-i;st++)
                System.out.print("*");
            // Space
            for(int sp=0;sp<i*2;sp++)
                System.out.print(" ");
            // Star
            for(int st=0;st<n-i;st++)
                System.out.print("*");
            
                // Next Line
            System.out.println("");
        }
        // Upperpart
        for(int i=0;i<n;i++){
            // Star
            for(int st=0;st<=i;st++)
                System.out.print("*");
            // Space
            for(int sp=0;sp<(n-i-1)*2;sp++)
                System.out.print(" ");
            // Star
            for(int st=0;st<=i;st++)
                System.out.print("*");
            
                // Next Line
            System.out.println("");
        }
    
        
    }

    // Pattern 26
     public static void Number_Rectangle_Pattern(int n){
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top=i;
                int bottom=(2*n-1)-1-i;
                int left=j;
                int right=(2*n-1)-1-j;
                int val=Math.min(Math.min(top,bottom),Math.min(left,right));
                System.out.print(n-val);
            }
            System.out.println("");
        }
     }


    public static void main(String[] args) {
        Number_Rectangle_Pattern(4);
    }
}
