package defpackage;

import android.content.Intent;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.material.snackbar.Snackbar;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
class admc implements ejwd<List<eixn>> {
    final /* synthetic */ adme a;

    public admc(adme admeVar) {
        this.a = admeVar;
    }

    @Override // defpackage.ejwd
    public final void a(Throwable th) {
        Throwable th2 = null;
        this.a.q = null;
        Throwable th3 = th;
        while (th3 != null) {
            Throwable a = ekho.a(th3);
            if ((a instanceof dfqi) || (a instanceof UserRecoverableAuthException)) {
                th2 = a;
                break;
            }
            th3 = a.getCause();
        }
        if (th2 == null) {
            adme.a.s("Load accounts failed due to non user recoverable error.", th);
            View view = this.a.c.Q;
            view.getClass();
            Snackbar q = Snackbar.q(view, R.string.bugle_load_account_failure, -2);
            q.w(R.string.bugle_retry, new elay(this.a.f, "Load account error, click retry", new View.OnClickListener() { // from class: adma
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    admc.this.a.a();
                }
            }));
            q.i();
            return;
        }
        final Intent a2 = th2 instanceof dfqi ? ((dfqi) th2).a() : ((UserRecoverableAuthException) th2).a();
        if (a2 == null) {
            csjb e = adme.a.e();
            e.I("Load accounts failed due to user recoverable error.");
            e.s(th2);
            View view2 = this.a.c.Q;
            view2.getClass();
            Snackbar.q(view2, R.string.bugle_play_services_error, -2).i();
            return;
        }
        View view3 = this.a.c.Q;
        view3.getClass();
        Snackbar q2 = Snackbar.q(view3, R.string.bugle_play_services_error, -2);
        q2.w(R.string.bugle_fix_it, new elay(this.a.f, "Play services error, click fix", new View.OnClickListener() { // from class: admb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                admc.this.a.c.startActivityForResult(a2, 29878);
            }
        }));
        q2.i();
    }

    @Override // defpackage.ejwd
    public final /* synthetic */ void b(Object obj) {
        int i = engw.d;
        engr engrVar = new engr();
        for (eixn eixnVar : (List) obj) {
            if (eixnVar.b().k.equals("pseudonymous")) {
                this.a.q = eixnVar.a();
            } else {
                engrVar.h(eixnVar);
            }
        }
        engw g = engrVar.g();
        if (g.isEmpty()) {
            ((deki) this.a.p.b()).b(null);
        }
        ((ebpl) this.a.k).a.a(g);
    }

    @Override // defpackage.ejwd
    public final /* synthetic */ void hB() {
    }
}
