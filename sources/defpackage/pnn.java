package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pnn implements pnj {
    public static final pnn b = new pnn();

    private pnn() {
    }

    @Override // defpackage.pnj
    public final Rect a(Activity activity) {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        currentWindowMetrics = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
        bounds = currentWindowMetrics.getBounds();
        bounds.getClass();
        return bounds;
    }
}
