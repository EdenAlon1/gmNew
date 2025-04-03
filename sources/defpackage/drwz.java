package defpackage;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drwz extends drwi {
    static final /* synthetic */ ffmx[] a;
    public static final /* synthetic */ int al = 0;
    private static final enru am;
    public drxr ag;
    public drxp ah;
    public drzj ai;
    public Optional aj;
    public Optional ak;
    private final dszr an;
    private final ffls ao;
    private drxq ap;
    private final ffbz aq;
    public drxb b;
    public drzi c;
    public drxo d;
    public fgcm e;

    static {
        ffko ffkoVar = new ffko(drwz.class, "scrollableInterface", "getScrollableInterface()Lcom/google/android/libraries/compose/ui/rendering/container/ScrollableInterface;", 0);
        int i = fflc.a;
        a = new ffmx[]{ffkoVar};
        am = enru.c("com/google/android/libraries/compose/proxy/ui/ProxyScreen");
    }

    public drwz() {
        super(Integer.valueOf(R.layout.proxy_screen_layout), new drxd(false, false, false, false, 0.0f, false, 2047));
        this.an = dszr.d;
        this.ao = new drwy(this);
        this.aq = ffca.a(new ffix() { // from class: drwj
            @Override // defpackage.ffix
            public final Object invoke() {
                Optional optional = drwz.this.aj;
                if (optional == null) {
                    ffkj.c("emotifyButtonControllerOptional");
                    optional = null;
                }
                final ffji ffjiVar = new ffji() { // from class: drwo
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        int i = drwz.al;
                        ((dsgb) obj).getClass();
                        return true;
                    }
                };
                Optional filter = optional.filter(new Predicate() { // from class: drwp
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo439negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        int i = drwz.al;
                        ((Boolean) ffji.this.invoke(obj)).booleanValue();
                        return true;
                    }
                });
                filter.getClass();
                return (dsgb) fflm.b(filter);
            }
        });
    }

    private static final void bb(View view) {
        Drawable foreground = view.getForeground();
        RippleDrawable rippleDrawable = foreground instanceof RippleDrawable ? (RippleDrawable) foreground : null;
        if (rippleDrawable != null) {
            if (view.getWidth() <= 0 || view.getHeight() <= 0) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(new drww(view, rippleDrawable, view));
            } else {
                rippleDrawable.setHotspotBounds(view.getPaddingLeft(), view.getPaddingTop(), view.getWidth() - view.getPaddingRight(), view.getHeight() - view.getPaddingBottom());
            }
        }
    }

    public static final /* synthetic */ drxd e(drwz drwzVar) {
        return (drxd) drwzVar.bA();
    }

    @Override // defpackage.dslv, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int paddingTop;
        layoutInflater.getClass();
        View M = super.M(layoutInflater, viewGroup, bundle);
        drxb drxbVar = new drxb(M);
        this.b = drxbVar;
        ConstraintLayout constraintLayout = drxbVar.c;
        int paddingLeft = constraintLayout.getPaddingLeft();
        Integer num = ((drxd) bA()).b;
        if (num != null) {
            paddingTop = constraintLayout.getContext().getResources().getDimensionPixelSize(num.intValue());
        } else {
            paddingTop = constraintLayout.getPaddingTop();
        }
        constraintLayout.setPadding(paddingLeft, paddingTop, constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Integer num2 = ((drxd) bA()).c;
        if (num2 != null) {
            marginLayoutParams.bottomMargin = constraintLayout.getContext().getResources().getDimensionPixelSize(num2.intValue());
        }
        constraintLayout.setLayoutParams(marginLayoutParams);
        drxb drxbVar2 = this.b;
        drxb drxbVar3 = null;
        if (drxbVar2 == null) {
            ffkj.c("views");
            drxbVar2 = null;
        }
        drxb drxbVar4 = this.b;
        if (drxbVar4 == null) {
            ffkj.c("views");
            drxbVar4 = null;
        }
        drxb drxbVar5 = this.b;
        if (drxbVar5 == null) {
            ffkj.c("views");
            drxbVar5 = null;
        }
        ConstraintLayout constraintLayout2 = drxbVar4.c;
        RecyclerView recyclerView = drxbVar2.l;
        ViewGroup.LayoutParams layoutParams2 = constraintLayout2.getLayoutParams();
        layoutParams2.getClass();
        ViewGroup viewGroup2 = drxbVar5.f;
        viewGroup2.getViewTreeObserver().addOnGlobalLayoutListener(new drwx(viewGroup2, recyclerView, (ViewGroup.MarginLayoutParams) layoutParams2));
        drxb drxbVar6 = this.b;
        if (drxbVar6 == null) {
            ffkj.c("views");
            drxbVar6 = null;
        }
        bb(drxbVar6.d);
        drxb drxbVar7 = this.b;
        if (drxbVar7 == null) {
            ffkj.c("views");
        } else {
            drxbVar3 = drxbVar7;
        }
        bb(drxbVar3.e);
        return M;
    }

    public final void aU(dsyj dsyjVar) {
        this.ao.d(a[0], dsyjVar);
    }

    @Override // defpackage.dtaa
    protected final void aZ(dsjz dsjzVar) {
        ((enrr) am.e().h("com/google/android/libraries/compose/proxy/ui/ProxyScreen", "applyHugoColors", 128, "ProxyScreen.kt")).t("Applying HugoColors: %s", dsjzVar);
        drxo drxoVar = this.d;
        drxb drxbVar = null;
        if (drxoVar == null) {
            ffkj.c("screensController");
            drxoVar = null;
        }
        dtaa b = drxoVar.b();
        if (b != null) {
            b.bM(dsjzVar);
        }
        long j = dsjzVar.a.s;
        int b2 = iby.b(j);
        ColorStateList valueOf = ColorStateList.valueOf(iby.b(j));
        valueOf.getClass();
        drxb drxbVar2 = this.b;
        if (drxbVar2 == null) {
            ffkj.c("views");
        } else {
            drxbVar = drxbVar2;
        }
        drxbVar.c.setBackgroundColor(dsjzVar.d);
        drxbVar.d.setImageTintList(valueOf);
        drxbVar.e.setImageTintList(valueOf);
        drxbVar.g.getBackground().setColorFilter(new PorterDuffColorFilter(dsjzVar.g, PorterDuff.Mode.SRC_ATOP));
        drxbVar.g.setTextColor(b2);
        drxbVar.g.setHintTextColor(b2);
        drxbVar.i.t(dsjzVar.f);
        drxbVar.i.q(dsjzVar.e);
        drxbVar.j.setVisibility(0);
        drxbVar.j.setBackgroundColor(iby.b(dsjzVar.a.r));
    }

    @Override // defpackage.ea
    public final void ai() {
        super.ai();
        drzi drziVar = this.c;
        if (drziVar != null) {
            drziVar.h.k.setOnHierarchyChangeListener(null);
            drziVar.q();
            drziVar.l = false;
        }
    }

    @Override // defpackage.ea
    public final void ap(View view, Bundle bundle) {
        drxq drxqVar;
        drxb drxbVar;
        drxa drxaVar;
        drzi drziVar;
        view.getClass();
        drxr drxrVar = this.ag;
        drxo drxoVar = null;
        if (drxrVar == null) {
            ffkj.c("headerControllerFactory");
            drxrVar = null;
        }
        drxd drxdVar = (drxd) bA();
        drxb drxbVar2 = this.b;
        if (drxbVar2 == null) {
            ffkj.c("views");
            drxbVar2 = null;
        }
        ffix ffixVar = new ffix() { // from class: drwl
            @Override // defpackage.ffix
            public final Object invoke() {
                drxo drxoVar2 = drwz.this.d;
                if (drxoVar2 != null) {
                    drxo.h(drxoVar2, 0, null, 7);
                }
                return ffcu.a;
            }
        };
        drye dryeVar = (drye) drxrVar.a.b();
        drxx drxxVar = (drxx) drxrVar.b.b();
        drxdVar.getClass();
        drxbVar2.getClass();
        this.ap = new drxq(dryeVar, drxxVar, drxbVar2, ffixVar);
        drzj drzjVar = this.ai;
        if (drzjVar == null) {
            ffkj.c("searchControllerFactory");
            drzjVar = null;
        }
        drxq drxqVar2 = this.ap;
        if (drxqVar2 == null) {
            ffkj.c("headerController");
            drxqVar = null;
        } else {
            drxqVar = drxqVar2;
        }
        ffkm ffkmVar = new ffkm(this) { // from class: drwq
            @Override // defpackage.ffkm, defpackage.ffmu
            public final Object a() {
                drwz drwzVar = (drwz) this.g;
                int i = drwz.al;
                return drwzVar.bN();
            }
        };
        drxb drxbVar3 = this.b;
        if (drxbVar3 == null) {
            ffkj.c("views");
            drxbVar = null;
        } else {
            drxbVar = drxbVar3;
        }
        boolean z = ((drxd) bA()).f;
        boolean z2 = ((drxd) bA()).g;
        Activity activity = (Activity) drzjVar.a.b();
        activity.getClass();
        ffsk ffskVar = (ffsk) drzjVar.b.b();
        ffskVar.getClass();
        ffsk ffskVar2 = (ffsk) drzjVar.c.b();
        ffskVar2.getClass();
        ffsk ffskVar3 = (ffsk) drzjVar.d.b();
        ffskVar3.getClass();
        dsma dsmaVar = (dsma) drzjVar.e.b();
        dsmaVar.getClass();
        drzz drzzVar = (drzz) drzjVar.f.b();
        drxqVar.getClass();
        drxbVar.getClass();
        drzi drziVar2 = new drzi(activity, ffskVar, ffskVar2, ffskVar3, dsmaVar, drzzVar, drxqVar, ffkmVar, drxbVar, z, z2);
        this.c = drziVar2;
        drziVar2.j(drziVar2.c());
        drziVar2.h.k.setOnHierarchyChangeListener(drziVar2.j);
        drziVar2.l = true;
        if (!((drxd) bA()).f) {
            drzi drziVar3 = this.c;
            if (drziVar3 == null) {
                ffkj.c("searchController");
                drziVar3 = null;
            }
            drziVar3.e();
        }
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            ArrayList<String> stringArrayList = bundle2.getStringArrayList("categories");
            if (stringArrayList != null) {
                dszr[] values = dszr.values();
                ArrayList arrayList = new ArrayList(ffdx.n(stringArrayList, 10));
                Iterator<T> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(dszr.a((String) it.next()));
                }
                Integer valueOf = Integer.valueOf(bundle2.getInt("initial_screen", -1));
                if (valueOf.intValue() < 0) {
                    valueOf = null;
                }
                drxaVar = new drxa(arrayList, valueOf != null ? values[valueOf.intValue()] : null, bundle2.getString("initial_search_term"));
            } else {
                drxaVar = null;
            }
            if (drxaVar != null) {
                Optional optional = this.ak;
                if (optional == null) {
                    ffkj.c("emotifyController");
                    optional = null;
                }
                final List list = drxaVar.a;
                final ffji ffjiVar = new ffji() { // from class: drwm
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        dqza dqzaVar = (dqza) obj;
                        dqzaVar.getClass();
                        drwz drwzVar = drwz.this;
                        ffqy.d(lks.a(drwzVar.Q()), null, null, new drwu(dqzaVar, drwzVar, list, null), 3);
                        return ffcu.a;
                    }
                };
                optional.ifPresent(new Consumer() { // from class: drwn
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        int i = drwz.al;
                        ffji.this.invoke(obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                drxp drxpVar = this.ah;
                if (drxpVar == null) {
                    ffkj.c("screensControllerFactory");
                    drxpVar = null;
                }
                drxb drxbVar4 = this.b;
                if (drxbVar4 == null) {
                    ffkj.c("views");
                    drxbVar4 = null;
                }
                drxb drxbVar5 = this.b;
                if (drxbVar5 == null) {
                    ffkj.c("views");
                    drxbVar5 = null;
                }
                drxq drxqVar3 = this.ap;
                if (drxqVar3 == null) {
                    ffkj.c("headerController");
                    drxqVar3 = null;
                }
                drzi drziVar4 = this.c;
                if (drziVar4 == null) {
                    ffkj.c("searchController");
                    drziVar = null;
                } else {
                    drziVar = drziVar4;
                }
                EditText editText = drxbVar5.g;
                ConstraintLayout constraintLayout = drxbVar4.c;
                drwv drwvVar = new drwv(this);
                Map map = ((drxd) bA()).a;
                Map map2 = (Map) drxpVar.a.b();
                drxqVar3.getClass();
                drziVar.getClass();
                this.d = new drxo(map2, constraintLayout, editText, drxqVar3, list, this, drziVar, drwvVar, map);
                bQ();
                dszr dszrVar = drxaVar.b;
                if (dszrVar != null) {
                    r(dszrVar);
                }
                String str = drxaVar.c;
                if (str != null) {
                    drzi drziVar5 = this.c;
                    if (drziVar5 == null) {
                        ffkj.c("searchController");
                        drziVar5 = null;
                    }
                    drziVar5.m(str);
                }
                drxo drxoVar2 = this.d;
                if (drxoVar2 == null) {
                    ffkj.c("screensController");
                    drxoVar2 = null;
                }
                drxoVar2.d(bE());
                drxo drxoVar3 = this.d;
                if (drxoVar3 == null) {
                    ffkj.c("screensController");
                } else {
                    drxoVar = drxoVar3;
                }
                drxoVar.g(bK(), bN());
                bJ();
                return;
            }
        }
        throw new IllegalStateException("ProxyScreen must be created with category arguments.");
    }

    @Override // defpackage.dtaa
    public final void bd() {
        dtaa b;
        drxo drxoVar = this.d;
        if (drxoVar == null || (b = drxoVar.b()) == null) {
            return;
        }
        b.bd();
    }

    @Override // defpackage.dtaa
    public final void be() {
        dtaa b;
        drxo drxoVar = this.d;
        if (drxoVar != null && (b = drxoVar.b()) != null) {
            b.be();
        }
        dsgb f = f();
        if (f != null) {
            f.c();
        }
    }

    public final dsgb f() {
        return (dsgb) this.aq.a();
    }

    @Override // defpackage.dtaa
    public final dsyj gR() {
        drxo drxoVar = this.d;
        if (drxoVar == null) {
            return null;
        }
        aU((dsyj) drxoVar.g.a());
        return (dsyj) this.ao.c(a[0]);
    }

    @Override // defpackage.dtaa
    public final void gS(dsxi dsxiVar) {
        dtaa b;
        dsxiVar.getClass();
        drxo drxoVar = this.d;
        if (drxoVar == null || (b = drxoVar.b()) == null) {
            return;
        }
        b.gS(dsxiVar);
    }

    @Override // defpackage.dtaa
    public final void gT() {
        dtaa b;
        drzi drziVar = this.c;
        if (drziVar != null) {
            drziVar.f(true);
        }
        drxo drxoVar = this.d;
        if (drxoVar != null && (b = drxoVar.b()) != null) {
            b.gT();
        }
        aU(null);
    }

    @Override // defpackage.dtaa
    public final void gU(dsxk dsxkVar, dsxd dsxdVar) {
        dsxkVar.getClass();
        dsxdVar.getClass();
        super.gU(dsxkVar, dsxdVar);
        drxo drxoVar = this.d;
        if (drxoVar != null) {
            drxoVar.g(dsxkVar, dsxdVar);
        }
    }

    @Override // defpackage.dslv
    public final void gV(ffix ffixVar) {
        this.aR = ffixVar;
        drxo drxoVar = this.d;
        if (drxoVar != null) {
            drxoVar.d(ffixVar);
        }
    }

    @Override // defpackage.dslv
    public final boolean gY() {
        dtaa b;
        drxo drxoVar = this.d;
        if (drxoVar != null && (b = drxoVar.b()) != null && b.gY()) {
            return true;
        }
        drzi drziVar = this.c;
        if (drziVar == null || drziVar.a() != dryy.b) {
            return false;
        }
        drziVar.g();
        return true;
    }

    @Override // defpackage.ea
    public final void k(Bundle bundle) {
        drxo drxoVar = this.d;
        if (drxoVar == null) {
            ffkj.c("screensController");
            drxoVar = null;
        }
        dtaa b = drxoVar.b();
        if (b != null) {
            bundle.putSerializable("ACTIVE_SCREEN_CATEGORY", b.t());
        }
    }

    @Override // defpackage.ea
    public final void n(Bundle bundle) {
        Serializable serializable;
        super.n(bundle);
        if (bundle == null || (serializable = bundle.getSerializable("ACTIVE_SCREEN_CATEGORY")) == null) {
            return;
        }
        drxq drxqVar = this.ap;
        drxq drxqVar2 = null;
        if (drxqVar == null) {
            ffkj.c("headerController");
            drxqVar = null;
        }
        if (drxqVar.a.b()) {
            drxo drxoVar = this.d;
            if (drxoVar == null) {
                ffkj.c("screensController");
                drxoVar = null;
            }
            for (dszv dszvVar : drxoVar.b.values()) {
                fr I = drxoVar.e.I();
                I.getClass();
                dsxk dsxkVar = drxoVar.h;
                if (dsxkVar == null) {
                    ffkj.c("renderingStrategy");
                    dsxkVar = null;
                }
                dsxkVar.getClass();
                final dtaa c = dszvVar.c(I);
                if (c != null) {
                    dsxl.a(dsxkVar, I, true, new ffji() { // from class: dszs
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            gg ggVar = (gg) obj;
                            ggVar.getClass();
                            ggVar.l(dtaa.this);
                            return ffcu.a;
                        }
                    });
                }
            }
            drxoVar.f(null);
            drxq drxqVar3 = this.ap;
            if (drxqVar3 == null) {
                ffkj.c("headerController");
            } else {
                drxqVar2 = drxqVar3;
            }
            drxqVar2.a.a((dszr) serializable);
        }
    }

    public final void r(dszr dszrVar) {
        drxq drxqVar = this.ap;
        if (drxqVar == null) {
            ffkj.c("headerController");
            drxqVar = null;
        }
        drxw drxwVar = drxqVar.a;
        drxw drxwVar2 = true == drxwVar.b() ? drxwVar : null;
        if (drxwVar2 != null) {
            drxwVar2.a(dszrVar);
        }
    }

    @Override // defpackage.dsyk
    public final dsyj s() {
        return null;
    }

    @Override // defpackage.dtaa
    public final dszr t() {
        return this.an;
    }
}
