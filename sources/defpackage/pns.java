package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.WindowMetrics;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pns implements pnq {
    public static final pns a = new pns();

    private pns() {
    }

    @Override // defpackage.pnq
    public final float a(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    @Override // defpackage.pnq
    public final float b(Configuration configuration, WindowMetrics windowMetrics) {
        return configuration.densityDpi / 160.0f;
    }
}
