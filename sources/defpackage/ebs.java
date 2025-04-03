package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.foundation.layout.UnspecifiedConstraintsElement;
import androidx.compose.foundation.layout.WrapContentElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebs {
    private static final FillElement a = new FillElement(2, 1.0f);
    private static final FillElement b = new FillElement(1, 1.0f);
    private static final FillElement c = new FillElement(3, 1.0f);
    private static final WrapContentElement d;
    private static final WrapContentElement e;
    private static final WrapContentElement f;
    private static final WrapContentElement g;
    private static final WrapContentElement h;
    private static final WrapContentElement i;

    static {
        int i2 = huo.a;
        d = ecz.c(hum.k);
        e = ecz.c(hum.j);
        f = ecz.a(hum.n);
        g = ecz.a(hum.m);
        h = ecz.b(hum.e);
        i = ecz.b(hum.a);
    }

    public static /* synthetic */ hvi A(hvi hviVar) {
        int i2 = huo.a;
        hun hunVar = hum.k;
        return hviVar.a(ffkj.e(hunVar, hunVar) ? d : ffkj.e(hunVar, hum.j) ? e : ecz.c(hunVar));
    }

    public static final hvi a(hvi hviVar, float f2, float f3) {
        return hviVar.a(new UnspecifiedConstraintsElement(f2, f3));
    }

    public static final hvi b(hvi hviVar, float f2) {
        return hviVar.a(f2 == 1.0f ? b : new FillElement(1, f2));
    }

    public static final hvi c(hvi hviVar, float f2) {
        return hviVar.a(f2 == 1.0f ? c : new FillElement(3, f2));
    }

    public static final hvi d(hvi hviVar, float f2) {
        return hviVar.a(f2 == 1.0f ? a : new FillElement(2, f2));
    }

    public static final hvi e(hvi hviVar, float f2) {
        return hviVar.a(new SizeElement(0.0f, f2, 0.0f, f2, true, 5));
    }

    public static final hvi f(hvi hviVar, float f2, float f3) {
        return hviVar.a(new SizeElement(0.0f, f2, 0.0f, f3, true, 5));
    }

    public static final hvi g(hvi hviVar, float f2) {
        return hviVar.a(new SizeElement(0.0f, f2, 0.0f, f2, false, 5));
    }

    public static final hvi h(hvi hviVar, float f2) {
        return hviVar.a(new SizeElement(f2, f2, f2, f2, false));
    }

    public static final hvi i(hvi hviVar, float f2, float f3) {
        return hviVar.a(new SizeElement(f2, f3, f2, f3, false));
    }

    public static final hvi j(hvi hviVar, float f2) {
        return hviVar.a(new SizeElement(f2, 0.0f, f2, 0.0f, false, 10));
    }

    public static final hvi k(hvi hviVar, float f2) {
        return hviVar.a(new SizeElement(f2, f2, f2, f2, true));
    }

    public static final hvi l(hvi hviVar, long j) {
        return m(hviVar, jzv.b(j), jzv.a(j));
    }

    public static final hvi m(hvi hviVar, float f2, float f3) {
        return hviVar.a(new SizeElement(f2, f3, f2, f3, true));
    }

    public static final hvi n(hvi hviVar, float f2, float f3, float f4, float f5) {
        return hviVar.a(new SizeElement(f2, f3, f4, f5, true));
    }

    public static final hvi o(hvi hviVar, float f2) {
        return hviVar.a(new SizeElement(f2, 0.0f, f2, 0.0f, true, 10));
    }

    public static final hvi p(hvi hviVar, float f2, float f3) {
        return hviVar.a(new SizeElement(f2, 0.0f, f3, 0.0f, true, 10));
    }

    public static /* synthetic */ hvi q(hvi hviVar, float f2, float f3, int i2) {
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        if (1 == (i2 & 1)) {
            f2 = Float.NaN;
        }
        return a(hviVar, f2, f3);
    }

    public static /* synthetic */ hvi u(hvi hviVar, float f2, float f3, int i2) {
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        if (1 == (i2 & 1)) {
            f2 = Float.NaN;
        }
        return f(hviVar, f2, f3);
    }

    public static /* synthetic */ hvi w(hvi hviVar, float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 8) != 0) {
            f5 = Float.NaN;
        }
        if ((i2 & 4) != 0) {
            f4 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        if (1 == (i2 & 1)) {
            f2 = Float.NaN;
        }
        return n(hviVar, f2, f3, f4, f5);
    }

    public static /* synthetic */ hvi x(hvi hviVar, float f2, float f3, int i2) {
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        if (1 == (i2 & 1)) {
            f2 = Float.NaN;
        }
        return p(hviVar, f2, f3);
    }

    public static /* synthetic */ hvi y(hvi hviVar) {
        int i2 = huo.a;
        hus husVar = hum.n;
        return hviVar.a(ffkj.e(husVar, husVar) ? f : ffkj.e(husVar, hum.m) ? g : ecz.a(husVar));
    }

    public static /* synthetic */ hvi z(hvi hviVar, huo huoVar, int i2) {
        if ((i2 & 1) != 0) {
            int i3 = huo.a;
            huoVar = hum.e;
        }
        int i4 = huo.a;
        return hviVar.a(ffkj.e(huoVar, hum.e) ? h : ffkj.e(huoVar, hum.a) ? i : ecz.b(huoVar));
    }
}
