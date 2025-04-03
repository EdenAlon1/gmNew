package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class uz extends ug {
    final /* synthetic */ va f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uz(va vaVar, Context context) {
        super(context);
        this.f = vaVar;
    }

    @Override // defpackage.ug
    protected final float a(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // defpackage.ug
    protected final int e(int i) {
        return Math.min(100, super.e(i));
    }

    @Override // defpackage.ug, defpackage.wn
    protected final void j(View view, wl wlVar) {
        va vaVar = this.f;
        int[] c = vaVar.c(vaVar.a.o, view);
        int i = c[0];
        int i2 = c[1];
        int d = d(Math.max(Math.abs(i), Math.abs(i2)));
        if (d > 0) {
            wlVar.b(i, i2, d, this.b);
        }
    }
}
