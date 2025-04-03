package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vvb implements View.OnLayoutChangeListener {
    final /* synthetic */ View a;
    final /* synthetic */ vvn b;

    public vvb(vvn vvnVar, View view) {
        this.a = view;
        this.b = vvnVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (!this.b.cA.g() || view.getWidth() == 0) {
            return;
        }
        this.a.removeOnLayoutChangeListener(this);
        this.b.aK();
    }
}
