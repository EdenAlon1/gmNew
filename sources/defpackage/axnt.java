package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axnt implements erqj {
    private final Function a;
    private final RuntimeException b;

    public axnt(Function function, RuntimeException runtimeException) {
        this.a = function;
        this.b = runtimeException;
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        axnw.g(th, this.b, this.a);
    }

    @Override // defpackage.erqj
    public final void b(Object obj) {
    }
}
