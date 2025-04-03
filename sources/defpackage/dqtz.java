package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.material.tabs.TabLayout;
import defpackage.dqtz;
import defpackage.wo;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqtz extends dqub {
    public static final /* synthetic */ int ar = 0;
    private static final enru as = enru.c("com/google/android/libraries/compose/emoji/ui/screen/EmojiScreen");
    public dqoh a;
    public dqur ag;
    public emxc ah;
    public dqwk ai;
    public dqiz aj;
    public dqiy ak;
    public dqoy al;
    public ffss am;
    public GridLayoutManager an;
    public int ao;
    public final ffji ap;
    public dqth aq;
    private final dszr at;
    private dtan au;
    private final ffbz av;
    private final ffbz aw;
    private final dqtk ax;
    private final dqto ay;
    public ffsk b;
    public dqxh c;
    public dquy d;
    public dquz e;

    public dqtz() {
        super(new dqsv(null, null, PrivateKeyType.INVALID));
        this.at = dszr.b;
        this.av = ffca.a(new ffix() { // from class: dqte
            @Override // defpackage.ffix
            public final Object invoke() {
                return Integer.valueOf(dqtz.this.B().getDimensionPixelSize(R.dimen.emoji_tab_height));
            }
        });
        this.aw = ffca.a(new ffix() { // from class: dqtf
            @Override // defpackage.ffix
            public final Object invoke() {
                return new dqtn(dqtz.this);
            }
        });
        this.ap = new ffji() { // from class: dqtg
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                Iterable iterable = (Iterable) obj;
                iterable.getClass();
                dquy p = dqtz.this.p();
                ArrayList arrayList = new ArrayList(ffdx.n(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(new dqus((dqqj) it.next(), 0));
                }
                p.r.d(dquy.n[0], arrayList);
                return ffcu.a;
            }
        };
        this.ax = new dqtk(this);
        this.ay = new dqto(this);
    }

    static /* synthetic */ boolean bf(final dqtz dqtzVar) {
        return dqtzVar.bl(new ffix() { // from class: dqsz
            @Override // defpackage.ffix
            public final Object invoke() {
                return dqtz.this.bN().a();
            }
        });
    }

    private final void bi(TabLayout tabLayout, String str, Drawable drawable) {
        ehrt e = tabLayout.e();
        e.d(str);
        e.e(drawable);
        View childAt = e.i.getChildAt(0);
        childAt.getClass();
        ImageView imageView = (ImageView) childAt;
        imageView.setImageTintList(koa.d(imageView.getContext(), R.color.selectable_action_selector));
        tabLayout.g(e);
    }

    private final void bj(boolean z) {
        dqth dqthVar = this.aq;
        dqth dqthVar2 = null;
        if (dqthVar == null) {
            ffkj.c("views");
            dqthVar = null;
        }
        RecyclerView recyclerView = dqthVar.a;
        int i = 0;
        if (z) {
            recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), ((Number) this.av.a()).intValue());
            recyclerView.z(this.ay);
        } else {
            recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), 0);
            recyclerView.ai(this.ay);
            i = 8;
        }
        dqth dqthVar3 = this.aq;
        if (dqthVar3 == null) {
            ffkj.c("views");
        } else {
            dqthVar2 = dqthVar3;
        }
        dqthVar2.b.setVisibility(i);
        dqthVar2.c.setVisibility(i);
    }

    private final void bk() {
        p().g = f();
        q().g = f();
        final int f = ffmk.f(p().h, 1);
        final Context z = z();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(f, this, z) { // from class: com.google.android.libraries.compose.emoji.ui.screen.EmojiScreen$initGridLayoutManager$gridManager$1
            final /* synthetic */ dqtz J;

            @Override // android.support.v7.widget.LinearLayoutManager
            protected final int O(wo woVar) {
                woVar.getClass();
                return 1000;
            }

            @Override // android.support.v7.widget.LinearLayoutManager, defpackage.vx
            public final boolean ag() {
                return !this.J.r().isShowing();
            }
        };
        gridLayoutManager.g = new dqtp(this);
        this.an = gridLayoutManager;
        dqth dqthVar = this.aq;
        if (dqthVar == null) {
            ffkj.c("views");
            dqthVar = null;
        }
        GridLayoutManager gridLayoutManager2 = this.an;
        if (gridLayoutManager2 == null) {
            ffkj.c("layoutManager");
            gridLayoutManager2 = null;
        }
        dqthVar.a.ap(gridLayoutManager2);
        dqth dqthVar2 = this.aq;
        if (dqthVar2 == null) {
            ffkj.c("views");
            dqthVar2 = null;
        }
        dslh.e(dqthVar2.a, R.id.proxy_screen_header);
        ffqy.d(bF(), null, null, new dqtw(this, null), 3);
    }

    private final boolean bl(ffix ffixVar) {
        dqur dqurVar;
        return (this.aW == null || ffixVar.invoke() == dsxi.b || (dqurVar = this.ag) == null || !ffkj.e(dqurVar, p())) ? false : true;
    }

    private final void bm(TabLayout tabLayout) {
        ffqy.d(bF(), null, null, new dqty(this, tabLayout, null), 3);
    }

    public static final /* synthetic */ dqsv e(dqtz dqtzVar) {
        return (dqsv) dqtzVar.bA();
    }

    public final dqiy a() {
        dqiy dqiyVar = this.ak;
        if (dqiyVar != null) {
            return dqiyVar;
        }
        ffkj.c("emojiUsageProcessor");
        return null;
    }

    @Override // defpackage.dtae
    public final dtan aT() {
        dtan dtanVar = this.au;
        if (dtanVar != null) {
            return dtanVar;
        }
        emxc emxcVar = this.ah;
        if (emxcVar != null) {
            final dqtj dqtjVar = new dqtj(this);
            this.au = (dtan) ((emxn) emxcVar.b(new emwl() { // from class: dqtc
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    int i = dqtz.ar;
                    return ffji.this.invoke(obj);
                }
            })).a;
        }
        return this.au;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object aU(defpackage.ffgu r8) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqtz.aU(ffgu):java.lang.Object");
    }

    public final void aY(int i) {
        int O = p().O(i);
        GridLayoutManager gridLayoutManager = this.an;
        if (gridLayoutManager == null) {
            ffkj.c("layoutManager");
            gridLayoutManager = null;
        }
        gridLayoutManager.ac(O, 0);
        if (i > 0) {
            bN().b(false);
        }
    }

    @Override // defpackage.dtaa
    protected final void aZ(dsjz dsjzVar) {
        ((enrr) as.e().h("com/google/android/libraries/compose/emoji/ui/screen/EmojiScreen", "applyHugoColors", 121, "EmojiScreen.kt")).t("Applying HugoColors: %s", dsjzVar);
        dqth dqthVar = this.aq;
        if (dqthVar == null) {
            ffkj.c("views");
            dqthVar = null;
        }
        dqthVar.c.r(dsjzVar.f);
        dqthVar.c.setBackgroundColor(dsjzVar.d);
        dqthVar.d.setImageTintList(dsjzVar.k);
        dqthVar.e.setBackgroundColor(dsjzVar.j);
    }

    @Override // defpackage.ea
    public final void ap(View view, Bundle bundle) {
        view.getClass();
        p().K((dqsv) bA());
        q().K((dqsv) bA());
        this.aq = new dqth((ViewGroup) view);
        bQ();
        bk();
        dqth dqthVar = this.aq;
        dqth dqthVar2 = null;
        if (dqthVar == null) {
            ffkj.c("views");
            dqthVar = null;
        }
        dqthVar.a.am(p());
        dqth dqthVar3 = this.aq;
        if (dqthVar3 == null) {
            ffkj.c("views");
            dqthVar3 = null;
        }
        dqthVar3.d.setVisibility(true != ((dqsv) bA()).f ? 8 : 0);
        dqth dqthVar4 = this.aq;
        if (dqthVar4 == null) {
            ffkj.c("views");
        } else {
            dqthVar2 = dqthVar4;
        }
        dqthVar2.d.setOnClickListener(by().b("EmojiScreen.backspace#onClick", new View.OnClickListener() { // from class: dqtb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                new dqtl(((dqls) dqtz.this.f().a.bE().invoke()).a).invoke();
            }
        }));
        by().e("EmojiScreen#onViewCreated", new ffix() { // from class: dqta
            @Override // defpackage.ffix
            public final Object invoke() {
                dqtz dqtzVar = dqtz.this;
                return ffqy.d(dqtzVar.bF(), null, null, new dqtu(dqtzVar, null), 3);
            }
        });
    }

    public final dqoy b() {
        dqoy dqoyVar = this.al;
        if (dqoyVar != null) {
            return dqoyVar;
        }
        ffkj.c("emojiPreferencesService");
        return null;
    }

    public final void ba(int i) {
        dqth dqthVar = this.aq;
        if (dqthVar == null) {
            ffkj.c("views");
            dqthVar = null;
        }
        ehrt d = dqthVar.c.d(i);
        if (d != null) {
            this.ao = i;
            d.b();
        }
    }

    public final void bb(dqur dqurVar) {
        dqth dqthVar = this.aq;
        if (dqthVar == null) {
            ffkj.c("views");
            dqthVar = null;
        }
        dqur dqurVar2 = this.ag;
        if (dqurVar2 == null || !ffkj.e(dqurVar, dqurVar2)) {
            if (this.ag != null) {
                b().d(dqurVar);
            }
            b().c(dqurVar);
            this.ag = dqurVar;
            if (dqurVar == null) {
                ffkj.c("currentAdapter");
                dqurVar = null;
            }
            dqthVar.a.am(dqurVar);
            bj(bf(this));
        }
    }

    @Override // defpackage.dtaa
    public final void be() {
        if (this.aq != null) {
            bj(bf(this));
        }
    }

    public final dqtn f() {
        return (dqtn) this.aw.a();
    }

    @Override // defpackage.dqub, defpackage.dslv, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        dqiz dqizVar = this.aj;
        if (dqizVar == null) {
            ffkj.c("emojiUsageProcessorFactory");
            dqizVar = null;
        }
        this.ak = dqizVar.a(new dqkd(29));
        by().e("EmojiScreen#onAttach", new ffix() { // from class: dqsx
            @Override // defpackage.ffix
            public final Object invoke() {
                dqtz dqtzVar = dqtz.this;
                ffsk ffskVar = dqtzVar.b;
                if (ffskVar == null) {
                    ffkj.c("cpuBoundScope");
                    ffskVar = null;
                }
                dqtzVar.am = ffqy.c(ffskVar, null, new dqtq(dqtzVar, null), 3);
                return Boolean.valueOf(dqtzVar.a().d());
            }
        });
    }

    @Override // defpackage.dtaa
    public final void gS(final dsxi dsxiVar) {
        dsxiVar.getClass();
        if (this.aq != null) {
            bj(bl(new ffix() { // from class: dqtd
                @Override // defpackage.ffix
                public final Object invoke() {
                    int i = dqtz.ar;
                    return dsxi.this;
                }
            }));
        }
    }

    @Override // defpackage.dslv
    public final boolean gY() {
        boolean isShowing = r().isShowing();
        if (isShowing) {
            r().a();
        }
        return isShowing;
    }

    @Override // defpackage.ea
    public final void i() {
        super.i();
        dqth dqthVar = this.aq;
        dqur dqurVar = null;
        if (dqthVar != null) {
            dqthVar.a.D();
            dqth dqthVar2 = this.aq;
            if (dqthVar2 == null) {
                ffkj.c("views");
                dqthVar2 = null;
            }
            dqthVar2.c.E.clear();
        }
        if (this.ag != null) {
            dqoy b = b();
            dqur dqurVar2 = this.ag;
            if (dqurVar2 == null) {
                ffkj.c("currentAdapter");
            } else {
                dqurVar = dqurVar2;
            }
            b.d(dqurVar);
        }
    }

    @Override // defpackage.ea, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        dqth dqthVar = this.aq;
        if (dqthVar != null) {
            bm(dqthVar.c);
            bk();
        }
        if (this.c == null || !r().isShowing()) {
            return;
        }
        r().a();
    }

    public final dquy p() {
        dquy dquyVar = this.d;
        if (dquyVar != null) {
            return dquyVar;
        }
        ffkj.c("galleryAdapter");
        return null;
    }

    public final dquz q() {
        dquz dquzVar = this.e;
        if (dquzVar != null) {
            return dquzVar;
        }
        ffkj.c("searchAdapter");
        return null;
    }

    public final dqxh r() {
        dqxh dqxhVar = this.c;
        if (dqxhVar != null) {
            return dqxhVar;
        }
        ffkj.c("variantMenu");
        return null;
    }

    @Override // defpackage.dsyk
    public final dsyj s() {
        dqth dqthVar = this.aq;
        if (dqthVar != null) {
            return dsyh.a(dqthVar.a);
        }
        return null;
    }

    @Override // defpackage.dtaa
    public final dszr t() {
        return this.at;
    }
}
