package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kbu {
    public static final kbt a = new kbt();

    public static final float a(int i) {
        return -i;
    }

    public static final float b(float f) {
        return -f;
    }

    public static final int c(int i) {
        return 1 != i ? 1 : 2;
    }

    public static final void d(View view, iui iuiVar) {
        long a2 = iod.a(iuiVar.y());
        int round = Math.round(Float.intBitsToFloat((int) (a2 >> 32)));
        int round2 = Math.round(Float.intBitsToFloat((int) (a2 & 4294967295L)));
        view.layout(round, round2, view.getMeasuredWidth() + round, view.getMeasuredHeight() + round2);
    }
}
