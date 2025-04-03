package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class ktq {
    private final GestureDetector a;

    public ktq(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public final void a(boolean z) {
        this.a.setIsLongpressEnabled(z);
    }

    public final boolean b(MotionEvent motionEvent) {
        return this.a.onTouchEvent(motionEvent);
    }

    public ktq(Context context, GestureDetector.OnGestureListener onGestureListener, byte[] bArr) {
        this.a = new GestureDetector(context, onGestureListener, null);
    }
}
