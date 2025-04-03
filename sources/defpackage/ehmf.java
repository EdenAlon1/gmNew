package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehmf extends ehma {
    public static final /* synthetic */ int f = 0;
    private static final Property g = new ehme(Float.class);
    public final ljm a;
    public final ehlc b;
    public int c;
    public boolean d;
    public float e;
    private ObjectAnimator h;

    public ehmf(ehmk ehmkVar) {
        super(3);
        this.c = 1;
        this.b = ehmkVar;
        this.a = new ljm();
    }

    @Override // defpackage.ehma
    public final void a() {
        ObjectAnimator objectAnimator = this.h;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.ehma
    public final void d() {
        if (this.h == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<ehmf, Float>) g, 0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.setDuration((long) (this.b.l * 333.0f));
            this.h.setInterpolator(null);
            this.h.setRepeatCount(-1);
            this.h.addListener(new ehmd(this));
        }
        this.d = true;
        this.c = 1;
        for (ehlx ehlxVar : this.k) {
            ehlc ehlcVar = this.b;
            ehlxVar.c = ehlcVar.c[0];
            ehlxVar.d = ehlcVar.g / 2;
        }
        this.h.start();
    }

    @Override // defpackage.ehma
    public final void c() {
    }

    @Override // defpackage.ehma
    public final void e() {
    }

    @Override // defpackage.ehma
    public final void b(pbt pbtVar) {
    }
}
