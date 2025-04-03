package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddno extends riv {
    final /* synthetic */ ehdh a;
    final /* synthetic */ ddnp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddno(ddnp ddnpVar, int i, int i2, ehdh ehdhVar) {
        super(i, i2);
        this.a = ehdhVar;
        this.b = ddnpVar;
    }

    @Override // defpackage.rix
    public final /* bridge */ /* synthetic */ void c(Object obj, rjh rjhVar) {
        this.a.l((Drawable) obj);
        ehdh ehdhVar = this.a;
        ehdhVar.setBounds(0, 0, ehdhVar.getIntrinsicWidth(), ehdhVar.getIntrinsicHeight());
        View view = this.b.a;
        if (view != null) {
            view.requestLayout();
        }
    }
}
