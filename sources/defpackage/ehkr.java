package defpackage;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import com.google.android.apps.messaging.R;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehkr implements ob {
    final /* synthetic */ ehku a;

    public ehkr(ehku ehkuVar) {
        this.a = ehkuVar;
    }

    @Override // defpackage.ob
    public final boolean L(od odVar, MenuItem menuItem) {
        int i;
        nzh nzhVar;
        int i2;
        nzh e;
        obu obuVar = this.a.d;
        if (obuVar != null) {
            nzq nzqVar = new nzq();
            nzqVar.a = true;
            nyj nyjVar = obuVar.a;
            nzh e2 = nyjVar.e();
            e2.getClass();
            nzl nzlVar = e2.d;
            nzlVar.getClass();
            og ogVar = (og) menuItem;
            if (nzlVar.g(ogVar.a) instanceof nwm) {
                nzqVar.c = R.anim.nav_default_enter_anim;
                nzqVar.d = R.anim.nav_default_exit_anim;
                nzqVar.e = R.anim.nav_default_pop_enter_anim;
                nzqVar.f = R.anim.nav_default_pop_exit_anim;
            } else {
                nzqVar.c = R.animator.nav_default_enter_anim;
                nzqVar.d = R.animator.nav_default_exit_anim;
                nzqVar.e = R.animator.nav_default_pop_enter_anim;
                nzqVar.f = R.animator.nav_default_pop_exit_anim;
            }
            if ((ogVar.c & 196608) == 0) {
                nzqVar.b(nzj.b(nyjVar.f()).j, false, false);
            }
            nzr a = nzqVar.a();
            try {
                i = ((og) menuItem).a;
                ffdn ffdnVar = nyjVar.f;
                nzhVar = ffdnVar.isEmpty() ? nyjVar.b : ((nxm) ffdnVar.e()).b;
            } catch (IllegalArgumentException e3) {
                Log.i("NavigationUI", "Ignoring onNavDestinationSelected for MenuItem " + nzb.a(nyjVar.a, ogVar.a) + " as it cannot be found from the current destination " + nyjVar.e(), e3);
            }
            if (nzhVar == null) {
                throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + nyjVar + '.');
            }
            nxd d = nzhVar.d(i);
            Bundle bundle = null;
            if (d != null) {
                i2 = d.a;
                Bundle bundle2 = d.c;
                if (bundle2 != null) {
                    bundle = kqr.a((ffcf[]) Arrays.copyOf(new ffcf[0], 0));
                    bundle.putAll(bundle2);
                }
            } else {
                i2 = i;
            }
            if (i2 == 0) {
                int i3 = a.c;
                if (i3 != -1) {
                    if (i3 != -1) {
                        nyjVar.t(i3, a.d);
                    }
                    e = nyjVar.e();
                    if (e != null && obw.a(e, ((og) menuItem).a)) {
                    }
                    return true;
                }
                i2 = 0;
            }
            if (i2 == 0) {
                throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
            }
            nzh q = nyj.q(nyjVar, i2);
            if (q != null) {
                nyjVar.s(q, bundle, a);
                e = nyjVar.e();
                if (e != null) {
                }
                return true;
            }
            String a2 = nzb.a(nyjVar.a, i2);
            if (d == null) {
                throw new IllegalArgumentException(a.o(nzhVar, a2, "Navigation action/destination ", " cannot be found from the current destination "));
            }
            throw new IllegalArgumentException("Navigation destination " + a2 + " referenced from action " + nzb.a(nyjVar.a, i) + " cannot be found from the current destination " + nzhVar);
        }
        return false;
    }

    @Override // defpackage.ob
    public final void H(od odVar) {
    }
}
