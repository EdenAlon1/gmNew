package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kvc implements View.OnApplyWindowInsetsListener {
    kxh a = null;
    final /* synthetic */ View b;
    final /* synthetic */ kud c;

    public kvc(View view, kud kudVar) {
        this.b = view;
        this.c = kudVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        kxh p = kxh.p(windowInsets, view);
        if (Build.VERSION.SDK_INT < 30) {
            kvd.g(windowInsets, this.b);
            if (p.equals(this.a)) {
                return this.c.ey(view, p).e();
            }
        }
        this.a = p;
        kxh ey = this.c.ey(view, p);
        if (Build.VERSION.SDK_INT >= 30) {
            return ey.e();
        }
        int[] iArr = kvo.a;
        kvb.c(view);
        return ey.e();
    }
}
