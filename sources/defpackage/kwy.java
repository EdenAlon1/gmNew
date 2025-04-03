package defpackage;

import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
class kwy extends kwx {
    private kpt d;

    public kwy(kxh kxhVar, WindowInsets windowInsets) {
        super(kxhVar, windowInsets);
        this.d = null;
    }

    @Override // defpackage.kxd
    public final kpt o() {
        if (this.d == null) {
            WindowInsets windowInsets = this.a;
            this.d = kpt.d(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.d;
    }

    @Override // defpackage.kxd
    public kxh p() {
        return kxh.o(this.a.consumeStableInsets());
    }

    @Override // defpackage.kxd
    public kxh q() {
        return kxh.o(this.a.consumeSystemWindowInsets());
    }

    @Override // defpackage.kxd
    public void r(kpt kptVar) {
        this.d = kptVar;
    }

    @Override // defpackage.kxd
    public boolean s() {
        return this.a.isConsumed();
    }
}
