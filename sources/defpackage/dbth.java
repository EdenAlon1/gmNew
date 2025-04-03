package defpackage;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.apps.messaging.R;
import j$.util.Map;
import j$.util.function.BiFunction$CC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbth implements ljv {
    public dbti a;
    public final Map b = new HashMap();
    private final ea c;
    private int d;
    private Animation e;
    private Animation f;

    public dbth(ea eaVar) {
        this.c = eaVar;
        ((dctl) eaVar).a.c(this);
    }

    private final void j(int i) {
        View decorView;
        if (this.c.Q == null || (decorView = g().getWindow().getDecorView()) == null) {
            return;
        }
        decorView.setSystemUiVisibility(i);
    }

    @Override // defpackage.ljv
    public final void d(lkr lkrVar) {
        dbti dbtiVar = this.a;
        i(dbtiVar.b && dbtiVar.a, false);
    }

    @Override // defpackage.ljv
    public final void f(lkr lkrVar) {
        g().getWindow().getDecorView().setSystemUiVisibility(this.d);
    }

    @Override // defpackage.ljv
    public final void ff(lkr lkrVar) {
        Map.EL.replaceAll(this.b, new BiFunction() { // from class: dbtc
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return null;
            }
        });
    }

    public final eg g() {
        return this.c.G();
    }

    @Override // defpackage.ljv
    public final void gZ(lkr lkrVar) {
        dbti dbtiVar = (dbti) new lmw(g()).a(dbti.class);
        this.a = dbtiVar;
        dbtiVar.c.f(this.c, new llh() { // from class: dbtd
            @Override // defpackage.llh
            public final void a(Object obj) {
                dbth.this.i(((Boolean) obj).booleanValue(), true);
            }
        });
        this.d = g().getWindow().getDecorView().getSystemUiVisibility();
    }

    public final void h(dbtg dbtgVar) {
        View view;
        View view2;
        ArrayList arrayList = new ArrayList();
        dcty dctyVar = (dcty) dbtgVar;
        if (!dctyVar.aa && (view = dctyVar.H.Q) != null) {
            ea eaVar = dctyVar.t;
            if (eaVar == null || ((view2 = eaVar.Q) != null && view2.getVisibility() != 0)) {
                arrayList.add(dctyVar.c());
            }
            arrayList.add(view.findViewById(R.id.primary_button));
            arrayList.add(view.findViewById(R.id.secondary_button_container));
            arrayList.add(view.findViewById(R.id.media_viewer_duration_text));
        }
        this.b.put(dbtgVar, arrayList);
    }

    @Override // defpackage.ljv
    public final void ha(lkr lkrVar) {
        eg g = g();
        if (this.e == null) {
            this.e = AnimationUtils.loadAnimation(g, R.anim.fullscreen_fade_in);
            this.f = AnimationUtils.loadAnimation(g, R.anim.fullscreen_fade_out);
            this.e.setAnimationListener(new dbte(this));
            this.f.setAnimationListener(new dbtf(this));
        }
    }

    public final void i(boolean z, boolean z2) {
        if (z) {
            j(3846);
        } else {
            j(1792);
        }
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (true) {
                if (it2.hasNext()) {
                    View view = (View) it2.next();
                    if (z2) {
                        view.setVisibility(true != z ? 4 : 0);
                        view.requestLayout();
                        view.startAnimation(!z ? this.e : this.f);
                    } else {
                        view.setVisibility(true == z ? 8 : 0);
                    }
                }
            }
        }
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void c(lkr lkrVar) {
    }
}
