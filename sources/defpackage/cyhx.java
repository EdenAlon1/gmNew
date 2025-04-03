package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyhx implements cxyl, czqa {
    public final Optional a;
    private final Context b;
    private final cxzq c;
    private final cxyg d;
    private czpz e;
    private cxzp f;

    public cyhx(Context context, cxzq cxzqVar, Optional optional, cxyg cxygVar) {
        this.b = context;
        this.c = cxzqVar;
        this.a = optional;
        this.d = cxygVar;
        if (optional.isPresent()) {
            ((czqb) optional.get()).a(this);
        } else {
            cxygVar.a(this, false);
        }
    }

    private final void b() {
        int i;
        int i2;
        czpz czpzVar = this.e;
        czpzVar.getClass();
        if (this.f != null) {
            czpt czptVar = (czpt) czpzVar;
            if (czptVar.a) {
                engw engwVar = czptVar.c;
                if (engwVar == null || engwVar.isEmpty()) {
                    i = 0;
                    i2 = 0;
                } else {
                    i = engwVar.size();
                    czpz czpzVar2 = this.e;
                    czpzVar2.getClass();
                    i2 = i - ((czpt) czpzVar2).d;
                }
                cxzp cxzpVar = this.f;
                cxzpVar.getClass();
                cxzpVar.e.setText(this.b.getString(R.string.search_banner_body, Integer.valueOf(i2), Integer.valueOf(i)));
            }
        }
    }

    @Override // defpackage.czqa
    public final void a(czpz czpzVar) {
        this.e = czpzVar;
        this.d.a(this, ((czpt) czpzVar).a);
        b();
    }

    @Override // defpackage.cxyl
    public final cxyh d() {
        return new cxxy("SearchBanner", true);
    }

    @Override // defpackage.cxyl
    public final cxyq e() {
        this.e.getClass();
        cxzq cxzqVar = this.c;
        eler elerVar = (eler) cxzqVar.a.b();
        elbx elbxVar = (elbx) cxzqVar.b.b();
        elbxVar.getClass();
        final cxzp cxzpVar = new cxzp(elerVar, elbxVar, cxzqVar.c, this.b);
        this.f = cxzpVar;
        cxzpVar.c.setContentDescription(this.b.getString(R.string.search_banner_description));
        Drawable drawable = this.b.getDrawable(R.drawable.quantum_ic_keyboard_arrow_left_black_24);
        drawable.getClass();
        ImageView imageView = cxzpVar.f;
        int d = ehdr.d(this.b, R.attr.colorOnSurfaceVariant, "SearchBanner");
        imageView.setImageDrawable(drawable);
        cxzpVar.f.setColorFilter(d);
        Drawable drawable2 = this.b.getDrawable(R.drawable.quantum_ic_keyboard_arrow_right_black_24);
        drawable2.getClass();
        ImageView imageView2 = cxzpVar.g;
        int d2 = ehdr.d(this.b, R.attr.colorOnSurfaceVariant, "SearchBanner");
        imageView2.setImageDrawable(drawable2);
        cxzpVar.g.setColorFilter(d2);
        cxzpVar.i = new cyhv(this);
        cxzpVar.g.setOnClickListener(new elay(cxzpVar.b, "ConnectedHalfBannerUiController:endIcon:click", new View.OnClickListener() { // from class: cxzl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cxzp cxzpVar2 = cxzp.this;
                ((akzt) cxzpVar2.d.b()).c("Bugle.Banners2o.EndButtonClicked.Count");
                cxzo cxzoVar = cxzpVar2.i;
                if (cxzoVar != null) {
                    ((cyhv) cxzoVar).a.a.ifPresent(new Consumer() { // from class: cyht
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            czqb czqbVar = (czqb) obj;
                            engw engwVar = czqbVar.c;
                            if (engwVar == null) {
                                czqbVar.c();
                                return;
                            }
                            int i = czqbVar.d - 1;
                            if (i < 0) {
                                i = engwVar.size() - 1;
                            }
                            czqbVar.d = i;
                            czqbVar.c();
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
                ((ensz) ((ensz) cxzp.a.h()).h("com/google/android/apps/messaging/ui/conversation/banners2o/ConnectedHalfBannerUiController", "setEndIconClickListener", 136, "ConnectedHalfBannerUiController.java")).q("Banner end icon clicked");
            }
        }));
        cxzpVar.h = new cyhw(this);
        cxzpVar.f.setOnClickListener(new elay(cxzpVar.b, "ConnectedHalfBannerUiController:startIcon:click", new View.OnClickListener() { // from class: cxzk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cxzp cxzpVar2 = cxzp.this;
                ((akzt) cxzpVar2.d.b()).c("Bugle.Banners2o.StartButtonClicked.Count");
                cxzo cxzoVar = cxzpVar2.h;
                if (cxzoVar != null) {
                    ((cyhw) cxzoVar).a.a.ifPresent(new Consumer() { // from class: cyhu
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            czqb czqbVar = (czqb) obj;
                            engw engwVar = czqbVar.c;
                            if (engwVar == null) {
                                czqbVar.c();
                                return;
                            }
                            int i = czqbVar.d + 1;
                            if (i >= engwVar.size()) {
                                i = 0;
                            }
                            czqbVar.d = i;
                            czqbVar.c();
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
                ((ensz) ((ensz) cxzp.a.h()).h("com/google/android/apps/messaging/ui/conversation/banners2o/ConnectedHalfBannerUiController", "setStartIconClickListener", 121, "ConnectedHalfBannerUiController.java")).q("Banner start icon clicked");
            }
        }));
        b();
        return cxzpVar;
    }

    @Override // defpackage.cxyl
    public final void i() {
        if (this.a.isPresent()) {
            ((czqb) this.a.get()).d(this);
        }
    }

    @Override // defpackage.cxyl
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.cxyl
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.cxyl
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.cxyl
    public final void k() {
    }

    @Override // defpackage.cxyl
    public final void l() {
    }
}
