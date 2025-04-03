package defpackage;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import androidx.window.layout.adapter.sidecar.SidecarCompat;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pnd implements View.OnAttachStateChangeListener {
    private final SidecarCompat a;
    private final WeakReference b;

    public pnd(SidecarCompat sidecarCompat, Activity activity) {
        this.a = sidecarCompat;
        this.b = new WeakReference(activity);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        view.removeOnAttachStateChangeListener(this);
        Activity activity = (Activity) this.b.get();
        IBinder a = pnb.a(activity);
        if (activity == null || a == null) {
            return;
        }
        this.a.b(a, activity);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
    }
}
