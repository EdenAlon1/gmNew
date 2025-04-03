package defpackage;

import android.net.Uri;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.snackbar.Snackbar;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egbw {
    public final egbn a;
    public final RecyclerView b;
    public final LinearProgressIndicator c;
    public final egdg d;
    public final egda e;
    public engw f;
    public int g;
    public final egdd h;
    public boolean i;
    public final View.OnClickListener j;
    public final int k;

    public egbw(egbo egboVar, egdg egdgVar, egda egdaVar, egde egdeVar, lmw lmwVar, final egrf egrfVar, lkr lkrVar, RecyclerView recyclerView, final LinearProgressIndicator linearProgressIndicator, final egjl egjlVar, emxc emxcVar, int i) {
        int i2 = engw.d;
        this.f = enou.a;
        this.i = true;
        this.d = egdgVar;
        this.e = egdaVar;
        this.k = i;
        final egjk egjkVar = (egjk) lmwVar.a(egjk.class);
        egdd a = egdeVar.a(21);
        this.h = a;
        egdgVar.e(a.b());
        this.b = recyclerView;
        this.c = linearProgressIndicator;
        egjlVar.a().f(lkrVar, new llh() { // from class: egbr
            @Override // defpackage.llh
            public final void a(Object obj) {
                egih egihVar = (egih) obj;
                boolean isEmpty = egihVar.c().isEmpty();
                final egbw egbwVar = egbw.this;
                if (!isEmpty) {
                    engw c = egihVar.c();
                    egbwVar.a.m(c, egbwVar.f.size() + (egbwVar.a.F() ? 1 : 0), c.size() - egbwVar.f.size());
                    egbwVar.f = c;
                    egbwVar.c.setVisibility(4);
                    if (egbwVar.i) {
                        egbwVar.i = false;
                        final egdc b = egbwVar.e.b(egbwVar.k);
                        b.b();
                        egbwVar.b.post(new Runnable() { // from class: egbq
                            @Override // java.lang.Runnable
                            public final void run() {
                                egbw egbwVar2 = egbw.this;
                                egdd egddVar = egbwVar2.h;
                                egddVar.c(b.a());
                                egbwVar2.d.c(egddVar.a());
                            }
                        });
                        return;
                    }
                    return;
                }
                if (egihVar.a().g()) {
                    egbwVar.c.setVisibility(4);
                    int ordinal = ((egdp) egihVar.a().c()).ordinal();
                    if (ordinal == 0) {
                        final Snackbar q = Snackbar.q(egbwVar.b, R.string.op3_something_went_wrong, -2);
                        q.w(R.string.op3_dismiss, new View.OnClickListener() { // from class: egbp
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Snackbar.this.e();
                            }
                        });
                        q.i();
                    } else if (ordinal == 1) {
                        Snackbar q2 = Snackbar.q(egbwVar.b, R.string.op3_something_went_wrong, -2);
                        q2.w(R.string.op3_retry, egbwVar.j);
                        q2.i();
                    } else {
                        if (ordinal != 2) {
                            return;
                        }
                        Snackbar q3 = Snackbar.q(egbwVar.b, R.string.op3_check_your_connection, -2);
                        q3.w(R.string.op3_retry, egbwVar.j);
                        q3.i();
                    }
                }
            }
        });
        recyclerView.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(recyclerView.getResources().getInteger(R.integer.photo_picker_num_columns));
        gridLayoutManager.g = new egbu(this, gridLayoutManager);
        recyclerView.ap(gridLayoutManager);
        egbl egblVar = new egbl() { // from class: egbs
            @Override // defpackage.egbl
            public final void a(Uri uri) {
                egjk.this.c = 9;
                egrfVar.m(uri);
            }
        };
        egaj egajVar = (egaj) egboVar.a.b();
        egajVar.getClass();
        dvyc dvycVar = (dvyc) egboVar.b.b();
        dvycVar.getClass();
        dvxi dvxiVar = (dvxi) egboVar.c.b();
        dvxiVar.getClass();
        egbn egbnVar = new egbn(egajVar, dvycVar, dvxiVar, egblVar, emxcVar);
        this.a = egbnVar;
        recyclerView.am(egbnVar);
        if (fdrm.l()) {
            recyclerView.w(new efzl((int) recyclerView.getResources().getDimension(R.dimen.photo_picker_grid_spacing), recyclerView.getResources().getInteger(R.integer.photo_picker_num_columns), 1, egbnVar.F()));
        }
        egjlVar.b(1000);
        this.g = 1000;
        recyclerView.z(new egbv(this, gridLayoutManager, egjlVar));
        this.j = new View.OnClickListener() { // from class: egbt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LinearProgressIndicator.this.setVisibility(0);
                egjlVar.c();
            }
        };
    }
}
