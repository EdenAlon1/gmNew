package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fedt extends fdym {
    private static final Logger b = Logger.getLogger(fedt.class.getName());
    static final ThreadLocal a = new ThreadLocal();

    @Override // defpackage.fdym
    public final fdyn a() {
        fdyn fdynVar = (fdyn) a.get();
        return fdynVar == null ? fdyn.d : fdynVar;
    }

    @Override // defpackage.fdym
    public final fdyn b(fdyn fdynVar) {
        fdyn a2 = a();
        a.set(fdynVar);
        return a2;
    }

    @Override // defpackage.fdym
    public final void c(fdyn fdynVar, fdyn fdynVar2) {
        if (a() != fdynVar) {
            b.logp(Level.SEVERE, "io.grpc.ThreadLocalContextStorage", "detach", "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (fdynVar2 != fdyn.d) {
            a.set(fdynVar2);
        } else {
            a.set(null);
        }
    }
}
