package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jk extends kwf {
    final /* synthetic */ jz a;

    public jk(jz jzVar) {
        this.a = jzVar;
    }

    @Override // defpackage.kwf, defpackage.kwe
    public final void a() {
        this.a.s.setAlpha(1.0f);
        this.a.v.d(null);
        this.a.v = null;
    }

    @Override // defpackage.kwf, defpackage.kwe
    public final void b() {
        this.a.s.setVisibility(0);
        if (this.a.s.getParent() instanceof View) {
            View view = (View) this.a.s.getParent();
            int[] iArr = kvo.a;
            kvb.c(view);
        }
    }
}
