package defpackage;

import android.view.ViewConfiguration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxd {
    public static final float a = ViewConfiguration.getScrollFriction();

    public static final cyj a(hfd hfdVar) {
        jzn jznVar = (jzn) hfdVar.e(jdr.e);
        boolean A = hfdVar.A(jznVar.ec());
        Object f = hfdVar.f();
        if (A || f == hfc.a) {
            f = new cyj(new cxc(jznVar));
            hfdVar.y(f);
        }
        return (cyj) f;
    }
}
