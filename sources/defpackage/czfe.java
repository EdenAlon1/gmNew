package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czfe implements Runnable {
    final /* synthetic */ czfg a;

    public czfe(czfg czfgVar) {
        this.a = czfgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        czfi czfiVar = this.a.h;
        if (((czgj) czfiVar).n) {
            czfiVar.a();
        }
        czgj czgjVar = (czgj) this.a.h;
        if (czgjVar.m) {
            czha czhaVar = czgjVar.b;
            if (czhaVar == null) {
                csjy.f("Bugle", "Compose2oDynamicImeStrategy: input sink is null");
                return;
            }
            View p = czhaVar.p();
            if (p == null) {
                csjy.f("Bugle", "Compose2oDynamicImeStrategy: c2o root is null");
                return;
            } else {
                p.setVisibility(8);
                this.a.h.c(false);
            }
        }
        this.a.b.z(16);
    }
}
