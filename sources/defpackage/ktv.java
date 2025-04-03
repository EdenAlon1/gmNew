package defpackage;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ktv {
    public final Runnable a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final Map c = new HashMap();

    public ktv(Runnable runnable) {
        this.a = runnable;
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((fa) it.next()).a.ac(menu, menuInflater);
        }
    }

    public final void b(Menu menu) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((fa) it.next()).a.ae(menu);
        }
    }

    public final boolean c(MenuItem menuItem) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (((fa) it.next()).a.ad(menuItem)) {
                return true;
            }
        }
        return false;
    }
}
