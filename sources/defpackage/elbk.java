package defpackage;

import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class elbk implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ elbx a;
    public final /* synthetic */ String b;
    public final /* synthetic */ MenuItem.OnMenuItemClickListener c;

    public /* synthetic */ elbk(elbx elbxVar, String str, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.a = elbxVar;
        this.b = str;
        this.c = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        elbx elbxVar = this.a;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.c;
        ekzm b = elbxVar.b(this.b);
        try {
            boolean onMenuItemClick = onMenuItemClickListener.onMenuItemClick(menuItem);
            b.close();
            return onMenuItemClick;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
