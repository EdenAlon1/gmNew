package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hg {
    public static final int a(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 4) {
            return 4;
        }
        if (i == 8) {
            return 3;
        }
        throw new IllegalArgumentException(a.h(i, "Unknown visibility "));
    }

    public static final int b(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return a(view.getVisibility());
    }
}
