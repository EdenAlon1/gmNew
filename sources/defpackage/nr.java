package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: PG */
/* loaded from: classes.dex */
class nr {
    final Context a;
    public cpn b;
    public cpn c;

    public nr(Context context) {
        this.a = context;
    }

    final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof kqn)) {
            return menuItem;
        }
        kqn kqnVar = (kqn) menuItem;
        if (this.b == null) {
            this.b = new cpn();
        }
        MenuItem menuItem2 = (MenuItem) this.b.get(kqnVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        ol olVar = new ol(this.a, kqnVar);
        this.b.put(kqnVar, olVar);
        return olVar;
    }

    final SubMenu b(SubMenu subMenu) {
        if (!(subMenu instanceof kqo)) {
            return subMenu;
        }
        kqo kqoVar = (kqo) subMenu;
        if (this.c == null) {
            this.c = new cpn();
        }
        SubMenu subMenu2 = (SubMenu) this.c.get(kqoVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        oz ozVar = new oz(this.a, kqoVar);
        this.c.put(kqoVar, ozVar);
        return ozVar;
    }
}
