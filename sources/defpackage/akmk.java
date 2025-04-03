package defpackage;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akmk implements egzo {
    final /* synthetic */ View a;
    final /* synthetic */ View b;

    public akmk(View view, View view2) {
        this.a = view;
        this.b = view2;
    }

    @Override // defpackage.egzj
    public final void hj(AppBarLayout appBarLayout, int i) {
        float f;
        int h = appBarLayout.h();
        if (h > 0) {
            float f2 = h;
            f = (f2 - Math.abs(i)) / f2;
        } else {
            f = 0.0f;
        }
        float f3 = f + f;
        this.a.setAlpha(Math.max(1.0f - f3, 0.0f));
        this.b.setAlpha(Math.max(f3 - 1.0f, 0.0f));
    }
}
