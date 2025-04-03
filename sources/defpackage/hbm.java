package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbm {
    public static final int a(iqk iqkVar) {
        if (iqkVar != null) {
            return iqkVar.b;
        }
        return 0;
    }

    public static final int b(iqk iqkVar) {
        if (iqkVar != null) {
            return iqkVar.a;
        }
        return 0;
    }

    public static final int c(int i, int i2) {
        return i == Integer.MAX_VALUE ? Alert.DURATION_SHOW_INDEFINITELY : ffmk.f(i - i2, 0);
    }

    public static final Object d(inx inxVar) {
        Object f = inxVar.f();
        iog iogVar = f instanceof iog ? (iog) f : null;
        if (iogVar != null) {
            return iogVar.b();
        }
        return null;
    }
}
