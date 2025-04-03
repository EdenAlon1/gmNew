package defpackage;

import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chrt {
    public static final chrt a = new chrt();
    private static final List b = new ArrayList();

    private chrt() {
    }

    public final synchronized void a(MotionEvent motionEvent) {
        List list = b;
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.getClass();
        list.add(obtain);
    }
}
