package defpackage;

import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jy implements op {
    final /* synthetic */ jz a;

    public jy(jz jzVar) {
        this.a = jzVar;
    }

    @Override // defpackage.op
    public final void a(od odVar, boolean z) {
        od a = odVar.a();
        jx w = this.a.w(a != odVar ? a : odVar);
        if (w != null) {
            if (a == odVar) {
                this.a.C(w, z);
            } else {
                this.a.A(w.a, w, a);
                this.a.C(w, true);
            }
        }
    }

    @Override // defpackage.op
    public final boolean b(od odVar) {
        Window.Callback x;
        if (odVar != odVar.a()) {
            return true;
        }
        jz jzVar = this.a;
        if (!jzVar.A || (x = jzVar.x()) == null || this.a.H) {
            return true;
        }
        x.onMenuOpened(108, odVar);
        return true;
    }
}
