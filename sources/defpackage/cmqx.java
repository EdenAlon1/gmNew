package defpackage;

import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmqx implements PopupWindow.OnDismissListener {
    private final elbx a;
    private final cmqs b;

    public cmqx(elbx elbxVar, cmqs cmqsVar) {
        this.a = elbxVar;
        this.b = cmqsVar;
    }

    public final void a() {
        this.b.b();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ekzm b = this.a.b("LoggingOnDismissListener_onDismiss");
        try {
            a();
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
