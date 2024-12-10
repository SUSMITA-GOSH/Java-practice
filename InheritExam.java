abstract class P {
    int p = 70;

    P(int p) {
        this.p = p;
        System.out.println("Const: P = " + p);
    }

    void pm() {
        System.out.println("PM: " + p);
    }

    abstract void d();
}

class Q extends P {
    int q = 60;

    Q(int p, int q) {
        super(p);
        this.q = q;
        System.out.println("Const: Q = " + q);
    }

    void d() {
        p++;
        System.out.println("QD: " + p);
    }
}

class R extends Q {
    int r = 40;
     int p=50;
    R(int p, int q, int r) {
        super(p, q);
        this.r = r;
        System.out.println("Const: R = " + r);
    }

    void d() {
        p--;
        System.out.println("RD: " + p);
    }
}

class InheritExam {
    public static void main(String args[]) {
        R r = new R(30, 20, 10);
        r.pm();  // Calls pm() from P
        r.d();   // Calls d() from R

        P p = r;
        p.d();   // Calls d() from R
        p.pm();  // Calls pm() from P
       p.p=200 ;r.d();

        Q q = r;
        q.p=300;
        
        q.d();   // Calls d() from R
        r.d();
    }
}

