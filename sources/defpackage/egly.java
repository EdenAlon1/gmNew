package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableRow;
import android.widget.ViewAnimator;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.common.view.SquareImageView;
import com.google.android.libraries.user.profile.photopicker.common.view.error.FullscreenErrorView;
import com.google.android.material.textview.MaterialTextView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egly extends eglz {
    public lmw a;
    public ViewGroup ag;
    public ViewAnimator ah;
    public FullscreenErrorView ai;
    private emxc ak;
    private egdc al;
    public dvyc b;
    public egdg c;
    public ffbr d;
    public egda e;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(true != fdrm.l() ? R.layout.photo_picker_google_photos_home_fragment : R.layout.photo_picker_google_photos_home_fragment_art_style, viewGroup, false);
        this.b.b.a(109564).b(inflate);
        if (fdrm.g()) {
            kud kudVar = new kud() { // from class: eglv
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
    public final void a(egni egniVar) {
        int i = engw.d;
        engr engrVar = new engr();
        engw b = egniVar.b();
        int i2 = ((enou) b).c;
        for (int i3 = 0; i3 < i2; i3++) {
            engrVar.j(((egnm) b.get(i3)).b());
        }
        engrVar.h(this.al.a());
        if (this.ak.g()) {
            exgf exgfVar = (exgf) exgg.a.createBuilder();
            exgfVar.copyOnWrite();
            exgg exggVar = (exgg) exgfVar.instance;
            exggVar.c = 10;
            exggVar.b |= 1;
            emyg emygVar = (emyg) this.ak.c();
            emygVar.g();
            long a = emygVar.a(TimeUnit.MICROSECONDS);
            exgfVar.copyOnWrite();
            exgg exggVar2 = (exgg) exgfVar.instance;
            exggVar2.b |= 2;
            exggVar2.d = a;
            engw b2 = egniVar.b();
            int i4 = ((enou) b2).c;
            for (int i5 = 0; i5 < i4; i5++) {
                engw b3 = ((egnm) b2.get(i5)).b();
                int size = b3.size();
                int i6 = 0;
                while (true) {
                    if (i6 < size) {
                        exfw exfwVar = (exfw) b3.get(i6);
                        i6++;
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
                }
            }
            egdg egdgVar = this.c;
            exgb exgbVar = (exgb) exgc.a.createBuilder();
            exgbVar.a(engrVar.g());
            exgbVar.copyOnWrite();
            exgc exgcVar = (exgc) exgbVar.instance;
            exgg exggVar4 = (exgg) exgfVar.build();
            exggVar4.getClass();
            exgcVar.d = exggVar4;
            exgcVar.b |= 1;
            egdgVar.c((exgc) exgbVar.build());
            this.ak = emux.a;
        }
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) {
        super.ae(bundle);
        emyg emygVar = (emyg) this.d.b();
        emygVar.e();
        emygVar.f();
        this.ak = emxc.j(emygVar);
        egdg egdgVar = this.c;
        exgd exgdVar = (exgd) exge.a.createBuilder();
        exgdVar.copyOnWrite();
        exge exgeVar = (exge) exgdVar.instance;
        exgeVar.c = 10;
        exgeVar.b |= 1;
        egdgVar.e((exge) exgdVar.build());
        this.al = this.e.b(13);
        ViewAnimator viewAnimator = (ViewAnimator) this.Q.findViewById(R.id.photo_picker_view_animator_container);
        this.ah = viewAnimator;
        this.ai = (FullscreenErrorView) viewAnimator.findViewById(R.id.photo_picker_error_view);
        this.ag = (ViewGroup) this.Q.findViewById(R.id.photo_picker_google_photos_home_sections_container);
        final egmy egmyVar = (egmy) this.a.a(egmy.class);
        if (egmyVar.g == 1) {
            if (!fdrm.q() || !egmyVar.d.e) {
                egmyVar.a.b(100);
            }
            egmyVar.b.a(100);
            egmyVar.c.b(100);
            llf llfVar = egmyVar.e;
            egmyVar.g = 2;
            llfVar.j(egni.d(2));
        }
        egmyVar.e.f(Q(), new llh() { // from class: eglw
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r10v0 */
            /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r10v6 */
            @Override // defpackage.llh
            public final void a(Object obj) {
                engw engwVar;
                int i;
                int i2;
                final View.OnClickListener onClickListener;
                int i3;
                int i4;
                boolean z;
                engw engwVar2;
                engw engwVar3;
                int i5;
                int i6;
                egni egniVar = (egni) obj;
                int c = egniVar.c() - 1;
                egly eglyVar = egly.this;
                if (c == 0) {
                    eglyVar.ah.setVisibility(8);
                    return;
                }
                int i7 = 1;
                if (c == 1) {
                    eglyVar.b(R.id.photo_picker_loading_view);
                    return;
                }
                int i8 = 4;
                if (c != 3) {
                    if (c != 4) {
                        return;
                    }
                    eglyVar.b(R.id.photo_picker_error_view);
                    if (fdrm.x()) {
                        eglyVar.ai.c((egdp) egniVar.a().e(egdp.NON_RETRYABLE));
                    } else {
                        eglyVar.ai.f();
                    }
                    eglyVar.a(egniVar);
                    return;
                }
                engw b = egniVar.b();
                enou enouVar = (enou) b;
                int i9 = enouVar.c;
                ?? r10 = 0;
                int i10 = 0;
                while (i10 < i9) {
                    egnm egnmVar = (egnm) b.get(i10);
                    if (fdrm.n() && egnmVar.a().b() == i7 && !egnmVar.a().d().isEmpty()) {
                        final egmm egmmVar = new egmm(eglyVar.z());
                        boolean c2 = egnmVar.c();
                        engw d = egnmVar.a().d();
                        RecyclerView recyclerView = (RecyclerView) egmmVar.findViewById(R.id.photo_picker_recycler_grid);
                        int size = d.size();
                        egmmVar.getContext();
                        int i11 = size <= 10 ? i7 : 2;
                        recyclerView.ap(new GridLayoutManager(i11, r10));
                        egbi egbiVar = egmmVar.e;
                        egbl egblVar = new egbl() { // from class: egmk
                            @Override // defpackage.egbl
                            public final void a(Uri uri) {
                                egmm egmmVar2 = egmm.this;
                                egmmVar2.d.c = 9;
                                egmmVar2.b.m(uri);
                            }
                        };
                        emux emuxVar = emux.a;
                        int i12 = i8;
                        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: egml
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                egmm.this.b.d();
                            }
                        };
                        egaj egajVar = (egaj) egbiVar.a.b();
                        egajVar.getClass();
                        dvyc dvycVar = (dvyc) egbiVar.b.b();
                        dvycVar.getClass();
                        dvxy dvxyVar = (dvxy) egbiVar.c.b();
                        dvxyVar.getClass();
                        dvxi dvxiVar = (dvxi) egbiVar.d.b();
                        dvxiVar.getClass();
                        egbh egbhVar = new egbh(egajVar, dvycVar, dvxyVar, dvxiVar, egblVar, emuxVar, onClickListener2, c2);
                        recyclerView.am(egbhVar);
                        recyclerView.w(new efzl((int) egmmVar.getResources().getDimension(R.dimen.photo_picker_grid_spacing), i11, r10, r10));
                        int i13 = 48;
                        int min = Math.min(d.size(), 48);
                        if (min != 48) {
                            i13 = min;
                        } else if (c2) {
                            i13 = 47;
                        }
                        egbhVar.m(d.subList(r10, i13), r10, i13);
                        eglyVar.ag.addView(egmmVar);
                        engwVar = b;
                        i = i9;
                        z = r10;
                        i2 = i10;
                        i3 = i12;
                        i4 = 1;
                    } else {
                        int i14 = i8;
                        final egmg egmgVar = new egmg(eglyVar.z());
                        egmgVar.h = egnmVar;
                        ArrayList<View> arrayList = new ArrayList();
                        int b2 = egnmVar.a().b() - 1;
                        if (b2 == 0) {
                            engwVar = b;
                            i = i9;
                            i2 = i10;
                            egmgVar.c(R.string.op3_picker_photos_of_you);
                            egmgVar.b(89748);
                            arrayList.addAll(egmgVar.a(egnmVar.a().d()));
                            onClickListener = new View.OnClickListener() { // from class: egma
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    egmg.this.a.d();
                                }
                            };
                        } else if (b2 != 1) {
                            egmgVar.b(89726);
                            egmgVar.c(R.string.op3_picker_more_from_google_photos);
                            arrayList.addAll(egmgVar.a(egnmVar.a().a()));
                            onClickListener = new View.OnClickListener() { // from class: egmc
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    egmg.this.a.e();
                                }
                            };
                            engwVar = b;
                            i = i9;
                            i2 = i10;
                        } else {
                            egmgVar.b(89732);
                            egmgVar.c(R.string.op3_picker_people_and_pets);
                            engw c3 = egnmVar.a().c();
                            ArrayList arrayList2 = new ArrayList();
                            int size2 = c3.size();
                            int i15 = r10;
                            while (i15 < size2) {
                                final ewiw ewiwVar = (ewiw) c3.get(i15);
                                int i16 = ewiwVar.b;
                                if ((i16 & 1) == 0 || (i16 & 2) == 0) {
                                    engwVar2 = b;
                                    engwVar3 = c3;
                                    i5 = i9;
                                    i6 = i10;
                                } else {
                                    engwVar2 = b;
                                    final View inflate = egmg.inflate(egmgVar.getContext(), R.layout.photo_picker_cluster_image, null);
                                    SquareImageView squareImageView = (SquareImageView) inflate.findViewById(R.id.photo_picker_cluster_image_view);
                                    MaterialTextView materialTextView = (MaterialTextView) inflate.findViewById(R.id.photo_picker_cluster_name);
                                    engwVar3 = c3;
                                    egaj egajVar2 = egmgVar.b;
                                    i5 = i9;
                                    ewlp ewlpVar = ewiwVar.d;
                                    if (ewlpVar == null) {
                                        ewlpVar = ewlp.a;
                                    }
                                    Uri a = egai.a(ewlpVar);
                                    i6 = i10;
                                    egal egalVar = new egal();
                                    egalVar.a();
                                    egajVar2.g(a, egalVar, squareImageView);
                                    boolean z2 = ((ewiwVar.b & 4) == 0 && ewiwVar.e.isEmpty()) ? false : true;
                                    materialTextView.setText(z2 ? ewiwVar.e : "");
                                    inflate.findViewById(R.id.photo_picker_cluster_gradient).setVisibility(true != z2 ? i14 : 0);
                                    int i17 = true != z2 ? 1 : 2;
                                    int[] iArr = kvo.a;
                                    squareImageView.setImportantForAccessibility(i17);
                                    egmgVar.c.b.a(89735).b(inflate);
                                    inflate.setOnClickListener(new View.OnClickListener() { // from class: egmd
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            egmg egmgVar2 = egmg.this;
                                            egmgVar2.d.a(dvxh.e(), inflate);
                                            egmgVar2.a.b(ewiwVar);
                                        }
                                    });
                                    arrayList2.add(inflate);
                                }
                                i15++;
                                b = engwVar2;
                                c3 = engwVar3;
                                i9 = i5;
                                i10 = i6;
                            }
                            engwVar = b;
                            i = i9;
                            i2 = i10;
                            arrayList.addAll(arrayList2);
                            onClickListener = new View.OnClickListener() { // from class: egmb
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    egmg.this.a.c();
                                }
                            };
                        }
                        if (egnmVar.c()) {
                            final View inflate2 = egmg.inflate(egmgVar.getContext(), R.layout.photo_picker_button, null);
                            inflate2.setTag(R.id.photo_picker_more_button_tag, egnk.a(egmgVar.h.a().b()));
                            MaterialTextView materialTextView2 = (MaterialTextView) inflate2.findViewById(R.id.photo_picker_button_text);
                            materialTextView2.setText(egmgVar.getContext().getString(R.string.op3_more));
                            materialTextView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, ku.a(egmgVar.getContext(), R.drawable.quantum_gm_ic_photo_library_vd_theme_24), (Drawable) null, (Drawable) null);
                            egmgVar.c.b.a(90596).b(inflate2);
                            inflate2.setOnClickListener(new View.OnClickListener() { // from class: egme
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    egmg.this.d.a(dvxh.e(), inflate2);
                                    onClickListener.onClick(view);
                                }
                            });
                            arrayList.add(inflate2);
                        }
                        egmo egmoVar = egmgVar.f;
                        if (egmoVar.a.getChildCount() > 0) {
                            egmoVar.a.removeAllViews();
                        }
                        if (arrayList.iterator().hasNext()) {
                            TableRow tableRow = new TableRow(egmoVar.a.getContext());
                            int i18 = 0;
                            for (View view : arrayList) {
                                if (i18 > 0 && i18 % egmoVar.b == 0) {
                                    egmoVar.a.addView(tableRow, new TableRow.LayoutParams());
                                    tableRow = new TableRow(egmoVar.a.getContext());
                                }
                                tableRow.addView(view, egmo.a());
                                i18++;
                            }
                            egmoVar.a.addView(tableRow, new TableRow.LayoutParams());
                            while (tableRow.getChildCount() < egmoVar.b) {
                                SquareImageView squareImageView2 = new SquareImageView(egmoVar.a.getContext());
                                squareImageView2.setVisibility(i14);
                                tableRow.addView(squareImageView2, egmo.a());
                            }
                        }
                        i3 = i14;
                        int dimensionPixelSize = eglyVar.B().getDimensionPixelSize(R.dimen.photo_picker_title_tab_padding);
                        if (egnmVar.a().b() == 3) {
                            i4 = 1;
                            if (enouVar.c == 1) {
                                egmgVar.g.setVisibility(8);
                                dimensionPixelSize = eglyVar.B().getDimensionPixelSize(R.dimen.photo_picker_photo_tab_padding);
                            }
                        } else {
                            i4 = 1;
                        }
                        z = false;
                        eglyVar.ag.setPadding(0, dimensionPixelSize, 0, 0);
                        eglyVar.ag.addView(egmgVar);
                    }
                    i10 = i2 + 1;
                    r10 = z;
                    i7 = i4;
                    b = engwVar;
                    i9 = i;
                    i8 = i3;
                }
                eglyVar.b(R.id.photo_picker_content_view);
                eglyVar.a(egniVar);
            }
        });
        if (fdrm.x()) {
            this.ai.b(new View.OnClickListener() { // from class: eglx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    egmy egmyVar2 = egmy.this;
                    if (egmyVar2.g != 5) {
                        return;
                    }
                    egmyVar2.f.b();
                    if (!fdrm.q() || !egmyVar2.d.e) {
                        egmyVar2.a.c();
                    }
                    egmyVar2.b.c();
                    egmyVar2.c.c();
                }
            });
        }
    }

    public final void b(int i) {
        this.ah.setVisibility(0);
        ViewAnimator viewAnimator = this.ah;
        this.ah.setDisplayedChild(viewAnimator.indexOfChild(viewAnimator.findViewById(i)));
    }

    @Override // defpackage.eglz, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        if (this.aj) {
            return;
        }
        fazg.a(this);
    }
}
