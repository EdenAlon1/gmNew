package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fcj {
    public final jvj a;
    public final fhy b;
    public long c;
    public final jlm d;
    private final jlm e;
    private final long f;
    private final jpg g;

    public fcj(jlm jlmVar, long j, jpg jpgVar, jvj jvjVar, fhy fhyVar) {
        this.e = jlmVar;
        this.f = j;
        this.g = jpgVar;
        this.a = jvjVar;
        this.b = fhyVar;
        this.c = j;
        this.d = jlmVar;
    }

    private final int A() {
        return this.a.a(jpm.a(this.c));
    }

    private final void B() {
        int a;
        this.b.a();
        if (g().length() <= 0 || (a = a()) == -1) {
            return;
        }
        h(a, a);
    }

    private final void C() {
        Integer e;
        this.b.a();
        if (g().length() <= 0 || (e = e()) == null) {
            return;
        }
        int intValue = e.intValue();
        h(intValue, intValue);
    }

    private final void D() {
        int b;
        this.b.a();
        if (g().length() <= 0 || (b = b()) == -1) {
            return;
        }
        h(b, b);
    }

    private final void E() {
        Integer f;
        this.b.a();
        if (g().length() <= 0 || (f = f()) == null) {
            return;
        }
        int intValue = f.intValue();
        h(intValue, intValue);
    }

    private final int y(int i) {
        return ffmk.g(i, g().length() - 1);
    }

    private final int z(jpg jpgVar, int i) {
        int A = A();
        fhy fhyVar = this.b;
        if (fhyVar.a == null) {
            fhyVar.a = Float.valueOf(jpgVar.n(A).b);
        }
        int h = jpgVar.h(A) + i;
        if (h < 0) {
            return 0;
        }
        if (h >= jpgVar.f()) {
            return g().length();
        }
        float b = jpgVar.b(h) - 1.0f;
        Float f = this.b.a;
        f.getClass();
        float floatValue = f.floatValue();
        if ((i() && floatValue >= jpgVar.d(h)) || (!i() && floatValue <= jpgVar.c(h))) {
            return jpgVar.g(h, true);
        }
        return this.a.b(jpgVar.k((Float.floatToRawIntBits(f.floatValue()) << 32) | (Float.floatToRawIntBits(b) & 4294967295L)));
    }

    public final int a() {
        return evr.a(this.d.b, jpm.a(this.c));
    }

    public final int b() {
        return evr.b(this.d.b, jpm.a(this.c));
    }

    public final Integer c() {
        jpg jpgVar = this.g;
        if (jpgVar == null) {
            return null;
        }
        return Integer.valueOf(this.a.b(jpgVar.g(jpgVar.h(this.a.a(jpm.c(this.c))), true)));
    }

    public final Integer d() {
        jpg jpgVar = this.g;
        if (jpgVar == null) {
            return null;
        }
        return Integer.valueOf(this.a.b(jpgVar.j(jpgVar.h(this.a.a(jpm.d(this.c))))));
    }

    public final Integer e() {
        int a;
        jpg jpgVar = this.g;
        if (jpgVar == null) {
            return null;
        }
        int A = A();
        while (true) {
            if (A < this.e.a()) {
                long l = jpgVar.l(y(A));
                if (jpm.a(l) > A) {
                    a = this.a.b(jpm.a(l));
                    break;
                }
                A++;
            } else {
                a = this.e.a();
                break;
            }
        }
        return Integer.valueOf(a);
    }

    public final Integer f() {
        int i;
        jpg jpgVar = this.g;
        if (jpgVar == null) {
            return null;
        }
        int A = A();
        while (true) {
            if (A > 0) {
                long l = jpgVar.l(y(A));
                if (jpm.e(l) < A) {
                    i = this.a.b(jpm.e(l));
                    break;
                }
                A--;
            } else {
                i = 0;
                break;
            }
        }
        return Integer.valueOf(i);
    }

    public final String g() {
        return this.d.b;
    }

    public final void h(int i, int i2) {
        long a = jpn.a(i, i2);
        long j = jpm.a;
        this.c = a;
    }

    public final boolean i() {
        jpg jpgVar = this.g;
        return (jpgVar != null ? jpgVar.r(A()) : null) != jyi.b;
    }

    public final void j() {
        if (g().length() > 0) {
            long j = this.f;
            long j2 = jpm.a;
            this.c = jpn.a(jpm.e(j), jpm.a(this.c));
        }
    }

    public final void k() {
        jpg jpgVar;
        if (g().length() <= 0 || (jpgVar = this.g) == null) {
            return;
        }
        int z = z(jpgVar, 1);
        h(z, z);
    }

    public final void l() {
        this.b.a();
        if (g().length() > 0) {
            if (i()) {
                D();
            } else {
                B();
            }
        }
    }

    public final void m() {
        this.b.a();
        if (g().length() > 0) {
            if (i()) {
                E();
            } else {
                C();
            }
        }
    }

    public final void n() {
        this.b.a();
        if (g().length() > 0) {
            int a = evq.a(g(), jpm.c(this.c));
            if (a == jpm.c(this.c) && a != g().length()) {
                a = evq.a(g(), a + 1);
            }
            h(a, a);
        }
    }

    public final void o() {
        this.b.a();
        if (g().length() > 0) {
            int b = evq.b(g(), jpm.d(this.c));
            if (b == jpm.d(this.c) && b != 0) {
                b = evq.b(g(), b - 1);
            }
            h(b, b);
        }
    }

    public final void p() {
        this.b.a();
        if (g().length() > 0) {
            if (i()) {
                B();
            } else {
                D();
            }
        }
    }

    public final void q() {
        this.b.a();
        if (g().length() > 0) {
            if (i()) {
                C();
            } else {
                E();
            }
        }
    }

    public final void r() {
        this.b.a();
        if (g().length() > 0) {
            int length = g().length();
            h(length, length);
        }
    }

    public final void s() {
        this.b.a();
        if (g().length() > 0) {
            h(0, 0);
        }
    }

    public final void t() {
        Integer c;
        this.b.a();
        if (g().length() <= 0 || (c = c()) == null) {
            return;
        }
        int intValue = c.intValue();
        h(intValue, intValue);
    }

    public final void u() {
        this.b.a();
        if (g().length() > 0) {
            if (i()) {
                w();
            } else {
                t();
            }
        }
    }

    public final void v() {
        this.b.a();
        if (g().length() > 0) {
            if (i()) {
                t();
            } else {
                w();
            }
        }
    }

    public final void w() {
        Integer d;
        this.b.a();
        if (g().length() <= 0 || (d = d()) == null) {
            return;
        }
        int intValue = d.intValue();
        h(intValue, intValue);
    }

    public final void x() {
        jpg jpgVar;
        if (g().length() <= 0 || (jpgVar = this.g) == null) {
            return;
        }
        int z = z(jpgVar, -1);
        h(z, z);
    }
}
