package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.snackbar.Snackbar;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efvf extends efvh {
    public lmw a;
    public egde ag;
    public egda ah;
    public egrf ai;
    public egdd aj;
    public RecyclerView ak;
    public LinearProgressIndicator al;
    public efvj am;
    public int an;
    public View.OnClickListener ao;
    public efzp ap;
    public engw aq;
    public efux ar;
    public efzq b;
    public dvxy c;
    public dvyc d;
    public egdg e;

    public efvf() {
        int i = engw.d;
        this.aq = enou.a;
    }

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.photo_picker_infinite_scroll_layout_art_style, viewGroup, false);
        this.c.b(inflate, this.d.a(128093));
        kvo.r(inflate, this.m.getString("collectionTitleKey"));
        if (fdrm.h()) {
            kvd.k(inflate, new kud() { // from class: efvc
                @Override // defpackage.kud
                public final kxh ey(View view, kxh kxhVar) {
                    kpt f = kxhVar.f(519);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    marginLayoutParams.leftMargin = f.b;
                    marginLayoutParams.bottomMargin = f.e;
                    marginLayoutParams.rightMargin = f.d;
                    marginLayoutParams.topMargin = f.c;
                    view.setLayoutParams(marginLayoutParams);
                    return kxh.a;
                }
            });
        }
        return inflate;
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) {
        super.ae(bundle);
        MaterialToolbar materialToolbar = (MaterialToolbar) this.Q.findViewById(R.id.photo_picker_infinite_scroll_toolbar);
        materialToolbar.x(this.m.getString("collectionTitleKey"));
        this.ai.k(this);
        materialToolbar.t(new View.OnClickListener() { // from class: efuz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                efvf.this.ai.l();
            }
        });
        efvj efvjVar = (efvj) this.a.a(efvj.class);
        this.am = efvjVar;
        long j = this.m.getLong("collectionIdKey");
        if (!efvjVar.d.g()) {
            efvjVar.d = emxc.j(Long.valueOf(j));
            llf llfVar = efvjVar.b;
            lld a = efvjVar.a.a(j).a();
            final llf llfVar2 = efvjVar.b;
            llfVar.p(a, new llh() { // from class: efvi
                @Override // defpackage.llh
                public final void a(Object obj) {
                    llf.this.j((egen) obj);
                }
            });
        }
        this.ak = (RecyclerView) this.Q.findViewById(R.id.photo_picker_recycler_grid);
        this.al = (LinearProgressIndicator) this.Q.findViewById(R.id.photo_picker_loading_view);
        this.am.b.f(Q(), new llh() { // from class: efva
            @Override // defpackage.llh
            public final void a(Object obj) {
                egen egenVar = (egen) obj;
                boolean isEmpty = egenVar.b().isEmpty();
                efvf efvfVar = efvf.this;
                if (!isEmpty) {
                    engw b = egenVar.b();
                    int size = b.size() - efvfVar.aq.size();
                    efzp efzpVar = efvfVar.ap;
                    int size2 = efvfVar.aq.size();
                    efzpVar.f = b;
                    efzpVar.w(size2, size);
                    efvfVar.aq = b;
                    efvfVar.al.setVisibility(4);
                    efvj efvjVar2 = efvfVar.am;
                    if (efvjVar2.c) {
                        efvjVar2.c = false;
                        egdc b2 = efvfVar.ah.b(21);
                        b2.b();
                        egdg egdgVar = efvfVar.e;
                        egdd egddVar = efvfVar.aj;
                        egddVar.c(b2.a());
                        egdgVar.c(egddVar.a());
                        return;
                    }
                    return;
                }
                if (egenVar.a().g()) {
                    efvfVar.al.setVisibility(4);
                    int ordinal = ((egdp) egenVar.a().c()).ordinal();
                    if (ordinal == 0) {
                        final Snackbar q = Snackbar.q(efvfVar.ak, R.string.op3_something_went_wrong, -2);
                        q.w(R.string.op3_dismiss, new View.OnClickListener() { // from class: efuy
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Snackbar.this.e();
                            }
                        });
                        q.i();
                    } else if (ordinal == 1) {
                        Snackbar q2 = Snackbar.q(efvfVar.ak, R.string.op3_something_went_wrong, -2);
                        q2.w(R.string.op3_retry, efvfVar.ao);
                        q2.i();
                    } else {
                        if (ordinal != 2) {
                            return;
                        }
                        Snackbar q3 = Snackbar.q(efvfVar.ak, R.string.op3_check_your_connection, -2);
                        q3.w(R.string.op3_retry, efvfVar.ao);
                        q3.i();
                    }
                }
            }
        });
        this.ao = new View.OnClickListener() { // from class: efvb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                efvf efvfVar = efvf.this;
                efvfVar.al.setVisibility(0);
                efvj efvjVar2 = efvfVar.am;
                if (efvjVar2.d.g()) {
                    efvjVar2.a.a(((Long) efvjVar2.d.c()).longValue()).c();
                }
            }
        };
        this.ak.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.ak.getResources().getInteger(R.integer.photo_picker_num_columns));
        this.ak.ap(gridLayoutManager);
        efzq efzqVar = this.b;
        efzn efznVar = new efzn() { // from class: efvd
            @Override // defpackage.efzn
            public final void a(long j2, String str) {
                efvf.this.ar.c(j2, str);
            }
        };
        egaj egajVar = (egaj) efzqVar.a.b();
        egajVar.getClass();
        dvyc dvycVar = (dvyc) efzqVar.b.b();
        dvycVar.getClass();
        dvxy dvxyVar = (dvxy) efzqVar.c.b();
        dvxyVar.getClass();
        dvxi dvxiVar = (dvxi) efzqVar.d.b();
        dvxiVar.getClass();
        egjk egjkVar = (egjk) efzqVar.e.b();
        egjkVar.getClass();
        efzp efzpVar = new efzp(egajVar, dvycVar, dvxyVar, dvxiVar, egjkVar, efznVar);
        this.ap = efzpVar;
        this.ak.am(efzpVar);
        this.ak.w(new efzl((int) B().getDimension(R.dimen.photo_picker_grid_spacing), B().getInteger(R.integer.photo_picker_num_columns), 1, false));
        egdd a2 = this.ag.a(27);
        this.aj = a2;
        this.e.e(a2.b());
        this.am.a(250);
        this.an = 250;
        this.ak.z(new efve(this, gridLayoutManager));
    }

    @Override // defpackage.efvh, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        if (this.as) {
            return;
        }
        fazg.a(this);
    }
}
