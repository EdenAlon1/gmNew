package defpackage;

import android.app.Dialog;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwcp implements ljv {
    final /* synthetic */ Dialog a;
    final /* synthetic */ dn b;
    final /* synthetic */ dwcq c;
    final /* synthetic */ efwq d;
    private boolean e = false;

    public dwcp(dwcq dwcqVar, efwq efwqVar, Dialog dialog, dn dnVar) {
        this.d = efwqVar;
        this.a = dialog;
        this.b = dnVar;
        this.c = dwcqVar;
    }

    @Override // defpackage.ljv
    public final void d(lkr lkrVar) {
        if (this.e) {
            return;
        }
        efwq efwqVar = this.d;
        Dialog dialog = this.a;
        View b = dwct.b(this.b);
        efwr efwrVar = efwqVar.a;
        efwrVar.aj.b(b, efwrVar.ak.a(134405));
        iv ivVar = (iv) dialog;
        efwrVar.aj.b(ivVar.b(-1), efwrVar.ak.a(134407));
        efwrVar.aj.b(ivVar.b(-2), efwrVar.ak.a(134406));
        try {
            dn dnVar = this.b;
            dvxe c = dvxv.c(dwct.b(dnVar));
            c.getClass();
            dvxe c2 = dvxv.c(dwct.a(dnVar, true));
            c2.getClass();
            dwcm.a(c, c2);
            this.e = true;
        } catch (RuntimeException e) {
            this.c.b.a(e);
        }
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void c(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void f(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void ff(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void gZ(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void ha(lkr lkrVar) {
    }
}
