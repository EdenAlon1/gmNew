package defpackage;

import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yy implements ob {
    final /* synthetic */ Toolbar a;

    public yy(Toolbar toolbar) {
        this.a = toolbar;
    }

    @Override // defpackage.ob
    public final void H(od odVar) {
        if (!this.a.a.j()) {
            this.a.v.b(odVar);
        }
        ob obVar = this.a.B;
        if (obVar != null) {
            obVar.H(odVar);
        }
    }

    @Override // defpackage.ob
    public final boolean L(od odVar, MenuItem menuItem) {
        return false;
    }
}
