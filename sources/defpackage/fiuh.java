package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiuh {
    private final ArrayList a = new ArrayList();
    private Object b;

    private final Object G() {
        Object obj = this.b;
        if (obj == null) {
            if (this.a.size() == 2) {
                ArrayList arrayList = this.a;
                Object obj2 = arrayList.get(0);
                Object obj3 = arrayList.get(1);
                if (obj2 == null) {
                    obj = obj3;
                } else if (obj2 == obj3 || obj3 == null) {
                    obj = obj2;
                }
            }
            if (obj == null) {
                obj = new fitu(this.a);
            }
            this.b = obj;
        }
        return obj;
    }

    private static final void H(fiup fiupVar) {
        if (fiupVar == null) {
            throw new IllegalArgumentException("No parser supplied");
        }
    }

    private static final boolean I(Object obj) {
        if (obj instanceof fiuo) {
            return ((obj instanceof fitu) && ((fitu) obj).b == null) ? false : true;
        }
        return false;
    }

    static void b(Appendable appendable, int i) {
        while (true) {
            i--;
            if (i < 0) {
                return;
            } else {
                appendable.append((char) 65533);
            }
        }
    }

    static boolean c(CharSequence charSequence, int i, String str) {
        int length = str.length();
        if (charSequence.length() - i < length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (charSequence.charAt(i + i2) != str.charAt(i2)) {
                return false;
            }
        }
        return true;
    }

    static boolean d(CharSequence charSequence, int i, String str) {
        char upperCase;
        char upperCase2;
        int length = charSequence.length() - i;
        int length2 = str.length();
        if (length < length2) {
            return false;
        }
        for (int i2 = 0; i2 < length2; i2++) {
            char charAt = charSequence.charAt(i + i2);
            char charAt2 = str.charAt(i2);
            if (charAt != charAt2 && (upperCase = Character.toUpperCase(charAt)) != (upperCase2 = Character.toUpperCase(charAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                return false;
            }
        }
        return true;
    }

    public final void A(int i) {
        n(firf.t, i, 2);
    }

    public final void B(int i) {
        n(firf.h, i, 2);
    }

    public final void C(int i) {
        n(firf.v, i, 2);
    }

    public final void D(int i) {
        n(firf.l, i, 2);
    }

    public final void E(int i, int i2) {
        t(firf.k, i, i2);
    }

    public final void F(int i, int i2) {
        t(firf.f, i, i2);
    }

    public final fits a() {
        Object G = G();
        fiuq fiuqVar = (!(G instanceof fiuq) || ((G instanceof fitu) && ((fitu) G).a == null)) ? null : (fiuq) G;
        fiuo fiuoVar = I(G) ? (fiuo) G : null;
        if (fiuqVar == null && fiuoVar == null) {
            throw new UnsupportedOperationException("Both printing and parsing not supported");
        }
        return new fits(fiuqVar, fiuoVar);
    }

    public final fiup e() {
        Object G = G();
        if (I(G)) {
            return fiup.b((fiuo) G);
        }
        throw new UnsupportedOperationException("Parsing is not supported");
    }

    public final void f(Object obj) {
        this.b = null;
        this.a.add(obj);
        this.a.add(obj);
    }

    public final void g(fiuq fiuqVar, fiuo fiuoVar) {
        this.b = null;
        this.a.add(fiuqVar);
        this.a.add(fiuoVar);
    }

    public final void h(firf firfVar) {
        f(new fiub(firfVar, true));
    }

    public final void i(firf firfVar) {
        f(new fiub(firfVar, false));
    }

    public final void j(boolean z) {
        f(new fiue(null, "Z", z, 2));
    }

    public final void k(fits fitsVar) {
        if (fitsVar == null) {
            throw new IllegalArgumentException("No formatter supplied");
        }
        g(fitsVar.a, fitsVar.b);
    }

    public final void l(fiup fiupVar) {
        H(fiupVar);
        g(null, fiul.b(fiupVar));
    }

    public final void m(fiup[] fiupVarArr) {
        int length = fiupVarArr.length;
        fiuo[] fiuoVarArr = new fiuo[length];
        int i = 0;
        while (i < length - 1) {
            fiuo b = fiul.b(fiupVarArr[i]);
            fiuoVarArr[i] = b;
            if (b == null) {
                throw new IllegalArgumentException("Incomplete parser array");
            }
            i++;
        }
        fiuoVarArr[i] = fiul.b(fiupVarArr[i]);
        g(null, new fitx(fiuoVarArr));
    }

    public final void n(firf firfVar, int i, int i2) {
        if (i >= 0) {
            if (i2 < i) {
                i2 = i;
            }
            if (i2 > 0) {
                if (i <= 1) {
                    f(new fiug(firfVar, i2, false));
                    return;
                } else {
                    f(new fitz(firfVar, i2, false, i));
                    return;
                }
            }
        }
        throw new IllegalArgumentException();
    }

    public final void o(firf firfVar, int i) {
        f(new fitv(firfVar, i));
    }

    public final void p(firf firfVar, int i, int i2) {
        if (i >= 0) {
            if (i2 < i) {
                i2 = i;
            }
            if (i2 > 0) {
                f(new fitw(firfVar, i, i2));
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    public final void q(char c) {
        f(new fitt(c));
    }

    public final void r(String str) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                f(new fiua(str));
            } else {
                f(new fitt(str.charAt(0)));
            }
        }
    }

    public final void s(fiup fiupVar) {
        H(fiupVar);
        g(null, new fitx(new fiuo[]{fiul.b(fiupVar), null}));
    }

    public final void t(firf firfVar, int i, int i2) {
        if (i >= 0) {
            if (i2 < i) {
                i2 = i;
            }
            if (i2 > 0) {
                if (i <= 1) {
                    f(new fiug(firfVar, i2, true));
                    return;
                } else {
                    f(new fitz(firfVar, i2, true, i));
                    return;
                }
            }
        }
        throw new IllegalArgumentException();
    }

    public final void u(String str, boolean z, int i) {
        f(new fiue(str, str, z, i));
    }

    public final void v(int i) {
        n(firf.i, i, 2);
    }

    public final void w(int i) {
        n(firf.m, i, 1);
    }

    public final void x(int i) {
        n(firf.g, i, 3);
    }

    public final void y(int i, int i2) {
        p(firf.u, i, i2);
    }

    public final void z(int i) {
        n(firf.r, i, 2);
    }
}
