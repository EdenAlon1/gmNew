package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fax {
    public static final int a(boolean z, int i, int i2) {
        if (z || !c(i)) {
            return ffmk.f(i2, 1);
        }
        return 1;
    }

    public static final long b(long j, boolean z, int i, float f) {
        int i2 = Alert.DURATION_SHOW_INDEFINITELY;
        if ((z || c(i)) && jzk.i(j)) {
            i2 = jzk.b(j);
        }
        if (jzk.d(j) != i2) {
            i2 = ffmk.i(evx.a(f), jzk.d(j), i2);
        }
        return jzj.b(0, i2, 0, jzk.a(j));
    }

    public static final boolean c(int i) {
        return jyw.a(i, 2) || jyw.a(i, 4) || jyw.a(i, 5);
    }
}
