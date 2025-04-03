package defpackage;

import android.view.View;
import com.google.android.material.snackbar.Snackbar;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vwp implements ellh {
    final /* synthetic */ vvn a;

    public vwp(vvn vvnVar) {
        this.a = vvnVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        cyko cykoVar = (cyko) ellfVar;
        String c = cykoVar.c();
        String b = cykoVar.b();
        final Runnable a = cykoVar.a();
        vvn vvnVar = this.a;
        Snackbar r = Snackbar.r(vvnVar.cr, c, 0);
        r.o();
        r.n(vvnVar.u());
        r.t(b, new View.OnClickListener() { // from class: vnx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                enru enruVar = vvn.a;
                a.run();
            }
        });
        r.i();
        return elli.a;
    }
}
