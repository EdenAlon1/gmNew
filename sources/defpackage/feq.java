package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class feq {
    public static final jyi a(jpg jpgVar, int i) {
        if (jpgVar.a.a.a() != 0) {
            int h = jpgVar.h(i);
            if ((i != 0 && h == jpgVar.h(i - 1)) || (i != jpgVar.a.a.a() && h == jpgVar.h(i + 1))) {
                return jpgVar.q(i);
            }
        }
        return jpgVar.r(i);
    }

    public static final int b(int i, int i2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 != 1) {
                return 3;
            }
            int i4 = i - 1;
            if (i4 != 0) {
                return i4 != 1 ? 3 : 2;
            }
        }
        return 1;
    }
}
