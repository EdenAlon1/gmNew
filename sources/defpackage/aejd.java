package defpackage;

import android.support.v7.widget.LinearLayoutManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aejd extends vm {
    final /* synthetic */ vx a;
    final /* synthetic */ aeje b;

    public aejd(aeje aejeVar, vx vxVar) {
        this.a = vxVar;
        this.b = aejeVar;
    }

    private final void h() {
        if (((LinearLayoutManager) this.a).L() == 0) {
            this.b.a.ak(0);
        }
    }

    @Override // defpackage.vm
    public final void d(int i, int i2) {
        if (i == 0) {
            h();
        }
    }

    @Override // defpackage.vm
    public final void g(int i, int i2) {
        if (i2 == 0 || i == 0) {
            h();
        }
    }
}
