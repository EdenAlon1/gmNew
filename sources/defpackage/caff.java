package defpackage;

import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class caff {
    private final ffbr a;
    private final Executor b;
    private Optional c = Optional.empty();

    public caff(ffbr ffbrVar, Executor executor) {
        this.a = ffbrVar;
        this.b = executor;
    }

    final cafh a() {
        return new cafh(this.a, this.c, this.b);
    }

    final void b(eote eoteVar) {
        this.c = Optional.of(eoteVar);
    }
}
