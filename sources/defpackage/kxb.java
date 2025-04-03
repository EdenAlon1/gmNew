package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
class kxb extends kxa {
    static final kxh d;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        d = kxh.o(windowInsets);
    }

    public kxb(kxh kxhVar, WindowInsets windowInsets) {
        super(kxhVar, windowInsets);
    }

    @Override // defpackage.kwx, defpackage.kxd
    public kpt a(int i) {
        Insets insets;
        insets = this.a.getInsets(kxf.a(i));
        return kpt.e(insets);
    }

    @Override // defpackage.kwx, defpackage.kxd
    public kpt c(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.a.getInsetsIgnoringVisibility(kxf.a(i));
        return kpt.e(insetsIgnoringVisibility);
    }

    @Override // defpackage.kwx, defpackage.kxd
    public boolean m(int i) {
        boolean isVisible;
        isVisible = this.a.isVisible(kxf.a(i));
        return isVisible;
    }

    @Override // defpackage.kwx, defpackage.kxd
    public final void f(View view) {
    }
}
