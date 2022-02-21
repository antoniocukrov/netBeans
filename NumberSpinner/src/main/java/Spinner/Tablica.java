package Spinner;

public class Tablica  {
    int a;
    int b;
    int aa;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getAa() {
        return aa;
    }

    public void setAa(int aa) {
        this.aa = aa;
    }
        
    public int[][] Krug(){
        int cik[][] = new int[a][b];
        aa = a;
        int bb = b;
        int krug = 0;
        int brojac = 0;
        while (brojac <= (aa * bb)) {
            for (; b > krug; b--) {
                if (brojac == (aa * bb)) {
                    break;
                }
                cik[a - 1][b - 1] = ++brojac;
            }

            for (b++, a--; a > krug; a--) {
                if (brojac == (aa * bb)) {
                    break;
                }
                cik[a - 1][b - 1] = ++brojac;

            }

            for (a++, b++; b <= (bb - krug); ++b) {
                if (brojac == (aa * bb)) {
                    break;
                }
                cik[a - 1][b - 1] = ++brojac;

            }

            for (b--, a++; a < (aa - krug); ++a) {
                if (brojac == (aa * bb)) {
                    break;
                }
                cik[a - 1][b - 1] = ++brojac;
            }
            krug++;
            a--;
            b--;
            if (brojac == (aa * bb)) {
                break;
            }
        }

        /*for (int i = 0; i < aa; i++) {
            System.out.println(Arrays.toString(cik[i]));
        }*/
        return cik;
        }
        
    }

