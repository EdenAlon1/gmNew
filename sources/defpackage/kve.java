package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kve {
    public static kxh a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        kxh o = kxh.o(rootWindowInsets);
        o.s(o);
        o.q(view.getRootView());
        return o;
    }

    public static void b(View view, int i, int i2) {
        view.setScrollIndicators(i, 3);
    }
}
