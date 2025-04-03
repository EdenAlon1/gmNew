package defpackage;

import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ki implements ob {
    final /* synthetic */ kk a;

    public ki(kk kkVar) {
        this.a = kkVar;
    }

    @Override // defpackage.ob
    public final void H(od odVar) {
        if (this.a.a.B()) {
            this.a.b.onPanelClosed(108, odVar);
        } else if (this.a.b.onPreparePanel(0, null, odVar)) {
            this.a.b.onMenuOpened(108, odVar);
        }
    }

    @Override // defpackage.ob
    public final boolean L(od odVar, MenuItem menuItem) {
        return false;
    }
}
