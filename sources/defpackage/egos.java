package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egos extends rim {
    final /* synthetic */ TextView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egos(int i, int i2, TextView textView) {
        super(i, i2);
        this.a = textView;
    }

    @Override // defpackage.rix
    public final /* bridge */ /* synthetic */ void c(Object obj, rjh rjhVar) {
        kzd.g(this.a, (Drawable) obj);
    }

    @Override // defpackage.rix
    public final void f(Drawable drawable) {
        kzd.g(this.a, null);
    }

    @Override // defpackage.rim, defpackage.rix
    public final void g(Drawable drawable) {
        if (drawable != null) {
            kzd.g(this.a, drawable);
        }
    }
}
