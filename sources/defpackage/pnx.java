package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pnx implements pnv {
    public static final pnx a = new pnx();

    private pnx() {
    }

    @Override // defpackage.pnv
    public final pme a(Activity activity, pnq pnqVar) {
        return pnw.a.a(activity, pnqVar);
    }

    @Override // defpackage.pnv
    public final pme b(Context context, pnq pnqVar) {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        WindowMetrics currentWindowMetrics2;
        float density;
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        bounds = currentWindowMetrics.getBounds();
        bounds.getClass();
        currentWindowMetrics2 = windowManager.getCurrentWindowMetrics();
        density = currentWindowMetrics2.getDensity();
        return new pme(bounds, density);
    }

    @Override // defpackage.pnv
    public final pme c(WindowMetrics windowMetrics, float f) {
        Rect bounds;
        float density;
        bounds = windowMetrics.getBounds();
        bounds.getClass();
        density = windowMetrics.getDensity();
        return new pme(bounds, density);
    }
}
