package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.art.home.view.CategoriesSectionView;
import com.google.android.libraries.user.profile.photopicker.art.view.ArtImageGridView;
import com.google.android.libraries.user.profile.photopicker.common.view.error.FullscreenErrorView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.textview.MaterialTextView;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efyu extends efyv {
    public lmw a;
    public egda ag;
    public dvyc ah;
    public dvxy ai;
    public dvxi aj;
    public emxc ak;
    public egdc al;
    public ArtImageGridView am;
    public CategoriesSectionView an;
    public ArtImageGridView ao;
    public View ap;
    public View aq;
    public FullscreenErrorView ar;
    public LinearProgressIndicator as;
    public egrf b;
    public efyz c;
    public ffbr d;
    public egdg e;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.photo_picker_art_search_results_fragment, viewGroup, false);
        this.ai.b(inflate, this.ah.a(133697));
        if (fdrm.h()) {
            kud kudVar = new kud() { // from class: efyt
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
            };
            int[] iArr = kvo.a;
            kvd.k(inflate, kudVar);
        }
        return inflate;
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) {
        super.ae(bundle);
        emyg emygVar = (emyg) this.d.b();
        emygVar.e();
        emygVar.f();
        this.ak = emxc.j(emygVar);
        egdg egdgVar = this.e;
        exgd exgdVar = (exgd) exge.a.createBuilder();
        exgdVar.copyOnWrite();
        exge exgeVar = (exge) exgdVar.instance;
        exgeVar.c = 28;
        exgeVar.b |= 1;
        egdgVar.e((exge) exgdVar.build());
        this.al = this.ag.b(22);
        this.c = (efyz) this.a.a(efyz.class);
        this.am = (ArtImageGridView) this.Q.findViewById(R.id.photo_picker_top_results_grid_images);
        this.an = (CategoriesSectionView) this.Q.findViewById(R.id.photo_picker_categories);
        this.ao = (ArtImageGridView) this.Q.findViewById(R.id.photo_picker_more_results_grid_images);
        this.ap = this.Q.findViewById(R.id.photo_picker_search_no_results_container);
        this.aq = this.Q.findViewById(R.id.photo_picker_content_view);
        this.as = (LinearProgressIndicator) this.Q.findViewById(R.id.photo_picker_loading_view);
        FullscreenErrorView fullscreenErrorView = (FullscreenErrorView) this.Q.findViewById(R.id.photo_picker_error_view);
        this.ar = fullscreenErrorView;
        fullscreenErrorView.b(new View.OnClickListener() { // from class: efyr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                efyu efyuVar = efyu.this;
                efyuVar.as.setVisibility(0);
                efyz efyzVar = efyuVar.c;
                efyzVar.a(efyzVar.b);
            }
        });
        this.am.b(R.string.op3_search_top_results, R.drawable.quantum_gm_ic_image_search_vd_theme_24);
        this.am.c();
        this.am.f = true;
        ((MaterialTextView) this.an.findViewById(R.id.photo_picker_categories_section_title)).setText(R.string.op3_search_collections);
        final MaterialToolbar materialToolbar = (MaterialToolbar) this.Q.findViewById(R.id.photo_picker_search_results_toolbar);
        materialToolbar.x(this.c.b);
        materialToolbar.s(ku.a(materialToolbar.getContext(), R.drawable.quantum_gm_ic_arrow_back_vd_theme_24));
        this.ai.b(materialToolbar, this.ah.a(133692));
        if (fdrj.a.get().i()) {
            materialToolbar.t(new View.OnClickListener() { // from class: efyp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    efyu efyuVar = efyu.this;
                    efyuVar.aj.a(dvxh.e(), materialToolbar);
                    efyuVar.b.l();
                }
            });
        } else {
            materialToolbar.setOnClickListener(new View.OnClickListener() { // from class: efyq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    efyu efyuVar = efyu.this;
                    efyuVar.aj.a(dvxh.e(), materialToolbar);
                    efyuVar.b.l();
                }
            });
        }
        ((ImageView) this.Q.findViewById(R.id.photo_picker_search_no_results_icon)).setImageDrawable(ku.a(z(), R.drawable.quantum_gm_ic_search_gm_grey500_48));
        this.c.c.f(Q(), new llh() { // from class: efys
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.llh
            public final void a(Object obj) {
                efyx efyxVar = (efyx) obj;
                efyu efyuVar = efyu.this;
                if (efyuVar.c.a) {
                    return;
                }
                efyuVar.as.setVisibility(4);
                int i = 0;
                if (efyxVar.a().g()) {
                    efyuVar.ap.setVisibility(8);
                    efyuVar.aq.setVisibility(8);
                    efyuVar.ar.setVisibility(0);
                    if (fdrm.x()) {
                        efyuVar.ar.c((egdp) efyxVar.a().c());
                    } else {
                        efyuVar.ar.d();
                    }
                } else if (efyxVar.e().isEmpty()) {
                    efyuVar.ap.setVisibility(0);
                    efyuVar.aq.setVisibility(8);
                    efyuVar.ar.setVisibility(8);
                } else {
                    efyuVar.ap.setVisibility(8);
                    efyuVar.aq.setVisibility(0);
                    efyuVar.ar.setVisibility(8);
                    efyuVar.am.a(efyxVar.e(), 133696);
                    efyuVar.an.a(engw.r(egec.a("", efyxVar.b())));
                    if (efyxVar.d().isEmpty()) {
                        efyuVar.ao.setVisibility(8);
                    } else {
                        efyuVar.ao.b(R.string.op3_search_more_results, R.drawable.quantum_gm_ic_manage_search_vd_theme_24);
                        efyuVar.ao.c();
                        efyuVar.ao.a(efyxVar.d(), 133710);
                    }
                }
                int i2 = engw.d;
                engr engrVar = new engr();
                engrVar.j(efyxVar.c());
                engrVar.h(efyuVar.al.a());
                engw g = engrVar.g();
                if (efyuVar.ak.g()) {
                    exgf exgfVar = (exgf) exgg.a.createBuilder();
                    exgfVar.copyOnWrite();
                    exgg exggVar = (exgg) exgfVar.instance;
                    exggVar.c = 28;
                    exggVar.b |= 1;
                    emyg emygVar2 = (emyg) efyuVar.ak.c();
                    emygVar2.g();
                    long a = emygVar2.a(TimeUnit.MICROSECONDS);
                    exgfVar.copyOnWrite();
                    exgg exggVar2 = (exgg) exgfVar.instance;
                    exggVar2.b |= 2;
                    exggVar2.d = a;
                    engw c = efyxVar.c();
                    int i3 = ((enou) c).c;
                    while (true) {
                        if (i >= i3) {
                            break;
                        }
                        exfw exfwVar = (exfw) c.get(i);
                        i++;
                        if ((exfwVar.b & 2) != 0) {
                            exfu exfuVar = exfwVar.f;
                            if (exfuVar == null) {
                                exfuVar = exfu.a;
                            }
                            exgfVar.copyOnWrite();
                            exgg exggVar3 = (exgg) exgfVar.instance;
                            exfuVar.getClass();
                            exggVar3.e = exfuVar;
                            exggVar3.b |= 4;
                        }
                    }
                    egdg egdgVar2 = efyuVar.e;
                    exgb exgbVar = (exgb) exgc.a.createBuilder();
                    exgbVar.a(g);
                    exgbVar.copyOnWrite();
                    exgc exgcVar = (exgc) exgbVar.instance;
                    exgg exggVar4 = (exgg) exgfVar.build();
                    exggVar4.getClass();
                    exgcVar.d = exggVar4;
                    exgcVar.b |= 1;
                    egdgVar2.c((exgc) exgbVar.build());
                    efyuVar.ak = emux.a;
                }
            }
        });
    }

    @Override // defpackage.efyv, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        if (this.at) {
            return;
        }
        fazg.a(this);
    }
}
