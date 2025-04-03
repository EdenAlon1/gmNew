package defpackage;

import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class envm extends enve {
    public envm(Logger logger) {
        super(logger);
    }

    @Override // defpackage.ento
    public final void b(entl entlVar) {
        e(new envl(entlVar, Cenum.f()), entlVar.S());
    }

    @Override // defpackage.ento
    public final void g(RuntimeException runtimeException, entl entlVar) {
        e(new envl(runtimeException, entlVar, Cenum.f()), entlVar.S());
    }
}
