package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class elaz implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ elbx a;
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener b;
    public final /* synthetic */ String c;

    public /* synthetic */ elaz(elbx elbxVar, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, String str) {
        this.a = elbxVar;
        this.b = onGlobalLayoutListener;
        this.c = str;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.b;
        if (ekyf.v()) {
            onGlobalLayoutListener.onGlobalLayout();
            return;
        }
        ekzm b = this.a.b(this.c);
        try {
            onGlobalLayoutListener.onGlobalLayout();
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
