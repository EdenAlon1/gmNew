package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import com.google.android.apps.messaging.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehmj extends ehma {
    public static final int[] a = {533, 567, 850, 750};
    public static final int[] b = {1267, 1000, 333, 0};
    private static final Property i = new ehmi(Float.class);
    public final Interpolator[] c;
    public final ehlc d;
    public int e;
    public boolean f;
    public float g;
    pbt h;
    private ObjectAnimator l;
    private ObjectAnimator m;

    public ehmj(Context context, ehmk ehmkVar) {
        super(2);
        this.e = 0;
        this.h = null;
        this.d = ehmkVar;
        this.c = new Interpolator[]{pbz.a(context, R.anim.linear_indeterminate_line1_head_interpolator), pbz.a(context, R.anim.linear_indeterminate_line1_tail_interpolator), pbz.a(context, R.anim.linear_indeterminate_line2_head_interpolator), pbz.a(context, R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // defpackage.ehma
    public final void a() {
        ObjectAnimator objectAnimator = this.l;
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
        ObjectAnimator objectAnimator = this.m;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        a();
        if (this.j.isVisible()) {
            this.m.setFloatValues(this.g, 1.0f);
            this.m.setDuration((long) ((1.0f - this.g) * 1800.0f));
            this.m.start();
        }
    }

    @Override // defpackage.ehma
    public final void d() {
        if (this.l == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<ehmj, Float>) i, 0.0f, 1.0f);
            this.l = ofFloat;
            ofFloat.setDuration((long) (this.d.l * 1800.0f));
            this.l.setInterpolator(null);
            this.l.setRepeatCount(-1);
            this.l.addListener(new ehmg(this));
        }
        if (this.m == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<ehmj, Float>) i, 1.0f);
            this.m = ofFloat2;
            ofFloat2.setDuration((long) (this.d.l * 1800.0f));
            this.m.setInterpolator(null);
            this.m.addListener(new ehmh(this));
        }
        this.e = 0;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((ehlx) it.next()).c = this.d.c[0];
        }
        this.l.start();
    }

    @Override // defpackage.ehma
    public final void e() {
        this.h = null;
    }
}
