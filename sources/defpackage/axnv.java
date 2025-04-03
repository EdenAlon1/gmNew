package defpackage;

import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axnv implements erqj {
    private final Consumer a;
    private final Function b;
    private final RuntimeException c;

    public axnv(Consumer consumer, Function function, RuntimeException runtimeException) {
        this.a = consumer;
        this.b = function;
        this.c = runtimeException;
    }

    @Override // defpackage.erqj
    public final void b(Object obj) {
        try {
            this.a.accept(obj);
        } catch (Throwable th) {
            axnw.g(th, this.c, this.b);
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        axnw.g(th, this.c, this.b);
    }
}
