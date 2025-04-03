package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class khs implements kib {
    public Object a;
    public float ab;
    public float ac;
    public Object af;
    public kiu ag;
    final kie b;
    public kii c = null;
    public int d = 0;
    public int e = 0;
    public float f = -1.0f;
    public float g = -1.0f;
    protected float h = 0.5f;
    protected float i = 0.5f;
    protected int j = 0;
    protected int k = 0;
    protected int l = 0;
    protected int m = 0;
    protected int n = 0;
    protected int o = 0;
    protected int p = 0;
    protected int q = 0;
    protected int r = 0;
    protected int s = 0;
    protected int t = 0;
    protected int u = 0;
    int v = 0;
    int w = 0;
    float x = Float.NaN;
    float y = Float.NaN;
    float z = Float.NaN;
    float A = Float.NaN;
    float B = Float.NaN;
    float C = Float.NaN;
    float D = Float.NaN;
    float E = Float.NaN;
    float F = Float.NaN;
    float G = Float.NaN;
    float H = Float.NaN;
    int I = 0;
    protected Object J = null;
    protected Object K = null;
    protected Object L = null;
    protected Object M = null;
    protected Object N = null;
    protected Object O = null;
    protected Object P = null;
    protected Object Q = null;
    protected Object R = null;
    protected Object S = null;
    Object T = null;
    protected Object U = null;
    protected Object V = null;
    Object W = null;
    Object X = null;
    Object Y = null;
    Object Z = null;
    Object aa = null;
    public int ak = 0;
    public khz ad = khz.b(khz.b);
    public khz ae = khz.b(khz.b);
    public final HashMap ah = new HashMap();
    public HashMap ai = new HashMap();
    khh aj = null;

    public khs(kie kieVar) {
        this.b = kieVar;
    }

    private final void x(kiu kiuVar, Object obj, int i) {
        kiu b = obj instanceof kib ? ((kib) obj).b() : null;
        if (b == null) {
            return;
        }
        int i2 = i - 1;
        int i3 = khr.b;
        if (i2 == 19) {
            kiuVar.r(b, this.ab, (int) this.ac);
            return;
        }
        switch (i2) {
            case 0:
                kiuVar.V(2).n(b.V(2), this.j, this.p, false);
                break;
            case 1:
                kiuVar.V(2).n(b.V(4), this.j, this.p, false);
                break;
            case 2:
                kiuVar.V(4).n(b.V(2), this.k, this.q, false);
                break;
            case 3:
                kiuVar.V(4).n(b.V(4), this.k, this.q, false);
                break;
            case 4:
                kiuVar.V(2).n(b.V(2), this.l, this.r, false);
                break;
            case 5:
                kiuVar.V(2).n(b.V(4), this.l, this.r, false);
                break;
            case 6:
                kiuVar.V(4).n(b.V(2), this.m, this.s, false);
                break;
            case 7:
                kiuVar.V(4).n(b.V(4), this.m, this.s, false);
                break;
            case 8:
                kiuVar.V(3).n(b.V(3), this.n, this.t, false);
                break;
            case 9:
                kiuVar.V(3).n(b.V(5), this.n, this.t, false);
                break;
            case 10:
                kiuVar.aa(3, b, 6, this.n, this.t);
                break;
            case 11:
                kiuVar.V(5).n(b.V(3), this.o, this.u, false);
                break;
            case 12:
                kiuVar.V(5).n(b.V(5), this.o, this.u, false);
                break;
            case 13:
                kiuVar.aa(5, b, 6, this.o, this.u);
                break;
            case 14:
                kiuVar.aa(6, b, 6, this.v, this.w);
                break;
            case 15:
                kiuVar.aa(6, b, 3, this.v, this.w);
                break;
            case 16:
                kiuVar.aa(6, b, 5, this.v, this.w);
                break;
        }
    }

    @Override // defpackage.kib
    public final kii a() {
        return this.c;
    }

    @Override // defpackage.kib
    public kiu b() {
        kiu kiuVar = this.ag;
        if (kiuVar != null) {
            return kiuVar;
        }
        kiu kiuVar2 = new kiu(this.ad.j, this.ae.j);
        this.ag = kiuVar2;
        kiuVar2.aq = this.af;
        return kiuVar2;
    }

    public final Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof khs) ? (kib) this.b.e.get(obj) : obj;
    }

    @Override // defpackage.kib
    public final Object d() {
        return this.a;
    }

    @Override // defpackage.kib
    public void e() {
        if (this.ag == null) {
            return;
        }
        kii kiiVar = this.c;
        if (kiiVar != null) {
            kiiVar.e();
        }
        this.ad.d(this.ag, 0);
        this.ae.d(this.ag, 1);
        this.J = c(this.J);
        this.K = c(this.K);
        this.L = c(this.L);
        this.M = c(this.M);
        this.N = c(this.N);
        this.O = c(this.O);
        this.P = c(this.P);
        this.Q = c(this.Q);
        this.R = c(this.R);
        this.S = c(this.S);
        this.U = c(this.U);
        this.V = c(this.V);
        this.X = c(this.X);
        this.Y = c(this.Y);
        this.Z = c(this.Z);
        x(this.ag, this.J, 1);
        x(this.ag, this.K, 2);
        x(this.ag, this.L, 3);
        x(this.ag, this.M, 4);
        x(this.ag, this.N, 5);
        x(this.ag, this.O, 6);
        x(this.ag, this.P, 7);
        x(this.ag, this.Q, 8);
        x(this.ag, this.R, 9);
        x(this.ag, this.S, 10);
        x(this.ag, this.T, 11);
        x(this.ag, this.U, 12);
        x(this.ag, this.V, 13);
        x(this.ag, this.W, 14);
        x(this.ag, this.X, 15);
        x(this.ag, this.Y, 16);
        x(this.ag, this.Z, 17);
        x(this.ag, this.aa, 20);
        int i = this.d;
        if (i != 0) {
            this.ag.at = i;
        }
        int i2 = this.e;
        if (i2 != 0) {
            this.ag.au = i2;
        }
        float f = this.f;
        if (f != -1.0f) {
            this.ag.E(f);
        }
        float f2 = this.g;
        if (f2 != -1.0f) {
            this.ag.M(f2);
        }
        kiu kiuVar = this.ag;
        kiuVar.ao = this.h;
        kiuVar.ap = this.i;
        kif kifVar = kiuVar.u;
        kifVar.f = this.x;
        kifVar.g = this.y;
        kifVar.h = this.z;
        kifVar.i = this.A;
        kifVar.j = this.B;
        kifVar.k = this.C;
        kifVar.l = this.D;
        kifVar.m = this.E;
        kifVar.n = this.G;
        kifVar.o = this.H;
        kifVar.p = this.F;
        int i3 = this.I;
        kifVar.q = i3;
        kiuVar.ar = i3;
        kifVar.s = this.aj;
        for (String str : this.ah.keySet()) {
            Integer num = (Integer) this.ah.get(str);
            kif kifVar2 = this.ag.u;
            int intValue = num.intValue();
            if (kifVar2.r.containsKey(str)) {
                ((khf) kifVar2.r.get(str)).c = intValue;
            } else {
                kifVar2.r.put(str, new khf(str, intValue));
            }
        }
        HashMap hashMap = this.ai;
        if (hashMap != null) {
            for (String str2 : hashMap.keySet()) {
                float floatValue = ((Float) this.ai.get(str2)).floatValue();
                kif kifVar3 = this.ag.u;
                if (kifVar3.r.containsKey(str2)) {
                    ((khf) kifVar3.r.get(str2)).d = floatValue;
                } else {
                    kifVar3.r.put(str2, new khf(str2, floatValue));
                }
            }
        }
    }

    @Override // defpackage.kib
    public final void f(kiu kiuVar) {
        if (kiuVar == null) {
            return;
        }
        this.ag = kiuVar;
        kiuVar.aq = this.af;
    }

    public final void g(kii kiiVar) {
        this.c = kiiVar;
        f(kiiVar.b());
    }

    public final void h(Object obj) {
        this.ak = 15;
        this.X = obj;
    }

    public final void i(Object obj) {
        this.ak = 13;
        this.V = obj;
    }

    public final void j(Object obj) {
        this.ak = 12;
        this.U = obj;
    }

    public final void k() {
        int i = this.ak;
        if (i == 0) {
            this.J = null;
            this.K = null;
            this.j = 0;
            this.L = null;
            this.M = null;
            this.k = 0;
            this.N = null;
            this.O = null;
            this.l = 0;
            this.P = null;
            this.Q = null;
            this.m = 0;
            this.R = null;
            this.S = null;
            this.n = 0;
            this.U = null;
            this.V = null;
            this.o = 0;
            this.X = null;
            this.aa = null;
            this.h = 0.5f;
            this.i = 0.5f;
            this.p = 0;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = 0;
            return;
        }
        int i2 = i - 1;
        if (i2 == 19) {
            this.aa = null;
            return;
        }
        switch (i2) {
            case 0:
            case 1:
                this.J = null;
                this.K = null;
                this.j = 0;
                this.p = 0;
                break;
            case 2:
            case 3:
                this.L = null;
                this.M = null;
                this.k = 0;
                this.q = 0;
                break;
            case 4:
            case 5:
                this.N = null;
                this.O = null;
                this.l = 0;
                this.r = 0;
                break;
            case 6:
            case 7:
                this.P = null;
                this.Q = null;
                this.m = 0;
                this.s = 0;
                break;
            case 8:
            case 9:
            case 10:
                this.R = null;
                this.S = null;
                this.T = null;
                this.n = 0;
                this.t = 0;
                break;
            case 11:
            case 12:
            case 13:
                this.U = null;
                this.V = null;
                this.W = null;
                this.o = 0;
                this.u = 0;
                break;
            case 14:
                this.X = null;
                break;
        }
    }

    public final void l(Object obj) {
        this.ak = 8;
        this.Q = obj;
    }

    public final void m(Object obj) {
        this.ak = 7;
        this.P = obj;
    }

    public final void n(Object obj) {
        this.ak = 1;
        this.J = obj;
    }

    public void o(int i) {
        int i2 = this.ak;
        if (i2 == 0) {
            this.j = i;
            this.k = i;
            this.l = i;
            this.m = i;
            this.n = i;
            this.o = i;
            return;
        }
        int i3 = i2 - 1;
        if (i3 == 19) {
            this.ac = i;
            return;
        }
        switch (i3) {
            case 0:
            case 1:
                this.j = i;
                break;
            case 2:
            case 3:
                this.k = i;
                break;
            case 4:
            case 5:
                this.l = i;
                break;
            case 6:
            case 7:
                this.m = i;
                break;
            case 8:
            case 9:
            case 10:
                this.n = i;
                break;
            case 11:
            case 12:
            case 13:
                this.o = i;
                break;
            case 14:
            case 15:
            case 16:
                this.v = i;
                break;
        }
    }

    public final void p(int i) {
        int i2 = this.ak;
        if (i2 == 0) {
            this.p = i;
            this.q = i;
            this.r = i;
            this.s = i;
            this.t = i;
            this.u = i;
            return;
        }
        switch (i2 - 1) {
            case 0:
            case 1:
                this.p = i;
                break;
            case 2:
            case 3:
                this.q = i;
                break;
            case 4:
            case 5:
                this.r = i;
                break;
            case 6:
            case 7:
                this.s = i;
                break;
            case 8:
            case 9:
            case 10:
                this.t = i;
                break;
            case 11:
            case 12:
            case 13:
                this.u = i;
                break;
            case 14:
            case 15:
            case 16:
                this.w = i;
                break;
        }
    }

    public final void q(Object obj) {
        p(this.b.a(obj));
    }

    public final void r(Object obj) {
        this.ak = 4;
        this.M = obj;
    }

    public final void s(Object obj) {
        this.ak = 6;
        this.O = obj;
    }

    public final void t(Object obj) {
        this.ak = 5;
        this.N = obj;
    }

    public final void u(Object obj) {
        this.ak = 10;
        this.S = obj;
    }

    public final void v(Object obj) {
        this.ak = 9;
        this.R = obj;
    }

    public void w(Object obj) {
        o(this.b.a(obj));
    }
}
