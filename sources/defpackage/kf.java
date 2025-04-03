package defpackage;

import android.view.Menu;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kf implements Runnable {
    final /* synthetic */ kk a;

    public kf(kk kkVar) {
        this.a = kkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kk kkVar = this.a;
        Menu a = kkVar.a();
        Menu menu = true != (a instanceof od) ? null : a;
        if (menu != null) {
            ((od) menu).s();
        }
        try {
            a.clear();
            if (!kkVar.b.onCreatePanelMenu(0, a) || !kkVar.b.onPreparePanel(0, null, a)) {
                a.clear();
            }
            if (menu != null) {
                ((od) menu).r();
            }
        } catch (Throwable th) {
            if (menu != null) {
                ((od) menu).r();
            }
            throw th;
        }
    }
}
