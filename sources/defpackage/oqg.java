package defpackage;

import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oqg {
    public static boolean a(int i, int i2) {
        return (i & i2) != 0;
    }

    static boolean b(MotionEvent motionEvent) {
        return motionEvent.getActionMasked() == 0;
    }

    static boolean c(MotionEvent motionEvent) {
        return motionEvent.getActionMasked() == 2;
    }

    static boolean d(MotionEvent motionEvent) {
        return motionEvent.getActionMasked() == 1;
    }

    public static boolean e(MotionEvent motionEvent, int i) {
        return (motionEvent.getButtonState() & i) == i;
    }

    static boolean f(MotionEvent motionEvent) {
        return a(motionEvent.getMetaState(), 4096);
    }

    static boolean g(MotionEvent motionEvent) {
        return e(motionEvent, 1);
    }

    static boolean h(MotionEvent motionEvent) {
        return e(motionEvent, 4);
    }
}
