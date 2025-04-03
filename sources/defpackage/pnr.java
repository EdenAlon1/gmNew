package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pnr implements pnq {
    public static final pnr a = new pnr();

    private pnr() {
    }

    @Override // defpackage.pnq
    public final float a(Context context) {
        WindowMetrics currentWindowMetrics;
        float density;
        currentWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
        density = currentWindowMetrics.getDensity();
        return density;
    }

    @Override // defpackage.pnq
    public final float b(Configuration configuration, WindowMetrics windowMetrics) {
        float density;
        density = windowMetrics.getDensity();
        return density;
    }
}
