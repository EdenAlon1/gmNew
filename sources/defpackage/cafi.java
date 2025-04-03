package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cafi {
    private final ffbr a;
    private final Executor b;

    public cafi(ffbr ffbrVar, errl errlVar) {
        this.a = ffbrVar;
        this.b = new ersb(errlVar);
    }

    final caff a() {
        return new caff(this.a, this.b);
    }

    public final cafh b() {
        return a().a();
    }
}
