package defpackage;

import android.animation.ValueAnimator;
import j$.time.Duration;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dptb {
    public static final enru a = enru.c("com/google/android/libraries/compose/cameragallery/ui/camera/inapp/CameraUiAdapter");
    public final dtcg b;
    public final dpqm c;
    public final ffsk d;
    public final ffji e;
    public final ffji f;
    public boolean g;
    public final fgcm h;
    public ffud i;
    public final dpxc j;
    private final ffbz k;
    private ValueAnimator l;
    private final int m;

    public dptb(dtcg dtcgVar, dpqm dpqmVar, dpxc dpxcVar, final Optional optional, ffsk ffskVar, ffji ffjiVar, ffji ffjiVar2, int i) {
        dtcgVar.getClass();
        dpqmVar.getClass();
        this.b = dtcgVar;
        this.c = dpqmVar;
        this.j = dpxcVar;
        this.d = ffskVar;
        this.e = ffjiVar;
        this.f = ffjiVar2;
        this.m = i;
        this.k = ffca.a(new ffix() { // from class: dprx
            @Override // defpackage.ffix
            public final Object invoke() {
                Optional optional2 = Optional.this;
                optional2.isPresent();
                return optional2.get();
            }
        });
        dpsf dpsfVar = new dpsf(this);
        dpsg dpsgVar = new dpsg(this);
        dpsh dpshVar = new dpsh(this);
        dpsi dpsiVar = new dpsi(this);
        dpsj dpsjVar = new dpsj(this);
        dpsk dpskVar = new dpsk(this);
        dpsl dpslVar = new dpsl(dpqmVar);
        Duration b = dpqmVar.b();
        dpvl dpvlVar = new dpvl(new dpsm(this), new dpsn(this));
        g();
        this.h = fgdm.a(new dptl(b, dpsfVar, dpsgVar, dpshVar, dpsiVar, dpslVar, dpsjVar, dpskVar, i, dpvlVar, 561263));
        ffqy.d(ffskVar, null, null, new dpsb(this, null), 3);
        this.i = ffqy.d(ffskVar, null, null, new dpsd(this, null), 3);
        dpxcVar.a();
    }

    public final ffxx a() {
        return fgck.b(this.h, this.b.d, this.c.k(), this.j.b, new dpsr(this, null));
    }

    public final void b(axz axzVar) {
        if (axzVar == null) {
            return;
        }
        f(axzVar.c());
    }

    public final void c(lkr lkrVar, int i) {
        if (i == ((dptl) this.h.c()).a) {
            return;
        }
        this.c.n(lkrVar, i);
        fgcm fgcmVar = this.h;
        while (true) {
            Object c = fgcmVar.c();
            int i2 = i;
            if (fgcmVar.g(c, dptl.a((dptl) c, i2, null, 0, null, false, null, null, null, 1048574))) {
                return;
            } else {
                i = i2;
            }
        }
    }

    public final void d(float f) {
        ValueAnimator valueAnimator = this.l;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        axz axzVar = (axz) this.c.l().c();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(axzVar != null ? axzVar.c() : 1.0f, f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: dpry
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                valueAnimator2.getClass();
                Object animatedValue = valueAnimator2.getAnimatedValue();
                animatedValue.getClass();
                dptb.this.c.p(((Float) animatedValue).floatValue());
            }
        });
        ofFloat.getClass();
        ofFloat.addListener(new dpsq(this, f));
        ofFloat.setDuration(500L);
        ofFloat.setInterpolator(new ljm());
        ofFloat.start();
        this.l = ofFloat;
    }

    public final void e(lkr lkrVar, atl atlVar) {
        g();
        g();
        this.c.m(lkrVar, atlVar);
        while (true) {
            fgcm fgcmVar = this.h;
            Object c = fgcmVar.c();
            atl atlVar2 = atlVar;
            if (fgcmVar.g(c, dptl.a((dptl) c, 0, atlVar2, 0, null, false, null, null, null, 1048573))) {
                g();
                return;
            }
            atlVar = atlVar2;
        }
    }

    public final void f(float f) {
        Object c;
        axz axzVar = (axz) this.c.l().c();
        if (axzVar == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        float f2 = 1.0f;
        if (axzVar.b() < 1.0f) {
            arrayList.add(new dpxk(f < 1.0f ? f : axzVar.b(), f, new dpsx(this)));
        }
        if (f > 1.0f && f < 2.0f) {
            f2 = f;
        }
        arrayList.add(new dpxk(f2, f, new dpsy(this)));
        if (axzVar.a() >= 2.0f) {
            arrayList.add(new dpxk(f > 2.0f ? f : 2.0f, f, new dpsz(this)));
        }
        fgcm fgcmVar = this.h;
        do {
            c = fgcmVar.c();
        } while (!fgcmVar.g(c, dptl.a((dptl) c, 0, null, 0, null, false, arrayList, null, null, 1048511)));
    }

    public final void g() {
    }
}
