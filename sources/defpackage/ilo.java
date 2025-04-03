package defpackage;

import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ilo {
    public static final void a(iki ikiVar, long j, ffji ffjiVar, boolean z) {
        MotionEvent a = ikiVar.a();
        if (a == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = a.getAction();
        if (z) {
            a.setAction(3);
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        a.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        ffjiVar.invoke(a);
        a.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        a.setAction(action);
    }
}
