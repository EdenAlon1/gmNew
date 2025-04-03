package defpackage;

import android.app.Dialog;
import android.view.MenuItem;
import com.google.android.apps.messaging.R;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vuh implements MenuItem.OnActionExpandListener {
    final /* synthetic */ vvn a;

    public vuh(vvn vvnVar) {
        this.a = vvnVar;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.action_search) {
            vvn vvnVar = this.a;
            vvnVar.aW.ifPresent(new Consumer() { // from class: vug
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((czqb) obj).b();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            MenuItem menuItem2 = this.a.r;
            if (menuItem2 != null) {
                menuItem2.setShowAsAction(1);
            }
            MenuItem menuItem3 = this.a.s;
            if (menuItem3 != null) {
                menuItem3.setShowAsAction(1);
            }
        }
        vvn vvnVar2 = this.a;
        vvnVar2.cp = null;
        vvnVar2.P();
        this.a.aa();
        return true;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_search) {
            return true;
        }
        vvn vvnVar = this.a;
        int i = vvnVar.ay.i(vvnVar.p(), 12200000);
        if (i != 0) {
            Dialog a = vvnVar.ay.a(vvnVar.p(), i, 0, null);
            a.getClass();
            a.show();
            return false;
        }
        menuItem.setVisible(false);
        MenuItem menuItem2 = this.a.r;
        if (menuItem2 != null) {
            menuItem2.setShowAsAction(0);
        }
        MenuItem menuItem3 = this.a.s;
        if (menuItem3 == null) {
            return true;
        }
        menuItem3.setShowAsAction(0);
        return true;
    }
}
