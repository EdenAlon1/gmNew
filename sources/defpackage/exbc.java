package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class exbc extends Animation {
    final /* synthetic */ float a;
    final /* synthetic */ float b;
    final /* synthetic */ int c;
    final /* synthetic */ exbu d;

    public exbc(exbu exbuVar, float f, float f2, int i) {
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = exbuVar;
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        float width = this.d.q() ? 0.0f : this.d.f.getWidth() - this.c;
        float f2 = this.a;
        this.d.i.setX(f2 + (f * (this.b - f2)) + width);
    }
}
