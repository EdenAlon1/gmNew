package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewAnimator;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.art.home.view.CategoriesSectionView;
import com.google.android.libraries.user.profile.photopicker.art.home.view.RandomArtImagesSectionView;
import com.google.android.libraries.user.profile.photopicker.art.home.view.SuggestedCollectionsSectionView;
import com.google.android.libraries.user.profile.photopicker.common.view.error.FullscreenErrorView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efxl extends efxm {
    public lmw a;
    public dvyc ag;
    public dvxy ah;
    public dvxi ai;
    public FullscreenErrorView aj;
    public RandomArtImagesSectionView ak;
    public SuggestedCollectionsSectionView al;
    public CategoriesSectionView am;
    public LinearProgressIndicator an;
    public efux ao;
    private emxc aq;
    private egdc ar;
    private ViewAnimator as;
    public efxz b;
    public egdg c;
    public ffbr d;
    public egda e;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.photo_picker_art_home_fragment, viewGroup, false);
        this.ah.b(inflate, this.ag.a(124727));
        if (fdrm.g()) {
            kud kudVar = new kud() { // from class: efxk
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(efxw efxwVar) {
        int i = engw.d;
        engr engrVar = new engr();
        engrVar.j(efxwVar.c());
        engrVar.h(this.ar.a());
        engw g = engrVar.g();
        if (this.aq.g()) {
            exgf exgfVar = (exgf) exgg.a.createBuilder();
            exgfVar.copyOnWrite();
            exgg exggVar = (exgg) exgfVar.instance;
            exggVar.c = 25;
            exggVar.b |= 1;
            emyg emygVar = (emyg) this.aq.c();
            emygVar.g();
            long a = emygVar.a(TimeUnit.MICROSECONDS);
            exgfVar.copyOnWrite();
            exgg exggVar2 = (exgg) exgfVar.instance;
            exggVar2.b |= 2;
            exggVar2.d = a;
            engw c = efxwVar.c();
            int i2 = ((enou) c).c;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                exfw exfwVar = (exfw) c.get(i3);
                i3++;
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
            egdg egdgVar = this.c;
            exgb exgbVar = (exgb) exgc.a.createBuilder();
            exgbVar.a(g);
            exgbVar.copyOnWrite();
            exgc exgcVar = (exgc) exgbVar.instance;
            exgg exggVar4 = (exgg) exgfVar.build();
            exggVar4.getClass();
            exgcVar.d = exggVar4;
            exgcVar.b |= 1;
            egdgVar.c((exgc) exgbVar.build());
            this.aq = emux.a;
        }
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) {
        super.ae(bundle);
        b();
        this.as = (ViewAnimator) this.Q.findViewById(R.id.photo_picker_view_animator_container);
        final View findViewById = this.Q.findViewById(R.id.photo_picker_search_bar);
        this.an = (LinearProgressIndicator) this.Q.findViewById(R.id.photo_picker_loading_view);
        this.aj = (FullscreenErrorView) this.as.findViewById(R.id.photo_picker_error_view);
        this.ak = (RandomArtImagesSectionView) this.as.findViewById(R.id.photo_picker_suggested_images);
        this.al = (SuggestedCollectionsSectionView) this.as.findViewById(R.id.photo_picker_suggested_collections);
        this.am = (CategoriesSectionView) this.as.findViewById(R.id.photo_picker_categories);
        final MaterialButton materialButton = (MaterialButton) this.as.findViewById(R.id.photo_picker_art_refresh_button);
        this.ah.b(materialButton, this.ag.a(124720));
        this.ah.b(findViewById, this.ag.a(124797));
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: efxg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                efxl efxlVar = efxl.this;
                efxlVar.ai.a(dvxh.e(), materialButton);
                efxlVar.b();
                efxlVar.an.setVisibility(0);
                efxlVar.b.a.b();
            }
        });
        efxz efxzVar = (efxz) this.a.a(efxz.class);
        this.b = efxzVar;
        efxzVar.b.f(Q(), new llh() { // from class: efxh
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.llh
            public final void a(Object obj) {
                efxl efxlVar = efxl.this;
                efxw efxwVar = (efxw) obj;
                efxlVar.an.setVisibility(8);
                if (efxwVar.a().g()) {
                    efxlVar.f(R.id.photo_picker_error_view);
                    if (fdrm.x()) {
                        efxlVar.aj.c((egdp) efxwVar.a().c());
                    } else {
                        efxlVar.aj.f();
                    }
                    efxlVar.a(efxwVar);
                    return;
                }
                RandomArtImagesSectionView randomArtImagesSectionView = efxlVar.ak;
                engw e = efxwVar.e();
                efzs efzsVar = randomArtImagesSectionView.e;
                int size = e.size();
                efzsVar.f = e;
                efzsVar.u(0, size);
                final SuggestedCollectionsSectionView suggestedCollectionsSectionView = efxlVar.al;
                int i = 0;
                for (int i2 = 0; i2 < suggestedCollectionsSectionView.f.getChildCount(); i2++) {
                    final View childAt = suggestedCollectionsSectionView.f.getChildAt(i2);
                    if (childAt instanceof FrameLayout) {
                        final egee egeeVar = (egee) efxwVar.d().get(i);
                        ImageView imageView = (ImageView) childAt.findViewById(R.id.photo_picker_collection_image_view);
                        egaj egajVar = suggestedCollectionsSectionView.b;
                        Uri parse = Uri.parse(egeeVar.d());
                        egal egalVar = new egal();
                        egalVar.a();
                        egalVar.e();
                        egajVar.f(parse, egalVar, imageView);
                        ((TextView) childAt.findViewById(R.id.photo_picker_collection_name)).setText(egeeVar.c());
                        childAt.setOnClickListener(new View.OnClickListener() { // from class: efxu
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                SuggestedCollectionsSectionView suggestedCollectionsSectionView2 = SuggestedCollectionsSectionView.this;
                                suggestedCollectionsSectionView2.e.a(dvxh.e(), childAt);
                                egee egeeVar2 = egeeVar;
                                suggestedCollectionsSectionView2.g.a(egeeVar2.a(), egeeVar2.c());
                            }
                        });
                        i++;
                    }
                }
                efxlVar.am.a(efxwVar.b());
                efxlVar.f(R.id.photo_picker_content_view);
                efxlVar.a(efxwVar);
            }
        });
        efxz efxzVar2 = this.b;
        if (efxzVar2.e == 1) {
            efxzVar2.a.b();
            efxzVar2.a.a();
            efxzVar2.e = 2;
        }
        if (fdrj.a.get().g()) {
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: efxi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    efxl efxlVar = efxl.this;
                    efxlVar.ai.a(dvxh.e(), findViewById);
                    efux efuxVar = efxlVar.ao;
                    efuxVar.b((ea) efuxVar.a.b(), "ArtSearchFragment");
                }
            });
        }
        if (fdrm.x()) {
            this.aj.b(new View.OnClickListener() { // from class: efxj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    efxz efxzVar3 = efxl.this.b;
                    efxzVar3.a.b();
                    efxzVar3.a.a();
                    efxzVar3.e = 2;
                }
            });
        }
    }

    public final void b() {
        emyg emygVar = (emyg) this.d.b();
        emygVar.e();
        emygVar.f();
        this.aq = emxc.j(emygVar);
        egdg egdgVar = this.c;
        exgd exgdVar = (exgd) exge.a.createBuilder();
        exgdVar.copyOnWrite();
        exge exgeVar = (exge) exgdVar.instance;
        exgeVar.c = 25;
        exgeVar.b |= 1;
        egdgVar.e((exge) exgdVar.build());
        this.ar = this.e.b(19);
    }

    public final void f(int i) {
        this.as.setVisibility(0);
        ViewAnimator viewAnimator = this.as;
        this.as.setDisplayedChild(viewAnimator.indexOfChild(viewAnimator.findViewById(i)));
    }

    @Override // defpackage.efxm, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        if (this.ap) {
            return;
        }
        fazg.a(this);
    }
}
