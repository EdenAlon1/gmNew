package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class exbp extends Animation {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ float c;
    final /* synthetic */ float d;
    final /* synthetic */ exbu e;

    public exbp(exbu exbuVar, int i, int i2, float f, float f2) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = exbuVar;
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        int i = this.a;
        exbu.m(this.e.f, this.b + ((int) (f * (i - r0))));
        if (this.e.q()) {
            this.e.f.setX(this.c);
            this.e.g.setX(0.0f);
            this.e.h.setX(0.0f);
            return;
        }
        exbu exbuVar = this.e;
        float f2 = this.d;
        exbuVar.f.setX(f2 - r2.getWidth());
        this.e.g.setX(r2.f.getWidth() - this.a);
        this.e.h.setX(r2.f.getWidth() - this.b);
    }
}
