package defpackage;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.snackbar.Snackbar;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egbd {
    public final egau a;
    public final RecyclerView b;
    public final LinearProgressIndicator c;
    public final egdg d;
    public final egda e;
    public engw f;
    public int g;
    public final egdd h;
    public boolean i;
    public final View.OnClickListener j;

    public egbd(egav egavVar, egrf egrfVar, egdg egdgVar, egda egdaVar, egde egdeVar, lkr lkrVar, RecyclerView recyclerView, final LinearProgressIndicator linearProgressIndicator, final egjj egjjVar) {
        int i = engw.d;
        this.f = enou.a;
        this.i = true;
        this.d = egdgVar;
        this.e = egdaVar;
        egdd a = egdeVar.a(20);
        this.h = a;
        egdgVar.e(a.b());
        this.b = recyclerView;
        this.c = linearProgressIndicator;
        ((egle) egjjVar).a.f(lkrVar, new llh() { // from class: egaw
            @Override // defpackage.llh
            public final void a(Object obj) {
                eghw eghwVar = (eghw) obj;
                boolean isEmpty = eghwVar.b().isEmpty();
                final egbd egbdVar = egbd.this;
                if (!isEmpty) {
                    engw b = eghwVar.b();
                    int size = egbdVar.f.size() + 1;
                    int size2 = b.size() - egbdVar.f.size();
                    egau egauVar = egbdVar.a;
                    egauVar.a = b;
                    egauVar.w(size, size2);
                    egbdVar.f = eghwVar.b();
                    egbdVar.c.setVisibility(4);
                    if (egbdVar.i) {
                        egbdVar.i = false;
                        final egdc b2 = egbdVar.e.b(9);
                        b2.b();
                        egbdVar.b.post(new Runnable() { // from class: egba
                            @Override // java.lang.Runnable
                            public final void run() {
                                egbd egbdVar2 = egbd.this;
                                egdd egddVar = egbdVar2.h;
                                egddVar.c(b2.a());
                                egbdVar2.d.c(egddVar.a());
                            }
                        });
                        return;
                    }
                    return;
                }
                if (eghwVar.a().g()) {
                    egbdVar.c.setVisibility(4);
                    int ordinal = ((egdp) eghwVar.a().c()).ordinal();
                    if (ordinal == 0) {
                        final Snackbar q = Snackbar.q(egbdVar.b, R.string.op3_something_went_wrong, -2);
                        q.w(R.string.op3_dismiss, new View.OnClickListener() { // from class: egaz
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Snackbar.this.e();
                            }
                        });
                        q.i();
                    } else if (ordinal == 1) {
                        Snackbar q2 = Snackbar.q(egbdVar.b, R.string.op3_something_went_wrong, -2);
                        q2.w(R.string.op3_retry, egbdVar.j);
                        q2.i();
                    } else {
                        if (ordinal != 2) {
                            return;
                        }
                        Snackbar q3 = Snackbar.q(egbdVar.b, R.string.op3_check_your_connection, -2);
                        q3.w(R.string.op3_retry, egbdVar.j);
                        q3.i();
                    }
                }
            }
        });
        recyclerView.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(recyclerView.getResources().getInteger(R.integer.photo_picker_num_columns));
        gridLayoutManager.g = new egbb(gridLayoutManager);
        recyclerView.ap(gridLayoutManager);
        egax egaxVar = new egax(egrfVar);
        egaj egajVar = (egaj) egavVar.a.b();
        egajVar.getClass();
        dvyc dvycVar = (dvyc) egavVar.b.b();
        dvycVar.getClass();
        dvxi dvxiVar = (dvxi) egavVar.c.b();
        dvxiVar.getClass();
        egau egauVar = new egau(egajVar, dvycVar, dvxiVar, egaxVar);
        this.a = egauVar;
        recyclerView.am(egauVar);
        egjjVar.a(1000);
        this.g = 1000;
        recyclerView.z(new egbc(this, egjjVar));
        this.j = new View.OnClickListener() { // from class: egay
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LinearProgressIndicator.this.setVisibility(0);
                ((egle) egjjVar).b.c();
            }
        };
    }
}
