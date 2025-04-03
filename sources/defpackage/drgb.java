package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.compose.ui.views.recycler.reactive.ReactiveStaggeredGridLayoutManager;
import com.google.android.material.tabs.TabLayout;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class drgb extends dtae {
    private static final enru a = enru.c("com/google/android/libraries/compose/gifsticker/ui/screen/GifStickerScreen");
    public static final /* synthetic */ int ay = 0;
    private final drgk aA;
    private View ag;
    public final int ah;
    protected RecyclerView ai;
    protected vk aj;
    public sl ak;
    public dtcq al;
    public drgf am;
    public vx an;
    public TabLayout ao;
    public final AtomicBoolean ap;
    public ffsk aq;
    public drgg ar;
    public dtdg as;
    public ffbr at;
    public dtdp au;
    public drgx av;
    public dqiz aw;
    protected dqiy ax;
    private final ffbz az;
    private final int b;
    private final ffbz c;
    private dtan d;
    private drgj e;

    public drgb(int i, int i2, drgk drgkVar, drfe drfeVar) {
        super(R.layout.gifsticker_screen_layout, drfeVar);
        this.b = i;
        this.ah = i2;
        this.aA = drgkVar;
        this.c = ffca.a(new ffix() { // from class: drfh
            @Override // defpackage.ffix
            public final Object invoke() {
                return new dszy(drgb.this.N());
            }
        });
        this.ap = new AtomicBoolean();
        this.az = ffca.a(new ffix() { // from class: drfi
            @Override // defpackage.ffix
            public final Object invoke() {
                ffbr ffbrVar = drgb.this.at;
                if (ffbrVar == null) {
                    ffkj.c("gifStickerContextMenuProvider");
                    ffbrVar = null;
                }
                return (drff) ffbrVar.b();
            }
        });
    }

    private final drff a() {
        return (drff) this.az.a();
    }

    private final dszy b() {
        return (dszy) this.c.a();
    }

    public static /* synthetic */ void bi(drgb drgbVar, Integer num, Integer num2, Integer num3, Integer num4, View.OnClickListener onClickListener, int i) {
        if ((i & 16) != 0) {
            onClickListener = new View.OnClickListener() { // from class: drfm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i2 = drgb.ay;
                }
            };
        }
        View.OnClickListener onClickListener2 = onClickListener;
        int i2 = i & 8;
        int i3 = i & 4;
        int i4 = i & 2;
        int i5 = i & 1;
        Integer num5 = i2 != 0 ? null : num4;
        if (i3 != 0) {
            num3 = null;
        }
        if (i4 != 0) {
            num2 = null;
        }
        Integer num6 = 1 == i5 ? null : num;
        onClickListener2.getClass();
        dszy.c(drgbVar.b(), num6, num2, null, num5, onClickListener2, 4);
        if (num3 != null) {
            num3.intValue();
            ffqy.d(drgbVar.bF(), null, null, new drfz(drgbVar, num3, null), 3);
        }
        drgbVar.r().setVisibility(8);
    }

    public static final void bj(dsjz dsjzVar, View view) {
        view.getBackground().setColorFilter(new PorterDuffColorFilter(iby.b(dsjzVar.a.I), PorterDuff.Mode.SRC_IN));
    }

    @Override // defpackage.ea
    public final boolean aL(MenuItem menuItem) {
        menuItem.getClass();
        if (!((drfe) bA()).d()) {
            return false;
        }
        drff a2 = a();
        if (menuItem.getItemId() != R.id.report_item) {
            throw new IllegalArgumentException("Unrecognized menu option, id: " + menuItem.getItemId());
        }
        dren drenVar = a2.b;
        if (drenVar == null) {
            ffkj.c("selectedMedia");
            drenVar = null;
        }
        dreb drebVar = a2.a;
        Intent intent = new Intent("android.intent.action.VIEW", drebVar.b.a(drenVar.f()));
        intent.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        drebVar.a.startActivity(intent);
        return false;
    }

    @Override // defpackage.dtae
    public final dtan aT() {
        dtan dtanVar = this.d;
        if (dtanVar != null) {
            return dtanVar;
        }
        drgx drgxVar = this.av;
        if (drgxVar != null) {
            drfe drfeVar = (drfe) bA();
            int i = this.b;
            drgk drgkVar = this.aA;
            drfp drfpVar = new drfp(this);
            drfq drfqVar = new drfq(this);
            drfr drfrVar = new drfr(this);
            drfs drfsVar = new drfs(this);
            ffsk ffskVar = (ffsk) drgxVar.a.b();
            ffskVar.getClass();
            ((Context) drgxVar.b.b()).getClass();
            dree dreeVar = (dree) drgxVar.c.b();
            dreeVar.getClass();
            drfeVar.getClass();
            drgkVar.getClass();
            this.d = new drgw(ffskVar, dreeVar, drgxVar.d, drfeVar, i, drgkVar, drfpVar, drfqVar, drfrVar, drfsVar);
        }
        return this.d;
    }

    public final dqiy aU() {
        dqiy dqiyVar = this.ax;
        if (dqiyVar != null) {
            return dqiyVar;
        }
        ffkj.c("usageProcessor");
        return null;
    }

    public final ffsk aY() {
        ffsk ffskVar = this.aq;
        if (ffskVar != null) {
            return ffskVar;
        }
        ffkj.c("cpuBoundScope");
        return null;
    }

    @Override // defpackage.dtaa
    protected final void aZ(final dsjz dsjzVar) {
        ((enrr) a.e().h("com/google/android/libraries/compose/gifsticker/ui/screen/GifStickerScreen", "applyHugoColors", 210, "GifStickerScreen.kt")).t("Applying HugoColors: %s", dsjzVar);
        TabLayout tabLayout = this.ao;
        if (tabLayout != null) {
            tabLayout.setBackgroundColor(dsjzVar.d);
            tabLayout.t(dsjzVar.f);
            tabLayout.r(dsjzVar.f);
        }
        View view = this.ag;
        if (view != null) {
            view.setVisibility(0);
            view.setBackgroundColor(iby.b(dsjzVar.a.r));
        }
        vk vkVar = r().n;
        dseo dseoVar = vkVar instanceof dseo ? (dseo) vkVar : null;
        if (dseoVar != null) {
            dseoVar.F(new ffji() { // from class: drfg
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    View view2 = (View) obj;
                    view2.getClass();
                    drgb.bj(dsjz.this, view2);
                    return ffcu.a;
                }
            });
            dseoVar.p();
        }
        b().b(dsjzVar.h, dsjzVar.i);
    }

    @Override // defpackage.ea
    public void ap(View view, Bundle bundle) {
        vx reactiveStaggeredGridLayoutManager;
        Resources resources;
        view.getClass();
        RecyclerView recyclerView = (RecyclerView) kvo.b(N(), R.id.gifsticker_screen_recycler_view);
        recyclerView.getClass();
        this.ai = recyclerView;
        dslh.e(r(), R.id.proxy_screen_header);
        Context z = z();
        dtdp dtdpVar = null;
        dtdg dtdgVar = null;
        this.al = new dtcq((z == null || (resources = z.getResources()) == null) ? null : Integer.valueOf(resources.getDimensionPixelOffset(R.dimen.standard_corner_radius)), new ffji() { // from class: drfj
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dtcn dtcnVar = (dtcn) obj;
                dtcnVar.getClass();
                drgb.this.bR().m(dtcnVar.a);
                return ffcu.a;
            }
        });
        z();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0);
        dtcq dtcqVar = this.al;
        if (dtcqVar == null) {
            ffkj.c("relatedSearchesAdapter");
            dtcqVar = null;
        }
        this.e = new drgj(linearLayoutManager, dtcqVar, A().getResources().getDimensionPixelOffset(R.dimen.standard_view_padding));
        drgg drggVar = this.ar;
        if (drggVar == null) {
            ffkj.c("gifStickerMediaAdapterFactory");
            drggVar = null;
        }
        this.am = drggVar.a(new drrj(((drfe) bA()).b(), ImageView.ScaleType.FIT_CENTER, ((drfe) bA()).d()), new drmc(), new drfw(this), new drfx(this));
        vk[] vkVarArr = new vk[2];
        drgj drgjVar = this.e;
        if (drgjVar == null) {
            ffkj.c("nestedRecyclerViewAdapter");
            drgjVar = null;
        }
        vkVarArr[0] = drgjVar;
        drgf drgfVar = this.am;
        if (drgfVar == null) {
            ffkj.c("searchResultsAdapter");
            drgfVar = null;
        }
        vkVarArr[1] = drgfVar;
        this.ak = new sl(sk.a, vkVarArr);
        int dimensionPixelSize = A().getResources().getDimensionPixelSize(((drfe) bA()).a());
        ((drfe) bA()).h();
        dtdq dtdqVar = new dtdq(dimensionPixelSize);
        if (((drfe) bA()).b() != null) {
            dtdg dtdgVar2 = this.as;
            if (dtdgVar2 == null) {
                ffkj.c("gridLayoutManagerFactory");
            } else {
                dtdgVar = dtdgVar2;
            }
            reactiveStaggeredGridLayoutManager = dtdgVar.a(new dtdj(dtdqVar, new dtde() { // from class: drfk
                @Override // defpackage.dtde
                public final int a(int i, int i2, int i3) {
                    int i4 = drgb.ay;
                    if (i == 0) {
                        return i3;
                    }
                    return 1;
                }
            }));
        } else {
            dtdp dtdpVar2 = this.au;
            if (dtdpVar2 == null) {
                ffkj.c("staggeredGridLayoutManagerFactory");
            } else {
                dtdpVar = dtdpVar2;
            }
            dtdj dtdjVar = new dtdj(dtdqVar, new drfl(this));
            Context context = (Context) dtdpVar.a.b();
            context.getClass();
            reactiveStaggeredGridLayoutManager = new ReactiveStaggeredGridLayoutManager((dtcz) dtdpVar.b.b(), context.getResources().getDimensionPixelSize(R.dimen.standard_view_padding), dtdjVar);
        }
        this.an = reactiveStaggeredGridLayoutManager;
        if (((drfe) bA()).g()) {
            View b = kvo.b(N(), R.id.gifsticker_categories_tab_layout);
            b.getClass();
            View inflate = ((ViewStub) b).inflate();
            inflate.getClass();
            TabLayout tabLayout = (TabLayout) inflate;
            dslh.e(tabLayout, R.id.proxy_screen_tabs);
            this.ao = tabLayout;
            this.ag = view.findViewById(R.id.gifsticker_categories_tab_top_border);
        }
        if (((drfe) bA()).d()) {
            r().setOnCreateContextMenuListener(this);
        }
        bQ();
    }

    public final void ba() {
        TabLayout tabLayout = this.ao;
        tabLayout.getClass();
        RecyclerView r = r();
        r.setPadding(r.getPaddingLeft(), r.getPaddingTop(), r.getPaddingRight(), 0);
        tabLayout.setVisibility(8);
    }

    public final void bb(dren drenVar, String str) {
        drenVar.getClass();
        ffqy.d(bF(), null, null, new drft(this, drenVar, str, null), 3);
    }

    protected final void bf(drfa drfaVar, String str) {
        ffqy.d(bF(), null, null, new drfy(this, drfaVar, str, null), 3);
    }

    public final void bg(vx vxVar, vk vkVar) {
        vxVar.getClass();
        vkVar.getClass();
        RecyclerView r = r();
        if (!ffkj.e(r.o, vxVar)) {
            r.ap(vxVar);
        }
        if (!ffkj.e(r.n, vkVar)) {
            r.am(vkVar);
            this.aj = vkVar;
        }
        r.setVisibility(0);
        r.ak(0);
        b().a();
    }

    public final boolean bh(dren drenVar, View view, PointF pointF) {
        drenVar.getClass();
        if (!((drfe) bA()).d() || drenVar.h() != 1) {
            return false;
        }
        drff a2 = a();
        if (pointF == null) {
            pointF = new PointF();
        }
        a2.b = drenVar;
        view.showContextMenu(pointF.x, pointF.y);
        return true;
    }

    public abstract void e(dren drenVar, String str);

    public abstract void f();

    @Override // defpackage.dslv, defpackage.ea
    public void g(Context context) {
        super.g(context);
        dqiz dqizVar = this.aw;
        if (dqizVar == null) {
            ffkj.c("usageProcessorFactory");
            dqizVar = null;
        }
        this.ax = dqizVar.a(new dqkd(31));
        aU().d();
    }

    @Override // defpackage.dtaa, defpackage.ea
    public final void l() {
        dtal dtalVar;
        super.l();
        String bS = bS();
        if (bS != null) {
            dtan aT = aT();
            ffcu ffcuVar = null;
            if (aT != null && (dtalVar = ((drgw) aT).k) != null) {
                dtalVar.c(bS);
                ffcuVar = ffcu.a;
            }
            if (ffcuVar != null) {
                return;
            }
        }
        f();
    }

    @Override // defpackage.ea, android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.getClass();
        view.getClass();
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        if (((drfe) bA()).d()) {
            a();
            MenuInflater menuInflater = fe().getMenuInflater();
            menuInflater.getClass();
            menuInflater.inflate(R.menu.gifsticker_context_menu, contextMenu);
        }
    }

    public final RecyclerView r() {
        RecyclerView recyclerView = this.ai;
        if (recyclerView != null) {
            return recyclerView;
        }
        ffkj.c("recyclerView");
        return null;
    }

    @Override // defpackage.dsyk
    public final dsyj s() {
        RecyclerView recyclerView;
        View view = this.Q;
        if (view == null || (recyclerView = (RecyclerView) view.findViewById(R.id.gifsticker_screen_recycler_view)) == null) {
            return null;
        }
        return dsyh.a(recyclerView);
    }
}
