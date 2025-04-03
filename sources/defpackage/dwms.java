package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwms implements View.OnLayoutChangeListener {
    final /* synthetic */ dwna a;

    public dwms(dwna dwnaVar) {
        this.a = dwnaVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.m();
        dwna dwnaVar = this.a;
        dwnaVar.n(dwnaVar.a());
        this.a.removeOnLayoutChangeListener(this);
    }
}
