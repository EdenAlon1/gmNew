package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebwf {
    public static int a(int i) {
        if (i == 32) {
            return 0;
        }
        if (i == 48) {
            return 1;
        }
        if (i != 120) {
            return i != 240 ? 2 : 5;
        }
        return 3;
    }

    public static int b(Context context, int i) {
        if (i <= 0) {
            return 64;
        }
        float f = i / context.getResources().getDisplayMetrics().density;
        int[] iArr = {32, 48, 64, 120, 240};
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                throw null;
            }
            if (f <= i3) {
                return i3;
            }
        }
        return 240;
    }
}
