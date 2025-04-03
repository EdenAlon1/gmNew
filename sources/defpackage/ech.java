package defpackage;

import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import com.google.android.apps.messaging.R;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ech {
    public static final WeakHashMap a = new WeakHashMap();
    public final dxb b;
    public final dxb c;
    public final dxb d;
    public final dxb e;
    public final dxb f;
    public final ecd g;
    public final boolean h;
    public int i;
    public final eai j;
    private final dxb k = new dxb(4, "captionBar");
    private final dxb l;
    private final dxb m;
    private final dxb n;
    private final ecb o;
    private final ecb p;
    private final ecb q;
    private final ecb r;
    private final ecb s;
    private final ecb t;
    private final ecb u;
    private final ecb v;

    public ech(View view) {
        ecb b;
        ecb b2;
        ecb b3;
        ecb b4;
        ecb b5;
        ecb b6;
        ecb b7;
        dxb dxbVar = new dxb(128, "displayCutout");
        this.b = dxbVar;
        dxb dxbVar2 = new dxb(8, "ime");
        this.c = dxbVar2;
        this.l = new dxb(32, "mandatorySystemGestures");
        this.d = new dxb(2, "navigationBars");
        this.e = new dxb(1, "statusBars");
        dxb dxbVar3 = new dxb(519, "systemBars");
        this.f = dxbVar3;
        this.m = new dxb(16, "systemGestures");
        this.n = new dxb(64, "tappableElement");
        this.o = ecv.b(kpt.a, "waterfall");
        this.g = new eby(new eby(dxbVar3, dxbVar2), dxbVar);
        b = ecv.b(kpt.a, "captionBarIgnoringVisibility");
        this.p = b;
        b2 = ecv.b(kpt.a, "navigationBarsIgnoringVisibility");
        this.q = b2;
        b3 = ecv.b(kpt.a, "statusBarsIgnoringVisibility");
        this.r = b3;
        b4 = ecv.b(kpt.a, "systemBarsIgnoringVisibility");
        this.s = b4;
        b5 = ecv.b(kpt.a, "tappableElementIgnoringVisibility");
        this.t = b5;
        b6 = ecv.b(kpt.a, "imeAnimationTarget");
        this.u = b6;
        b7 = ecv.b(kpt.a, "imeAnimationSource");
        this.v = b7;
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.h = bool != null ? bool.booleanValue() : true;
        this.j = new eai(this);
    }

    public static /* synthetic */ void c(ech echVar, kxh kxhVar) {
        kpt kptVar;
        Insets waterfallInsets;
        echVar.k.f(kxhVar);
        echVar.c.f(kxhVar);
        echVar.b.f(kxhVar);
        echVar.d.f(kxhVar);
        echVar.e.f(kxhVar);
        echVar.f.f(kxhVar);
        echVar.m.f(kxhVar);
        echVar.n.f(kxhVar);
        echVar.l.f(kxhVar);
        echVar.p.f(ecv.a(kxhVar.g(4)));
        echVar.q.f(ecv.a(kxhVar.g(2)));
        echVar.r.f(ecv.a(kxhVar.g(1)));
        echVar.s.f(ecv.a(kxhVar.g(519)));
        echVar.t.f(ecv.a(kxhVar.g(64)));
        ktp j = kxhVar.j();
        if (j != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                waterfallInsets = j.a.getWaterfallInsets();
                kptVar = kpt.e(waterfallInsets);
            } else {
                kptVar = kpt.a;
            }
            echVar.o.f(ecv.a(kptVar));
        }
        hrv.f();
    }

    public final void a(kxh kxhVar) {
        this.v.f(ecv.a(kxhVar.f(8)));
    }

    public final void b(kxh kxhVar) {
        this.u.f(ecv.a(kxhVar.f(8)));
    }
}
