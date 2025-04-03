package defpackage;

import android.graphics.Insets;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kxc extends kxb {
    static final kxh e;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        e = kxh.o(windowInsets);
    }

    public kxc(kxh kxhVar, WindowInsets windowInsets) {
        super(kxhVar, windowInsets);
    }

    @Override // defpackage.kxb, defpackage.kwx, defpackage.kxd
    public kpt a(int i) {
        Insets insets;
        insets = this.a.getInsets(kxg.a(i));
        return kpt.e(insets);
    }

    @Override // defpackage.kxb, defpackage.kwx, defpackage.kxd
    public kpt c(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.a.getInsetsIgnoringVisibility(kxg.a(i));
        return kpt.e(insetsIgnoringVisibility);
    }

    @Override // defpackage.kxb, defpackage.kwx, defpackage.kxd
    public boolean m(int i) {
        boolean isVisible;
        isVisible = this.a.isVisible(kxg.a(i));
        return isVisible;
    }
}
