package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxnf implements View.OnLayoutChangeListener {
    final /* synthetic */ cxnk a;

    public cxnf(cxnk cxnkVar) {
        this.a = cxnkVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.a.s.getVisibility() == 0) {
            cxnk cxnkVar = this.a;
            if (!cxnkVar.j || cxnkVar.A == 4) {
                return;
            }
            cxnkVar.k();
        }
    }
}
