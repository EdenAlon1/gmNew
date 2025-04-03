package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.apps.messaging.R;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drxo implements dsyk {
    static final /* synthetic */ ffmx[] a;
    public static final /* synthetic */ int j = 0;
    public final Map b;
    public final ViewGroup c;
    public final drxq d;
    public final ea e;
    public final ffji f;
    public final dqku g;
    public dsxk h;
    public final int i;
    private final EditText k;
    private final dtad l;
    private final Map m;
    private final List n;
    private final View.OnLayoutChangeListener o;
    private final ffls p;
    private final ffls q;
    private dszr r;
    private Bundle s;
    private dsxd t;

    static {
        ffko ffkoVar = new ffko(drxo.class, "activeScreen", "getActiveScreen()Lcom/google/android/libraries/compose/ui/screen/HugoScreen;", 0);
        int i = fflc.a;
        a = new ffmx[]{ffkoVar, new ffko(drxo.class, "draftController", "getDraftController()Lkotlin/jvm/functions/Function0;", 0)};
    }

    public drxo(Map map, ViewGroup viewGroup, EditText editText, drxq drxqVar, List list, ea eaVar, dtad dtadVar, ffji ffjiVar, Map map2) {
        this.b = map;
        this.c = viewGroup;
        this.k = editText;
        this.d = drxqVar;
        this.e = eaVar;
        this.l = dtadVar;
        this.f = ffjiVar;
        this.m = map2;
        ArrayList<dszr> arrayList = new ArrayList();
        for (Object obj : list) {
            if (this.b.containsKey((dszr) obj)) {
                arrayList.add(obj);
            }
        }
        this.n = arrayList;
        int size = arrayList.size();
        this.i = size != 0 ? size != 1 ? 3 : 2 : 1;
        this.o = new View.OnLayoutChangeListener() { // from class: drxh
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (i4 == i8 && i2 == i6) {
                    return;
                }
                drxo drxoVar = drxo.this;
                ViewGroup.LayoutParams layoutParams = drxoVar.c.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                int i9 = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
                int i10 = i4 - i2;
                ViewGroup.LayoutParams layoutParams2 = drxoVar.c.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                drxo.h(drxoVar, i10 + i9 + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0), null, 6);
            }
        };
        this.g = new dqku(new ffix() { // from class: drxi
            @Override // defpackage.ffix
            public final Object invoke() {
                dtaa b = drxo.this.b();
                if (b != null) {
                    return b.gR();
                }
                return null;
            }
        }, new ffji() { // from class: drxj
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                dsyj dsyjVar = (dsyj) obj2;
                if (dsyjVar == null) {
                    return null;
                }
                drxo drxoVar = drxo.this;
                drxn drxnVar = new drxn(dsyjVar, drxoVar);
                drxnVar.c().a(drxoVar.d.b.e);
                return drxnVar;
            }
        });
        this.p = new drxl(this);
        this.q = new drxm(this);
        dtaa b = b();
        if (b != null) {
            e(b);
        }
        drxw drxwVar = this.d.a;
        drxk drxkVar = new drxk(this);
        drxwVar.d = arrayList;
        if (arrayList.size() <= 1) {
            drxwVar.c.i.setVisibility(8);
            drxwVar.c.c.setBackground(null);
        } else {
            drxb drxbVar = drxwVar.c;
            drxbVar.c.setBackground(drxbVar.a.getContext().getDrawable(R.drawable.compose_screen_top_bar_background));
            TabLayout tabLayout = drxwVar.c.i;
            drxwVar.e.d(drxw.a[0], new drxs(drxkVar, arrayList));
            for (dszr dszrVar : arrayList) {
                ehrt e = tabLayout.e();
                e.h(dszrVar.j);
                ffqy.d(drxwVar.b, null, null, new drxu(e, drxwVar, null), 3);
                tabLayout.g(e);
            }
        }
        if (this.i == 2) {
            if (this.n.size() == 1) {
                f(c((dszr) ffdx.K(this.n), a()));
                return;
            }
            throw new IllegalStateException("Cannot set up single layout with " + this.n.size() + " screen(s)");
        }
    }

    public static /* synthetic */ void h(drxo drxoVar, int i, dtaa dtaaVar, int i2) {
        if ((i2 & 1) != 0) {
            ViewGroup viewGroup = drxoVar.c;
            int height = viewGroup.getHeight();
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int i3 = height + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
            ViewGroup.LayoutParams layoutParams2 = drxoVar.c.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            i = (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0) + i3;
        }
        int translationY = (i2 & 2) != 0 ? (int) drxoVar.c.getTranslationY() : 0;
        if ((i2 & 4) != 0) {
            dtaaVar = null;
        }
        if (dtaaVar == null) {
            dtaaVar = drxoVar.b();
        }
        if (dtaaVar != null) {
            int i4 = i + translationY;
            dsyj gR = dtaaVar.gR();
            if (gR == null) {
                dtaaVar.aV = i4;
            } else {
                dtaa.bO(gR, i4);
            }
        }
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        Editable text = this.k.getText();
        text.getClass();
        if (text.length() > 0) {
            bundle.putString("search", text.toString());
        }
        return bundle;
    }

    public final dtaa b() {
        return (dtaa) this.p.c(a[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        if (r1 != null) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [dslv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dtaa c(defpackage.dszr r7, android.os.Bundle r8) {
        /*
            r6 = this;
            dsxk r0 = r6.h
            r1 = 0
            if (r0 == 0) goto L73
            java.util.Map r0 = r6.b
            java.lang.Object r0 = r0.get(r7)
            dszv r0 = (defpackage.dszv) r0
            if (r0 == 0) goto L60
            ea r2 = r6.e
            fr r2 = r2.I()
            r2.getClass()
            dsxk r3 = r6.h
            if (r3 != 0) goto L22
            java.lang.String r3 = "renderingStrategy"
            defpackage.ffkj.c(r3)
            r3 = r1
        L22:
            dsxd r4 = r6.t
            if (r4 != 0) goto L2c
            java.lang.String r4 = "renderingStateHandler"
            defpackage.ffkj.c(r4)
            r4 = r1
        L2c:
            r3.getClass()
            r4.getClass()
            dtaa r5 = r0.c(r2)
            if (r5 == 0) goto L3c
            r5.at(r8)
            r1 = r5
        L3c:
            if (r1 == 0) goto L47
            dszt r8 = new dszt
            r8.<init>()
            defpackage.dsxl.b(r3, r2, r8)
            goto L57
        L47:
            dslv r8 = r0.b(r8)
            dszu r1 = new dszu
            r5 = r8
            dtaa r5 = (defpackage.dtaa) r5
            r1.<init>()
            defpackage.dsxl.b(r3, r2, r1)
            r1 = r8
        L57:
            r8 = r1
            dtaa r8 = (defpackage.dtaa) r8
            r8.gU(r3, r4)
            if (r1 == 0) goto L60
            goto L77
        L60:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.util.Objects.toString(r7)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r0 = "Cannot find a factory for screen category "
            java.lang.String r7 = r0.concat(r7)
            r8.<init>(r7)
            throw r8
        L73:
            r6.r = r7
            r6.s = r8
        L77:
            dtaa r1 = (defpackage.dtaa) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drxo.c(dszr, android.os.Bundle):dtaa");
    }

    public final void d(ffix ffixVar) {
        ffixVar.getClass();
        this.q.d(a[1], ffixVar);
    }

    public final void e(dtaa dtaaVar) {
        dtal d;
        Object obj = this.m.get(dtaaVar.t());
        Editable editable = null;
        dtaaVar.bG(obj instanceof dtab ? (dtab) obj : null);
        h(this, 0, dtaaVar, 3);
        this.c.addOnLayoutChangeListener(this.o);
        ffix ffixVar = (ffix) this.q.c(a[1]);
        if (ffixVar != null) {
            dtaaVar.gV(ffixVar);
        }
        dsxk dsxkVar = this.h;
        if (dsxkVar == null) {
            ffkj.c("renderingStrategy");
            dsxkVar = null;
        }
        dsxd dsxdVar = this.t;
        if (dsxdVar == null) {
            ffkj.c("renderingStateHandler");
            dsxdVar = null;
        }
        dtaaVar.gU(dsxkVar, dsxdVar);
        if (dtaaVar instanceof dtae) {
            dtae dtaeVar = (dtae) dtaaVar;
            dtaeVar.aX = this.l;
            Editable text = this.k.getText();
            if (true == ffpc.J(text)) {
                text = null;
            }
            if (text != null) {
                dtan aT = dtaeVar.aT();
                if (aT != null && (d = aT.d()) != null) {
                    d.c(text.toString());
                }
                editable = text;
            }
            if (editable == null) {
                dtaeVar.gT();
            }
        }
        dtaaVar.be();
    }

    public final void f(dtaa dtaaVar) {
        this.p.d(a[0], dtaaVar);
    }

    public final void g(dsxk dsxkVar, dsxd dsxdVar) {
        dsxkVar.getClass();
        dsxdVar.getClass();
        this.h = dsxkVar;
        this.t = dsxdVar;
        dszr dszrVar = this.r;
        dsxd dsxdVar2 = null;
        if (dszrVar != null) {
            Bundle bundle = this.s;
            if (bundle == null) {
                bundle = Bundle.EMPTY;
            }
            bundle.getClass();
            f(c(dszrVar, bundle));
            this.r = null;
            this.s = null;
            return;
        }
        dtaa b = b();
        if (b != null) {
            dsxk dsxkVar2 = this.h;
            if (dsxkVar2 == null) {
                ffkj.c("renderingStrategy");
                dsxkVar2 = null;
            }
            dsxd dsxdVar3 = this.t;
            if (dsxdVar3 == null) {
                ffkj.c("renderingStateHandler");
            } else {
                dsxdVar2 = dsxdVar3;
            }
            b.gU(dsxkVar2, dsxdVar2);
        }
    }

    @Override // defpackage.dsyk
    public final dsyj s() {
        throw null;
    }
}
