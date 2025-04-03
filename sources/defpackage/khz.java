package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class khz {
    public static final Object a = new String("FIXED_DIMENSION");
    public static final Object b = new String("WRAP_DIMENSION");
    public static final Object c = new String("SPREAD_DIMENSION");
    public static final Object d = new String("PARENT_DIMENSION");
    public static final Object e = new String("PERCENT_DIMENSION");
    public static final Object f = new String("RATIO_DIMENSION");
    int g;
    int h;
    float i;
    int j;
    String k;
    Object l;
    boolean m;

    private khz() {
        this.g = 0;
        this.h = Alert.DURATION_SHOW_INDEFINITELY;
        this.i = 1.0f;
        this.j = 0;
        this.k = null;
        this.l = b;
        this.m = false;
    }

    public static khz a(int i) {
        khz khzVar = new khz(a);
        khzVar.l = null;
        khzVar.j = i;
        return khzVar;
    }

    public static khz b(Object obj) {
        khz khzVar = new khz(a);
        khzVar.l = obj;
        return khzVar;
    }

    public static khz c(Object obj) {
        khz khzVar = new khz();
        khzVar.f(obj);
        return khzVar;
    }

    public final void d(kiu kiuVar, int i) {
        String str = this.k;
        if (str != null) {
            kiuVar.z(str);
        }
        int i2 = 0;
        if (i == 0) {
            if (this.m) {
                kiuVar.ab(3);
                Object obj = this.l;
                if (obj == b) {
                    i2 = 1;
                } else if (obj == e) {
                    i2 = 2;
                }
                kiuVar.D(i2, this.g, this.h, this.i);
                return;
            }
            int i3 = this.g;
            if (i3 > 0) {
                kiuVar.K(i3);
            }
            int i4 = this.h;
            if (i4 < Integer.MAX_VALUE) {
                kiuVar.I(i4);
            }
            Object obj2 = this.l;
            if (obj2 == b) {
                kiuVar.ab(2);
                return;
            }
            if (obj2 == d) {
                kiuVar.ab(4);
                return;
            } else {
                if (obj2 == null) {
                    kiuVar.ab(1);
                    kiuVar.N(this.j);
                    return;
                }
                return;
            }
        }
        if (this.m) {
            kiuVar.ac(3);
            Object obj3 = this.l;
            if (obj3 == b) {
                i2 = 1;
            } else if (obj3 == e) {
                i2 = 2;
            }
            kiuVar.L(i2, this.g, this.h, this.i);
            return;
        }
        int i5 = this.g;
        if (i5 > 0) {
            kiuVar.J(i5);
        }
        int i6 = this.h;
        if (i6 < Integer.MAX_VALUE) {
            kiuVar.H(i6);
        }
        Object obj4 = this.l;
        if (obj4 == b) {
            kiuVar.ac(2);
            return;
        }
        if (obj4 == d) {
            kiuVar.ac(4);
        } else if (obj4 == null) {
            kiuVar.ac(1);
            kiuVar.C(this.j);
        }
    }

    public final void e(int i) {
        if (i >= 0) {
            this.g = i;
        }
    }

    public final void f(Object obj) {
        this.l = obj;
        this.m = true;
    }

    public khz(Object obj) {
        this.g = 0;
        this.h = Alert.DURATION_SHOW_INDEFINITELY;
        this.i = 1.0f;
        this.j = 0;
        this.k = null;
        this.m = false;
        this.l = obj;
    }
}
