package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcrq extends Animation {
    public float a = 1.0f;
    public float b = 1.0f;
    final /* synthetic */ dcrr c;

    public dcrq(dcrr dcrrVar) {
        this.c = dcrrVar;
        setFillAfter(true);
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        float f2 = this.a;
        this.c.m = (int) (f2 + ((this.b - f2) * f));
    }
}
