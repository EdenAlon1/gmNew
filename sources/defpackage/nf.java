package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nf implements nb {
    public final ActionMode.Callback a;
    public final Context b;
    final ArrayList c = new ArrayList();
    final cpn d = new cpn();

    public nf(Context context, ActionMode.Callback callback) {
        this.b = context;
        this.a = callback;
    }

    @Override // defpackage.nb
    public final void a(nc ncVar) {
        throw null;
    }

    @Override // defpackage.nb
    public final boolean b(nc ncVar, MenuItem menuItem) {
        throw null;
    }

    @Override // defpackage.nb
    public final boolean c(nc ncVar, Menu menu) {
        throw null;
    }

    @Override // defpackage.nb
    public final void d(nc ncVar, Menu menu) {
        throw null;
    }

    public final ActionMode e(nc ncVar) {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            ng ngVar = (ng) this.c.get(i);
            if (ngVar != null && ngVar.b == ncVar) {
                return ngVar;
            }
        }
        ng ngVar2 = new ng(this.b, ncVar);
        this.c.add(ngVar2);
        return ngVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Menu f(Menu menu) {
        Menu menu2 = (Menu) this.d.get(menu);
        if (menu2 != null) {
            return menu2;
        }
        ot otVar = new ot(this.b, menu);
        this.d.put(menu, otVar);
        return otVar;
    }
}
