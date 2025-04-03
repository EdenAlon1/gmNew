package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pnw implements pnv {
    public static final pnw a = new pnw();

    private pnw() {
    }

    @Override // defpackage.pnv
    public final pme a(Activity activity, pnq pnqVar) {
        return new pme(new pgm(pnj.a.a().a(activity)), pnqVar.a(activity));
    }

    @Override // defpackage.pnv
    public final pme b(Context context, pnq pnqVar) {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        float f = context.getResources().getDisplayMetrics().density;
        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        bounds = currentWindowMetrics.getBounds();
        bounds.getClass();
        return new pme(bounds, f);
    }

    @Override // defpackage.pnv
    public final pme c(WindowMetrics windowMetrics, float f) {
        Rect bounds;
        bounds = windowMetrics.getBounds();
        bounds.getClass();
        return new pme(bounds, f);
    }
}
