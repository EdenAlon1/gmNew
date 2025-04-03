package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czdz extends czdq implements czea {
    public static final enru ah = enru.c("com/google/android/apps/messaging/ui/conversation/emoji/EmojiGalleryFragment");
    public RecyclerView ai;
    public czeh aj;
    public czel ak;
    public GridLayoutManager al;
    public int am;
    public czfz ao;
    private TabLayout ap;
    private final ehrp aq = new czds(this);
    private final ViewTreeObserver.OnGlobalLayoutListener ar = new czdt(this);
    public final wc an = new czdu(this);
    private final ViewTreeObserver.OnGlobalLayoutListener as = new czdv(this);

    private final void aT() {
        if (ddzd.b(z()).x / this.ap.b() < B().getDimensionPixelOffset(R.dimen.emoji_gallery_tab_min_width)) {
            this.ap.s(0);
        } else {
            this.ap.s(1);
            this.ap.y();
        }
    }

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        long a = this.a.a();
        View inflate = layoutInflater.inflate(R.layout.emoji_gallery_fragment, viewGroup, false);
        this.ap = (TabLayout) inflate.findViewById(R.id.emoji_category_tab_layout);
        this.ai = (RecyclerView) inflate.findViewById(R.id.emoji_recycler_view);
        TabLayout tabLayout = this.ap;
        czdy[] values = czdy.values();
        for (int i = 0; i < czdy.values().length; i++) {
            czdy czdyVar = values[i];
            int i2 = czdyVar.k;
            int i3 = czdyVar.l;
            ehrt e = tabLayout.e();
            e.d(Y(i2));
            e.e(z().getDrawable(i3));
            tabLayout.i(e, i, tabLayout.b.isEmpty());
        }
        tabLayout.f(this.aq);
        aT();
        final czer czerVar = new czer(z(), this.ag);
        czerVar.k = czerVar.a.getResources().getDimensionPixelSize(R.dimen.emoji_gallery_column_size_updated);
        czerVar.l = czerVar.a.getResources().getDimensionPixelSize(R.dimen.emoji_variant_selector_panel_side_clearance);
        int i4 = czerVar.k;
        czerVar.m = new FrameLayout.LayoutParams(i4, i4);
        czerVar.setWidth(-1);
        czerVar.setHeight(-1);
        czerVar.setBackgroundDrawable(null);
        czerVar.g = czerVar.c.inflate(R.layout.emoji_variant_selector_popup_window, (ViewGroup) null);
        czerVar.setContentView(czerVar.g);
        czerVar.g.setOnClickListener(new View.OnClickListener() { // from class: czem
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                czer.this.dismiss();
            }
        });
        czerVar.e = new czep(czerVar);
        czerVar.f = new GridLayoutManager(6);
        RecyclerView recyclerView = (RecyclerView) czerVar.g.findViewById(R.id.emoji_variant_selector_recycler_view);
        recyclerView.ap(czerVar.f);
        recyclerView.am(czerVar.e);
        recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: czen
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                czer czerVar2 = czer.this;
                if (czerVar2.b()) {
                    czerVar2.a();
                }
            }
        });
        czerVar.h = czerVar.g.findViewById(R.id.descender);
        czerVar.i = czerVar.g.findViewById(R.id.panel);
        this.ak = czerVar;
        czeh czehVar = new czeh(G(), this.b, this.c, this.d, this.e, this.ag, this.ak);
        this.aj = czehVar;
        this.ai.am(czehVar);
        this.ai.aL();
        RecyclerView recyclerView2 = this.ai;
        z();
        recyclerView2.ap(new GridLayoutManager(1));
        this.ai.getViewTreeObserver().addOnGlobalLayoutListener(this.as);
        long a2 = this.a.a();
        ensk e2 = ah.e();
        e2.Y(ente.a, "emojiGallery");
        ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/ui/conversation/emoji/EmojiGalleryFragment", "onCreateView", 294, "EmojiGalleryFragment.java")).z("Emoji: Fragment onCreateView @%d took: %d", a2, a2 - a);
        inflate.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: czdr
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
                return windowInsets;
            }
        });
        return inflate;
    }

    @Override // defpackage.czdq
    public final void a() {
        this.e.d();
    }

    @Override // defpackage.ea
    public final void ai() {
        super.ai();
        this.e.e();
    }

    @Override // defpackage.czdq
    public final void b() {
        this.ao = null;
        czeh czehVar = this.aj;
        if (czehVar != null) {
            czehVar.K();
        }
    }

    @Override // defpackage.czdq
    public final boolean e() {
        if (!this.ak.isShowing()) {
            return false;
        }
        this.ak.dismiss();
        return true;
    }

    @Override // defpackage.czdq
    public final void f(czfz czfzVar) {
        this.ao = czfzVar;
        czeh czehVar = this.aj;
        if (czehVar != null) {
            czehVar.w = czfzVar;
        }
    }

    @Override // defpackage.ea
    public final void i() {
        czex czexVar;
        super.i();
        czeh czehVar = this.aj;
        if (czehVar != null && (czexVar = czehVar.l) != null) {
            czexVar.c(czehVar);
        }
        this.ap.l(this.aq);
        p(this.ar);
        p(this.as);
    }

    @Override // defpackage.ea, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.ai.getViewTreeObserver().addOnGlobalLayoutListener(this.ar);
        aT();
    }

    public final void p(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        RecyclerView recyclerView = this.ai;
        if (recyclerView != null) {
            recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public final void q(int i) {
        int m = this.aj.m(i);
        GridLayoutManager gridLayoutManager = this.al;
        if (gridLayoutManager != null) {
            gridLayoutManager.ac(m, 0);
        }
    }

    public final void r(int i) {
        ehrt d = this.ap.d(i);
        if (d != null) {
            this.am = i;
            d.b();
        }
    }
}
