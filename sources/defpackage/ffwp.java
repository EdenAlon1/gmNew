package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffwp {
    public static /* synthetic */ ffwm a(int i, int i2, int i3) {
        if (1 == (i3 & 1)) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if (i == -2) {
            return i2 == 1 ? new ffwi(ffwl.a) : new ffwz(1, i2);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? i2 == 1 ? new ffwi(i) : new ffwz(i, i2) : new ffwi(Alert.DURATION_SHOW_INDEFINITELY) : i2 == 1 ? new ffwi(0) : new ffwz(1, i2);
        }
        if (i2 == 1) {
            return new ffwz(1, 2);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }
}
