package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwmx implements Runnable {
    final /* synthetic */ dwmy a;

    public dwmx(dwmy dwmyVar) {
        this.a = dwmyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.a.a.getParent()).removeView(this.a.a);
        }
    }
}
