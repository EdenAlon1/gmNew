package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.material.opensearchbar.OpenSearchView;
import com.google.android.libraries.user.profile.photopicker.common.view.error.FullscreenErrorView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efyj extends efyo {
    public lmw a;
    public egdg ag;
    public egda ah;
    public dvyc ai;
    public dvxy aj;
    public dvxi ak;
    public egdc al;
    public OpenSearchView am;
    public efzi an;
    public ChipGroup ao;
    public RecyclerView ap;
    public FullscreenErrorView aq;
    public efym ar;
    public View as;
    public engr at;
    public efux au;
    private emxc aw;
    private efyz ax;
    public lmw b;
    public efyn c;
    public egrf d;
    public ffbr e;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.photo_picker_art_search_fragment, viewGroup, false);
        this.aj.b(inflate, this.ai.a(133695));
        if (fdrm.h()) {
            kud kudVar = new kud() { // from class: efyh
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
    public final void a(String str) {
        engw g = this.at.g();
        if (this.aw.g()) {
            exgf exgfVar = (exgf) exgg.a.createBuilder();
            exgfVar.copyOnWrite();
            exgg exggVar = (exgg) exgfVar.instance;
            exggVar.c = 27;
            exggVar.b |= 1;
            emyg emygVar = (emyg) this.aw.c();
            emygVar.g();
            long a = emygVar.a(TimeUnit.MICROSECONDS);
            exgfVar.copyOnWrite();
            exgg exggVar2 = (exgg) exgfVar.instance;
            exggVar2.b |= 2;
            exggVar2.d = a;
            int i = ((enou) g).c;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    break;
                }
                exfw exfwVar = (exfw) g.get(i2);
                i2++;
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
            egdg egdgVar = this.ag;
            exgb exgbVar = (exgb) exgc.a.createBuilder();
            exgbVar.a(g);
            exgbVar.copyOnWrite();
            exgc exgcVar = (exgc) exgbVar.instance;
            exgg exggVar4 = (exgg) exgfVar.build();
            exggVar4.getClass();
            exgcVar.d = exggVar4;
            exgcVar.b |= 1;
            egdgVar.c((exgc) exgbVar.build());
            this.aw = emux.a;
        }
        this.ax.a(str);
        efux efuxVar = this.au;
        efuxVar.b((ea) efuxVar.b.b(), "ArtSearchFragment");
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) {
        super.ae(bundle);
        emyg emygVar = (emyg) this.e.b();
        emygVar.e();
        emygVar.f();
        this.aw = emxc.j(emygVar);
        egdg egdgVar = this.ag;
        exgd exgdVar = (exgd) exge.a.createBuilder();
        exgdVar.copyOnWrite();
        exge exgeVar = (exge) exgdVar.instance;
        exgeVar.c = 27;
        exgeVar.b |= 1;
        egdgVar.e((exge) exgdVar.build());
        this.al = this.ah.b(20);
        int i = engw.d;
        this.at = new engr();
        this.as = this.Q.findViewById(R.id.photo_picker_interests_container);
        this.ao = (ChipGroup) this.Q.findViewById(R.id.photo_picker_interest_chip_group);
        FullscreenErrorView fullscreenErrorView = (FullscreenErrorView) this.Q.findViewById(R.id.photo_picker_error_view);
        this.aq = fullscreenErrorView;
        fullscreenErrorView.b(new View.OnClickListener() { // from class: efyd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                efzi efziVar = efyj.this.an;
                if (efziVar.e == 2) {
                    efziVar.c(efziVar.d);
                } else {
                    efziVar.b();
                }
            }
        });
        this.an = (efzi) this.a.a(efzi.class);
        this.ax = (efyz) this.b.a(efyz.class);
        this.ap = (RecyclerView) this.Q.findViewById(R.id.photo_picker_search_suggestions);
        z();
        this.ap.ap(new LinearLayoutManager());
        efyn efynVar = this.c;
        efyf efyfVar = new efyf(this);
        dvyc dvycVar = (dvyc) efynVar.a.b();
        dvycVar.getClass();
        dvxy dvxyVar = (dvxy) efynVar.b.b();
        dvxyVar.getClass();
        dvxi dvxiVar = (dvxi) efynVar.c.b();
        dvxiVar.getClass();
        efym efymVar = new efym(efyfVar, dvycVar, dvxyVar, dvxiVar);
        this.ar = efymVar;
        this.ap.am(efymVar);
        this.am.j.addTextChangedListener(new efyi(this));
        this.am.j.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: efyb
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                if (i2 != 6 && (keyEvent == null || keyEvent.getKeyCode() != 66 || keyEvent.getAction() != 0)) {
                    return false;
                }
                efyj efyjVar = efyj.this;
                if (efyjVar.am.c().toString().isEmpty()) {
                    return false;
                }
                efyjVar.a(efyjVar.am.c().toString());
                return true;
            }
        });
        this.am.g.t(new View.OnClickListener() { // from class: efyc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                efyj.this.d.l();
            }
        });
        this.aj.b(this.ao, this.ai.a(133693));
        this.an.a.f(Q(), new llh() { // from class: efye
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.llh
            public final void a(Object obj) {
                efzd efzdVar = (efzd) obj;
                int e = efzdVar.e() - 1;
                final efyj efyjVar = efyj.this;
                if (e == 0) {
                    engw c = efzdVar.c();
                    efyjVar.ao.removeAllViews();
                    int size = c.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        egfg egfgVar = (egfg) c.get(i2);
                        final Chip chip = new Chip(efyjVar.z());
                        chip.setText(egfgVar.b());
                        chip.setOnClickListener(new View.OnClickListener() { // from class: efyg
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                efyj efyjVar2 = efyj.this;
                                dvxi dvxiVar2 = efyjVar2.ak;
                                dvxh e2 = dvxh.e();
                                Chip chip2 = chip;
                                dvxiVar2.a(e2, chip2);
                                efyjVar2.a(chip2.getText().toString());
                            }
                        });
                        chip.h = true;
                        chip.i(chip.i);
                        efyjVar.ao.addView(chip);
                        efyjVar.aj.b(chip, efyjVar.ai.a(133694));
                    }
                    efyjVar.ao.setVisibility(0);
                    efyjVar.as.setVisibility(0);
                    efyjVar.aq.setVisibility(8);
                    efyjVar.ap.setVisibility(8);
                } else if (e != 1) {
                    efyjVar.ao.setVisibility(8);
                    efyjVar.as.setVisibility(8);
                    efyjVar.ap.setVisibility(8);
                    efyjVar.aq.setVisibility(0);
                    efyjVar.am.d();
                    if (fdrm.x()) {
                        efyjVar.aq.c((egdp) efzdVar.a().e(egdp.NON_RETRYABLE));
                    } else {
                        efyjVar.aq.d();
                    }
                } else {
                    efym efymVar2 = efyjVar.ar;
                    engw d = efzdVar.d();
                    String obj2 = efyjVar.am.j.getText().toString();
                    efymVar2.a = d;
                    efymVar2.e = obj2;
                    efymVar2.p();
                    efyjVar.ao.setVisibility(8);
                    efyjVar.as.setVisibility(8);
                    efyjVar.aq.setVisibility(8);
                    efyjVar.ap.setVisibility(0);
                }
                efyjVar.at.h(efyjVar.al.a());
                efyjVar.at.j(efzdVar.b());
            }
        });
        if (bundle == null) {
            this.an.b();
        }
    }

    @Override // defpackage.ea
    public final void ap(View view, Bundle bundle) {
        OpenSearchView openSearchView = (OpenSearchView) this.Q.findViewById(R.id.photo_picker_search_results_view);
        this.am = openSearchView;
        openSearchView.j(true);
        this.am.f();
    }

    @Override // defpackage.efyo, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        if (this.av) {
            return;
        }
        fazg.a(this);
    }
}
