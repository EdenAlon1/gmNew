package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.compose.ui.views.recycler.reactive.ReactiveGridLayoutManager;
import com.google.android.material.tabs.TabLayout;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drcf extends drck {
    public static final enru a = enru.c("com/google/android/libraries/compose/emotify/ui/screen/EmotifyScreen");
    public drcp ag;
    public ffsk ah;
    public dqza ai;
    public Optional aj;
    public Optional ak;
    public dqiy al;
    public drco am;
    public ReactiveGridLayoutManager an;
    public final fgcm ao;
    public final drbo ap;
    private ViewStub aq;
    private ComposeView ar;
    private final ffbz as;
    private final dszr at;
    public Context b;
    public dqze c;
    public dtdg d;
    public dqiz e;

    public drcf() {
        super(Integer.valueOf(R.layout.emotify_screen_layout), new drbd(null));
        this.ao = fgdm.a(drbm.a);
        this.as = ffca.a(new ffix() { // from class: drbl
            @Override // defpackage.ffix
            public final Object invoke() {
                drcf drcfVar = drcf.this;
                TabLayout tabLayout = (TabLayout) drcfVar.N().findViewById(R.id.emotify_tabs);
                tabLayout.w();
                ehrt e = tabLayout.e();
                e.h(R.string.emotify_category_all);
                e.a = drbm.a;
                tabLayout.g(e);
                ehrt e2 = tabLayout.e();
                e2.h(R.string.emotify_category_yours);
                e2.a = drbm.b;
                tabLayout.g(e2);
                ehrt e3 = tabLayout.e();
                e3.h(R.string.emotify_category_others);
                e3.a = drbm.c;
                tabLayout.g(e3);
                tabLayout.f(drcfVar.ap);
                return tabLayout;
            }
        });
        this.at = dszr.i;
        this.ap = new drbo(this);
    }

    public final Context a() {
        Context context = this.b;
        if (context != null) {
            return context;
        }
        ffkj.c("context");
        return null;
    }

    @Override // defpackage.dtaa
    protected final void aZ(dsjz dsjzVar) {
        ((enrr) a.e().h("com/google/android/libraries/compose/emotify/ui/screen/EmotifyScreen", "applyHugoColors", 169, "EmotifyScreen.kt")).t("Applying HugoColors: %s", dsjzVar);
        e().setBackgroundColor(dsjzVar.d);
        e().t(dsjzVar.f);
    }

    @Override // defpackage.ea
    public final void ap(View view, Bundle bundle) {
        view.getClass();
        ffqy.d(p(), null, null, new drbu(this, null), 3);
        Resources resources = A().getResources();
        int i = ((drbd) bA()).a;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.sticker_item_min_size);
        dtdg dtdgVar = this.d;
        if (dtdgVar == null) {
            ffkj.c("gridLayoutManagerFactory");
            dtdgVar = null;
        }
        this.an = dtdgVar.a(new dtdj(new dtdr(dimensionPixelSize, 3)));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.emotify_gallery_recycler_view);
        ReactiveGridLayoutManager reactiveGridLayoutManager = this.an;
        if (reactiveGridLayoutManager == null) {
            ffkj.c("stickerListLayoutManager");
            reactiveGridLayoutManager = null;
        }
        recyclerView.ap(reactiveGridLayoutManager);
        drcp drcpVar = this.ag;
        if (drcpVar == null) {
            ffkj.c("recentStickersAdapterFactory");
            drcpVar = null;
        }
        ffbz ffbzVar = drje.a;
        drco drcoVar = new drco((draz) drcpVar.a.b(), new drrj(drjd.a(), ImageView.ScaleType.FIT_CENTER, 4), new drmb(drbv.a), new drbw(this), new drbx(this));
        this.am = drcoVar;
        recyclerView.am(drcoVar);
        this.aq = (ViewStub) kvo.b(N(), R.id.zero_state_image);
        ffqy.d(bF(), null, null, new drce(this, null), 3);
        bQ();
    }

    public final dqze b() {
        dqze dqzeVar = this.c;
        if (dqzeVar != null) {
            return dqzeVar;
        }
        ffkj.c("stickerStore");
        return null;
    }

    public final TabLayout e() {
        return (TabLayout) this.as.a();
    }

    public final Optional f() {
        Optional optional = this.aj;
        if (optional != null) {
            return optional;
        }
        ffkj.c("emotifySendEventTracker");
        return null;
    }

    @Override // defpackage.drck, defpackage.dslv, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        Optional f = f();
        final ffji ffjiVar = new ffji() { // from class: drbe
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                adao adaoVar = (adao) obj;
                enru enruVar = drcf.a;
                adaoVar.getClass();
                adaoVar.a++;
                return ffcu.a;
            }
        };
        f.ifPresent(new Consumer() { // from class: drbf
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                enru enruVar = drcf.a;
                ffji.this.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        dqiz dqizVar = this.e;
        if (dqizVar == null) {
            ffkj.c("usageProcessorFactory");
            dqizVar = null;
        }
        this.al = dqizVar.a(new dqkd(31));
        by().e("EmotifyScreen#onAttach", new ffix() { // from class: drbg
            @Override // defpackage.ffix
            public final Object invoke() {
                dqiy dqiyVar = drcf.this.al;
                if (dqiyVar == null) {
                    ffkj.c("usageProcessor");
                    dqiyVar = null;
                }
                return Boolean.valueOf(dqiyVar.d());
            }
        });
    }

    public final ffsk p() {
        ffsk ffskVar = this.ah;
        if (ffskVar != null) {
            return ffskVar;
        }
        ffkj.c("cpuBoundScope");
        return null;
    }

    public final void q(drbm drbmVar) {
        this.ao.f(drbmVar);
    }

    public final void r(boolean z) {
        if (this.Q != null) {
            if (z && this.ar == null) {
                ViewStub viewStub = this.aq;
                ComposeView composeView = null;
                if (viewStub == null) {
                    ffkj.c("zeroStateViewStub");
                    viewStub = null;
                }
                View inflate = viewStub.inflate();
                inflate.getClass();
                ComposeView composeView2 = (ComposeView) inflate;
                this.ar = composeView2;
                if (composeView2 == null) {
                    ffkj.c("zeroStateView");
                    composeView2 = null;
                }
                composeView2.a(drbc.b);
                ffji ffjiVar = egyi.a;
                ComposeView composeView3 = this.ar;
                if (composeView3 == null) {
                    ffkj.c("zeroStateView");
                } else {
                    composeView = composeView3;
                }
                ffjiVar.invoke(composeView);
            }
            ComposeView composeView4 = this.ar;
            if (composeView4 != null) {
                composeView4.setVisibility(true != z ? 8 : 0);
            }
        }
    }

    @Override // defpackage.dsyk
    public final dsyj s() {
        RecyclerView recyclerView;
        View view = this.Q;
        if (view == null || (recyclerView = (RecyclerView) view.findViewById(R.id.emotify_gallery_recycler_view)) == null) {
            return null;
        }
        return new drbn(this, dsyh.a(recyclerView));
    }

    @Override // defpackage.dtaa
    public final dszr t() {
        return this.at;
    }
}
