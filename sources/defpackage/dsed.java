package defpackage;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.compose.ui.views.recycler.reactive.ReactiveGridLayoutManager;
import com.google.android.material.tabs.TabLayout;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsed extends dscs {
    public static final enru a = enru.c("com/google/android/libraries/compose/sticker/ui/screen/StickerScreen");
    public ffsk aA;
    public dtdg aB;
    public dsel aC;
    public dscd aD;
    public dree aE;
    public volatile int aF;
    private final dszr aY;
    private GridLayoutManager aZ;
    public drgg ag;
    public ffsk az;
    public GridLayoutManager b;
    private drgf ba;
    private final AtomicBoolean bb;
    private final AtomicBoolean bc;
    private ffss bd;
    private ffss be;
    private final ffji bf;
    private final dsde bg;
    public dseo c;
    public GridLayoutManager d;
    public dsek e;

    public dsed() {
        super(new drgk(dsdb.a), new dsct(false, false, 2047));
        this.aY = dszr.f;
        this.bb = new AtomicBoolean();
        this.bc = new AtomicBoolean();
        this.aF = 1;
        this.bf = new ffji() { // from class: dscv
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dsjz dsjzVar;
                View view = (View) obj;
                view.getClass();
                dsed dsedVar = dsed.this;
                if (dsedVar.aU != null && (dsjzVar = dsedVar.bK().k) != null) {
                    dsed.bj(dsjzVar, view);
                }
                return ffcu.a;
            }
        };
        this.bg = new dsde(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object bT(boolean z, ffgu ffguVar) {
        ffss ffssVar;
        ffss ffssVar2 = null;
        if (z || (ffssVar = this.be) == null || ffssVar.x()) {
            ffss ffssVar3 = this.be;
            if (ffssVar3 != null && ffssVar3.v()) {
                ffss ffssVar4 = this.be;
                if (ffssVar4 == null) {
                    ffkj.c("_favoritePacksDeferred");
                    ffssVar4 = null;
                }
                ffssVar4.t(null);
            }
            this.be = ffqy.c(bq(), null, new dsdf(this, null), 3);
        }
        ffss ffssVar5 = this.be;
        if (ffssVar5 == null) {
            ffkj.c("_favoritePacksDeferred");
        } else {
            ffssVar2 = ffssVar5;
        }
        return ffssVar2.c(ffguVar);
    }

    public static final /* synthetic */ dsct bm(dsed dsedVar) {
        return (dsct) dsedVar.bA();
    }

    static /* synthetic */ Object bv(dsed dsedVar, ffgu ffguVar) {
        return dsedVar.bT(false, ffguVar);
    }

    static /* synthetic */ Object bx(dsed dsedVar, ffgu ffguVar) {
        ffss ffssVar = dsedVar.bd;
        ffss ffssVar2 = null;
        if (ffssVar == null || ffssVar.x()) {
            ffss ffssVar3 = dsedVar.bd;
            if (ffssVar3 != null && ffssVar3.v()) {
                ffss ffssVar4 = dsedVar.bd;
                if (ffssVar4 == null) {
                    ffkj.c("_stickerPacksDeferred");
                    ffssVar4 = null;
                }
                ffssVar4.t(null);
            }
            dsedVar.bd = ffqy.c(dsedVar.bq(), null, new dsec(dsedVar, null), 3);
        }
        ffss ffssVar5 = dsedVar.bd;
        if (ffssVar5 == null) {
            ffkj.c("_stickerPacksDeferred");
        } else {
            ffssVar2 = ffssVar5;
        }
        return ffssVar2.c(ffguVar);
    }

    @Override // defpackage.drgb, defpackage.ea
    public final void ap(View view, Bundle bundle) {
        view.getClass();
        super.ap(view, bundle);
        int dimensionPixelSize = A().getResources().getDimensionPixelSize(((dsct) bA()).c);
        dtdg bn = bn();
        this.aZ = bn.a(new dtdj(new dtdq(dimensionPixelSize)));
        drgg drggVar = this.ag;
        if (drggVar == null) {
            ffkj.c("recentStickersAdapterFactory");
            drggVar = null;
        }
        ffbz ffbzVar = drje.a;
        this.ba = drggVar.a(new drrj(drjd.a(), ImageView.ScaleType.FIT_CENTER, ((dsct) bA()).e), new drmb(dsdp.a), new dsdq(this), new dsdr(this));
        dsel dselVar = this.aC;
        if (dselVar == null) {
            ffkj.c("stickerPackAdapterFactory");
            dselVar = null;
        }
        this.e = new dsek((drfd) dselVar.a.b(), new ffji() { // from class: dscw
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dsed dsedVar = dsed.this;
                ffqy.d(dsedVar.bF(), null, null, new dsds(dsedVar, (dsci) obj, null), 3);
                return ffcu.a;
            }
        }, new dsdt(this), new ffji() { // from class: dscx
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dsed.this.bw();
                return ffcu.a;
            }
        }, new ffjm() { // from class: dscy
            @Override // defpackage.ffjm
            public final Object a(Object obj, Object obj2) {
                dsed dsedVar = dsed.this;
                ffqy.d(dsedVar.bF(), null, null, new dsdu(dsedVar, (dscj) obj, (Boolean) obj2, null), 3);
                return ffcu.a;
            }
        });
        dtdg bn2 = bn();
        final ReactiveGridLayoutManager a2 = bn2.a(new dtdj(new dtdq(dimensionPixelSize)));
        dsek dsekVar = this.e;
        if (dsekVar == null) {
            ffkj.c("stickerPackAdapter");
            dsekVar = null;
        }
        a2.g = new dsdd(dsekVar, new ffix() { // from class: dscz
            @Override // defpackage.ffix
            public final Object invoke() {
                return Integer.valueOf(((GridLayoutManager) ReactiveGridLayoutManager.this).b);
            }
        });
        this.d = a2;
        this.b = bn().a(new dtdj(new dtdr(A().getResources().getDimensionPixelSize(R.dimen.gifsticker_category_min_width), ((dsct) bA()).a)));
        dseo dseoVar = new dseo(new ffji() { // from class: dsda
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dscj dscjVar = (dscj) obj;
                dscjVar.getClass();
                dsed dsedVar = dsed.this;
                ffqy.d(dsedVar.bF(), null, null, new dsdi(dsedVar, dscjVar, null), 3);
                return ffcu.a;
            }
        });
        this.c = dseoVar;
        dseoVar.F(this.bf);
        ((dscc) bl()).a.j(new dsdl(this));
        if (((dsct) bA()).d) {
            TabLayout tabLayout = this.ao;
            tabLayout.getClass();
            tabLayout.w();
            ehrt e = tabLayout.e();
            e.h(R.string.sticker_tab_recents);
            e.g(R.drawable.quantum_gm_ic_schedule_vd_theme_24);
            e.a = dsdc.a;
            tabLayout.g(e);
            ehrt e2 = tabLayout.e();
            e2.h(R.string.sticker_tab_favorites);
            e2.g(R.drawable.quantum_gm_ic_favorite_vd_theme_24);
            e2.a = dsdc.b;
            tabLayout.g(e2);
            ehrt e3 = tabLayout.e();
            e3.h(R.string.sticker_tab_all_packs);
            e3.g(R.drawable.quantum_gm_ic_sticker_vd_theme_24);
            e3.a = dsdc.c;
            tabLayout.g(e3);
            tabLayout.f(this.bg);
        }
        ffqy.d(lks.a(Q()), null, null, new dsdo(this, null), 3);
    }

    public final dree bk() {
        dree dreeVar = this.aE;
        if (dreeVar != null) {
            return dreeVar;
        }
        ffkj.c("tenorApi");
        return null;
    }

    public final dscd bl() {
        dscd dscdVar = this.aD;
        if (dscdVar != null) {
            return dscdVar;
        }
        ffkj.c("stickerPacksApi");
        return null;
    }

    public final dtdg bn() {
        dtdg dtdgVar = this.aB;
        if (dtdgVar != null) {
            return dtdgVar;
        }
        ffkj.c("gridLayoutManagerFactory");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object bo(java.util.List r11, defpackage.ffgu r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.dsdg
            if (r0 == 0) goto L13
            r0 = r12
            dsdg r0 = (defpackage.dsdg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dsdg r0 = new dsdg
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            dsed r11 = r0.d
            defpackage.ffci.b(r12)
            goto Lcb
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            defpackage.ffci.b(r12)
            drgf r12 = r10.ba
            r2 = 0
            if (r12 != 0) goto L40
            java.lang.String r12 = "recentStickersAdapter"
            defpackage.ffkj.c(r12)
            r12 = r2
        L40:
            java.util.List r4 = r12.f
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = defpackage.ffdx.n(r11, r6)
            r5.<init>(r6)
            java.util.Iterator r11 = r11.iterator()
        L51:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L95
            java.lang.Object r6 = r11.next()
            drey r6 = (defpackage.drey) r6
            java.util.Iterator r7 = r4.iterator()
        L61:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L75
            java.lang.Object r8 = r7.next()
            r9 = r8
            drey r9 = (defpackage.drey) r9
            boolean r9 = defpackage.ffkj.e(r9, r6)
            if (r9 == 0) goto L61
            goto L76
        L75:
            r8 = r2
        L76:
            drey r8 = (defpackage.drey) r8
            if (r8 != 0) goto L90
            dsdh r7 = new dsdh
            r7.<init>(r10, r6, r2)
            drll r8 = new drll
            r8.<init>(r7)
            drez r7 = new drez
            r7.<init>(r8)
            ffji r7 = defpackage.dqkw.a(r7)
            r6.d = r7
            goto L91
        L90:
            r6 = r8
        L91:
            r5.add(r6)
            goto L51
        L95:
            r11 = 28
            java.util.List r11 = defpackage.dqie.a(r4, r5, r2, r2, r11)
            r12.f = r5
            android.support.v7.widget.GridLayoutManager r4 = r10.aZ
            if (r4 != 0) goto La7
            java.lang.String r4 = "recentStickersLayoutManager"
            defpackage.ffkj.c(r4)
            goto La8
        La7:
            r2 = r4
        La8:
            int r2 = r2.b
            int r2 = r2 * 6
            defpackage.dqie.b(r11, r2, r12)
            int r11 = r10.aF
            r12 = 2
            if (r11 != r12) goto Lcf
            dslw r11 = r10.bA()
            dsct r11 = (defpackage.dsct) r11
            boolean r11 = r11.d
            if (r11 == 0) goto Lca
            r0.d = r10
            r0.c = r3
            java.lang.Object r11 = r10.bp(r0)
            if (r11 == r1) goto Lc9
            goto Lca
        Lc9:
            return r1
        Lca:
            r11 = r10
        Lcb:
            r11.bw()
            goto Ld0
        Lcf:
            r11 = r10
        Ld0:
            r12 = 3
            r11.aF = r12
            ffcu r11 = defpackage.ffcu.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsed.bo(java.util.List, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0071 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:11:0x0029, B:12:0x0069, B:14:0x0071, B:17:0x007a), top: B:10:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:11:0x0029, B:12:0x0069, B:14:0x0071, B:17:0x007a), top: B:10:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object bp(defpackage.ffgu r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.dsdw
            if (r0 == 0) goto L13
            r0 = r8
            dsdw r0 = (defpackage.dsdw) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            dsdw r0 = new dsdw
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r1 = r0.b
            java.lang.Object r2 = r0.a
            dsed r0 = r0.f
            defpackage.ffci.b(r8)     // Catch: java.lang.Exception -> L2d
            goto L69
        L2d:
            r8 = move-exception
            goto L89
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            defpackage.ffci.b(r8)
            com.google.android.material.tabs.TabLayout r8 = r7.ao
            r8.getClass()
            drgf r2 = r7.ba
            if (r2 != 0) goto L49
            java.lang.String r2 = "recentStickersAdapter"
            defpackage.ffkj.c(r2)
            r2 = 0
        L49:
            java.util.List r2 = r2.f
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L57
            dsdc r0 = defpackage.dsdc.a
            r7.br(r8, r0)
            return r8
        L57:
            r0.f = r7     // Catch: java.lang.Exception -> L84
            r0.a = r8     // Catch: java.lang.Exception -> L84
            r0.b = r8     // Catch: java.lang.Exception -> L84
            r0.e = r3     // Catch: java.lang.Exception -> L84
            java.lang.Object r0 = bv(r7, r0)     // Catch: java.lang.Exception -> L84
            if (r0 == r1) goto L83
            r1 = r8
            r2 = r1
            r8 = r0
            r0 = r7
        L69:
            java.util.Collection r8 = (java.util.Collection) r8     // Catch: java.lang.Exception -> L2d
            boolean r8 = r8.isEmpty()     // Catch: java.lang.Exception -> L2d
            if (r8 != 0) goto L7a
            dsdc r8 = defpackage.dsdc.b     // Catch: java.lang.Exception -> L2d
            r3 = r1
            com.google.android.material.tabs.TabLayout r3 = (com.google.android.material.tabs.TabLayout) r3     // Catch: java.lang.Exception -> L2d
            r0.br(r3, r8)     // Catch: java.lang.Exception -> L2d
            return r2
        L7a:
            dsdc r8 = defpackage.dsdc.c     // Catch: java.lang.Exception -> L2d
            r3 = r1
            com.google.android.material.tabs.TabLayout r3 = (com.google.android.material.tabs.TabLayout) r3     // Catch: java.lang.Exception -> L2d
            r0.br(r3, r8)     // Catch: java.lang.Exception -> L2d
            return r2
        L83:
            return r1
        L84:
            r0 = move-exception
            r1 = r8
            r2 = r1
            r8 = r0
            r0 = r7
        L89:
            boolean r3 = r8 instanceof java.lang.RuntimeException
            if (r3 != 0) goto L9d
            boolean r3 = r8 instanceof java.io.IOException
            if (r3 == 0) goto L9c
            dslw r3 = r0.bA()
            dsct r3 = (defpackage.dsct) r3
            boolean r3 = r3.b
            if (r3 == 0) goto L9c
            goto L9d
        L9c:
            throw r8
        L9d:
            enru r3 = defpackage.dsed.a
            ensk r3 = r3.i()
            enrr r3 = (defpackage.enrr) r3
            ensk r8 = r3.g(r8)
            java.lang.String r3 = "selectInitialCategory"
            r4 = 290(0x122, float:4.06E-43)
            java.lang.String r5 = "com/google/android/libraries/compose/sticker/ui/screen/StickerScreen"
            java.lang.String r6 = "StickerScreen.kt"
            ensk r8 = r8.h(r5, r3, r4, r6)
            enrr r8 = (defpackage.enrr) r8
            java.lang.String r3 = "Unable to fetch favorite packs for initial tab."
            r8.q(r3)
            dsdc r8 = defpackage.dsdc.c
            com.google.android.material.tabs.TabLayout r1 = (com.google.android.material.tabs.TabLayout) r1
            r0.br(r1, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsed.bp(ffgu):java.lang.Object");
    }

    public final ffsk bq() {
        ffsk ffskVar = this.az;
        if (ffskVar != null) {
            return ffskVar;
        }
        ffkj.c("cpuBoundScope");
        return null;
    }

    public final void br(TabLayout tabLayout, dsdc dsdcVar) {
        tabLayout.getClass();
        dsdcVar.getClass();
        int b = tabLayout.b();
        if (b < 0) {
            return;
        }
        int i = 0;
        while (true) {
            ehrt d = tabLayout.d(i);
            if ((d != null ? d.a : null) == dsdcVar) {
                tabLayout.m(tabLayout.d(i));
                return;
            } else if (i == b) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void bs(dsdc dsdcVar) {
        int ordinal = dsdcVar.ordinal();
        drgf drgfVar = null;
        if (ordinal != 0) {
            if (ordinal == 1) {
                ffqy.d(bF(), null, null, new dsdz(this, null), 3);
                return;
            } else {
                if (ordinal != 2) {
                    throw new ffcd();
                }
                ffqy.d(bF(), null, null, new dsdx(this, null), 3);
                return;
            }
        }
        drgf drgfVar2 = this.ba;
        if (drgfVar2 == null) {
            ffkj.c("recentStickersAdapter");
            drgfVar2 = null;
        }
        if (drgfVar2.f.isEmpty()) {
            drgb.bi(this, null, Integer.valueOf(R.string.sticker_empty_recents_message), null, Integer.valueOf(R.string.sticker_empty_state_show_all_packs_button), new View.OnClickListener() { // from class: dscu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dsed dsedVar = dsed.this;
                    TabLayout tabLayout = dsedVar.ao;
                    tabLayout.getClass();
                    dsedVar.br(tabLayout, dsdc.c);
                }
            }, 5);
            return;
        }
        GridLayoutManager gridLayoutManager = this.aZ;
        if (gridLayoutManager == null) {
            ffkj.c("recentStickersLayoutManager");
            gridLayoutManager = null;
        }
        drgf drgfVar3 = this.ba;
        if (drgfVar3 == null) {
            ffkj.c("recentStickersAdapter");
        } else {
            drgfVar = drgfVar3;
        }
        bg(gridLayoutManager, drgfVar);
    }

    public final void bt() {
        drgb.bi(this, null, null, this.bc.compareAndSet(false, true) ? Integer.valueOf(R.string.sticker_unable_to_show_packs_message) : null, null, null, 27);
    }

    public final void bw() {
        ffqy.d(bF(), null, null, new dseb(this, null), 3);
    }

    @Override // defpackage.drgb
    public final /* bridge */ /* synthetic */ void e(dren drenVar, String str) {
        dsci dsciVar = (dsci) drenVar;
        bf(new drey(dsciVar.a, dsciVar.b), str);
        ffsk ffskVar = this.aA;
        if (ffskVar == null) {
            ffkj.c("remoteIoScope");
            ffskVar = null;
        }
        ffqy.d(ffskVar, null, null, new dsdv(dsciVar, this, null), 3);
    }

    @Override // defpackage.drgb
    public final void f() {
        bl();
        if (eerv.e(A())) {
            ffqy.d(bF(), null, null, new dsea(this, null), 3);
            return;
        }
        if (this.bb.compareAndSet(false, true)) {
            drgb.bi(this, null, null, Integer.valueOf(R.string.sticker_no_connection_message), null, null, 27);
        }
        if (((dsct) bA()).d) {
            ba();
        }
    }

    @Override // defpackage.dslv
    public final boolean gY() {
        dsek dsekVar = this.e;
        if (dsekVar == null) {
            ffkj.c("stickerPackAdapter");
            dsekVar = null;
        }
        dsekVar.getClass();
        vk vkVar = this.aj;
        if (vkVar == null || !ffkj.e(vkVar, dsekVar)) {
            return false;
        }
        f();
        return true;
    }

    @Override // defpackage.dtaa
    public final dszr t() {
        return this.aY;
    }
}
