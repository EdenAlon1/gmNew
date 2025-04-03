package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsls implements Runnable {
    final /* synthetic */ dslv a;

    public dsls(dslv dslvVar) {
        this.a = dslvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        dslv dslvVar = this.a;
        if (!dslvVar.aF() || (view = dslvVar.Q) == null) {
            return;
        }
        view.requestLayout();
    }
}
