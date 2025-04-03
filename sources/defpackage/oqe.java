package defpackage;

import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class oqe {
    public abstract oqd a(MotionEvent motionEvent);

    final boolean b(MotionEvent motionEvent) {
        oqd a = a(motionEvent);
        return (a == null || ((aeil) a).b == -1) ? false : true;
    }

    protected final boolean c(MotionEvent motionEvent) {
        oqd a;
        return (!b(motionEvent) || (a = a(motionEvent)) == null || ((aeil) a).a == null) ? false : true;
    }
}
