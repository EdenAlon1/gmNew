package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jcj implements jgi {
    private final ViewConfiguration a;

    public jcj(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // defpackage.jgi
    public final float a() {
        int scaledHandwritingGestureLineMargin;
        if (Build.VERSION.SDK_INT < 34) {
            return 16.0f;
        }
        scaledHandwritingGestureLineMargin = this.a.getScaledHandwritingGestureLineMargin();
        return scaledHandwritingGestureLineMargin;
    }

    @Override // defpackage.jgi
    public final float b() {
        int scaledHandwritingSlop;
        if (Build.VERSION.SDK_INT < 34) {
            return 2.0f;
        }
        scaledHandwritingSlop = this.a.getScaledHandwritingSlop();
        return scaledHandwritingSlop;
    }

    @Override // defpackage.jgi
    public final float c() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.jgi
    public final float d() {
        return this.a.getScaledTouchSlop();
    }

    @Override // defpackage.jgi
    public final long e() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // defpackage.jgi
    public final long f() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // defpackage.jgi
    public final /* synthetic */ long g() {
        return jzr.b(48.0f, 48.0f);
    }

    @Override // defpackage.jgi
    public final void h() {
    }
}
