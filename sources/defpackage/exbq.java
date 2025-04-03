package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class exbq extends Animation {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ float c;
    final /* synthetic */ exbu d;

    public exbq(exbu exbuVar, int i, int i2, float f) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = exbuVar;
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        int i = this.a;
        exbu.j(this.d.f, this.b + ((int) (f * (i - r0))));
        exbu exbuVar = this.d;
        if (exbuVar.M) {
            float f2 = this.c;
            exbuVar.f.setY(f2 - r2.getHeight());
            this.d.f();
        }
    }
}
