package defpackage;

import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nu implements Runnable {
    final /* synthetic */ nw a;
    final /* synthetic */ MenuItem b;
    final /* synthetic */ od c;
    final /* synthetic */ nv d;

    public nu(nv nvVar, nw nwVar, MenuItem menuItem, od odVar) {
        this.d = nvVar;
        this.a = nwVar;
        this.b = menuItem;
        this.c = odVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nw nwVar = this.a;
        if (nwVar != null) {
            this.d.a.f = true;
            nwVar.b.i(false);
            this.d.a.f = false;
        }
        MenuItem menuItem = this.b;
        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
            this.c.z(menuItem, 4);
        }
    }
}
