package defpackage;

import android.view.Surface;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class axn implements bjt {
    final /* synthetic */ ksp a;
    final /* synthetic */ Surface b;

    public axn(ksp kspVar, Surface surface) {
        this.a = kspVar;
        this.b = surface;
    }

    @Override // defpackage.bjt
    public final void a(Throwable th) {
        Objects.toString(th);
        ksw.d(th instanceof axp, "Camera surface session should only fail with request cancellation. Instead failed due to:\n".concat(th.toString()));
        this.a.accept(new asy(1, this.b));
    }

    @Override // defpackage.bjt
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.accept(new asy(0, this.b));
    }
}
