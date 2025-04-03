package defpackage;

import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ok implements MenuItem.OnMenuItemClickListener {
    final /* synthetic */ ol a;
    private final MenuItem.OnMenuItemClickListener b;

    public ok(ol olVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.a = olVar;
        this.b = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.b.onMenuItemClick(this.a.a(menuItem));
    }
}
