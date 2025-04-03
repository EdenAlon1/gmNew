package defpackage;

import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kwt extends kww {
    final WindowInsets.Builder a;

    public kwt() {
        this.a = new WindowInsets.Builder();
    }

    @Override // defpackage.kww
    public kxh a() {
        WindowInsets build;
        h();
        build = this.a.build();
        kxh o = kxh.o(build);
        o.r(this.b);
        return o;
    }

    @Override // defpackage.kww
    public void b(kpt kptVar) {
        this.a.setStableInsets(kptVar.a());
    }

    @Override // defpackage.kww
    public void c(kpt kptVar) {
        this.a.setSystemWindowInsets(kptVar.a());
    }

    @Override // defpackage.kww
    public void d(kpt kptVar) {
        this.a.setMandatorySystemGestureInsets(kptVar.a());
    }

    @Override // defpackage.kww
    public void e(kpt kptVar) {
        this.a.setSystemGestureInsets(kptVar.a());
    }

    @Override // defpackage.kww
    public void f(kpt kptVar) {
        this.a.setTappableElementInsets(kptVar.a());
    }

    public kwt(kxh kxhVar) {
        super(kxhVar);
        WindowInsets.Builder builder;
        WindowInsets e = kxhVar.e();
        if (e != null) {
            builder = new WindowInsets.Builder(e);
        } else {
            builder = new WindowInsets.Builder();
        }
        this.a = builder;
    }
}
