package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Property;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehln extends ehma {
    public final TimeInterpolator c;
    public final ehlc d;
    public int e;
    public float f;
    public float g;
    pbt h;
    private ObjectAnimator n;
    private ObjectAnimator o;
    private static final TimeInterpolator i = egyv.b;
    public static final int[] a = {0, 1500, 3000, 4500};
    public static final float[] b = {0.1f, 0.87f};
    private static final Property l = new ehll(Float.class);
    private static final Property m = new ehlm(Float.class);

    public ehln(Context context, ehlo ehloVar) {
        super(1);
        this.e = 0;
        this.h = null;
        this.d = ehloVar;
        this.c = ehjz.a(context, R.attr.motionEasingStandardInterpolator, i);
    }

    @Override // defpackage.ehma
    public final void a() {
        ObjectAnimator objectAnimator = this.n;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.ehma
    public final void b(pbt pbtVar) {
        this.h = pbtVar;
    }

    @Override // defpackage.ehma
    public final void c() {
        ObjectAnimator objectAnimator = this.o;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.j.isVisible()) {
            this.o.start();
        } else {
            a();
        }
    }

    @Override // defpackage.ehma
    public final void d() {
        if (this.n == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<ehln, Float>) l, 0.0f, 1.0f);
            this.n = ofFloat;
            ofFloat.setDuration((long) (this.d.l * 6000.0f));
            this.n.setInterpolator(null);
            this.n.setRepeatCount(-1);
            this.n.addListener(new ehlj(this));
        }
        if (this.o == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<ehln, Float>) m, 0.0f, 1.0f);
            this.o = ofFloat2;
            ofFloat2.setDuration((long) (this.d.l * 500.0f));
            this.o.addListener(new ehlk(this));
        }
        this.e = 0;
        ((ehlx) this.k.get(0)).c = this.d.c[0];
        this.g = 0.0f;
        this.n.start();
    }

    @Override // defpackage.ehma
    public final void e() {
        this.h = null;
    }
}
