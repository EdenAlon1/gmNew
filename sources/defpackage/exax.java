package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class exax implements View.OnLayoutChangeListener {
    final /* synthetic */ exbv a;
    private final Rect b = new Rect();
    private final Rect c = new Rect();

    public exax(exbv exbvVar) {
        this.a = exbvVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.b.set(i, i2, i3, i4);
        this.c.set(i5, i6, i7, i8);
        if (this.a.a.s()) {
            if (this.b.width() != this.c.width()) {
                exbv exbvVar = this.a;
                exbvVar.d = true;
                exbvVar.g();
            }
        }
    }
}
