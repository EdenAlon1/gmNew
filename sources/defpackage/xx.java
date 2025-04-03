package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class xx extends ug {
    final /* synthetic */ xy f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx(xy xyVar, Context context) {
        super(context);
        this.f = xyVar;
    }

    @Override // defpackage.ug
    protected final float a(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // defpackage.ug, defpackage.wn
    protected final void j(View view, wl wlVar) {
        xy xyVar = this.f;
        RecyclerView recyclerView = xyVar.a;
        if (recyclerView == null) {
            return;
        }
        int[] c = xyVar.c(recyclerView.o, view);
        int i = c[0];
        int i2 = c[1];
        int d = d(Math.max(Math.abs(i), Math.abs(i2)));
        if (d > 0) {
            wlVar.b(i, i2, d, this.b);
        }
    }
}
