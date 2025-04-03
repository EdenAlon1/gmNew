package defpackage;

import androidx.car.app.model.Alert;

/* loaded from: classes6.dex */
public final class fghp {
    public static /* synthetic */ int a(String str, int i, int i2, int i3, int i4) {
        int i5 = i2 | (((i4 & 4) != 0 ? 0 : 1) ^ 1);
        if ((i4 & 8) != 0) {
            i3 = Alert.DURATION_SHOW_INDEFINITELY;
        }
        return fghr.a(str, i, i5, i3);
    }
}
