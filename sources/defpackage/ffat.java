package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffat {
    public static final fdxi a;
    private static final Logger b = Logger.getLogger(ffat.class.getName());

    static {
        if (!emxe.c(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"))) {
            Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        }
        a = new fdxi("internal-stub-type", null);
    }

    private ffat() {
    }

    public static ListenableFuture a(fdxo fdxoVar, Object obj) {
        ffao ffaoVar = new ffao(fdxoVar);
        b(fdxoVar, obj, new ffas(ffaoVar));
        return ffaoVar;
    }

    public static void b(fdxo fdxoVar, Object obj, ffap ffapVar) {
        fdxoVar.a(ffapVar, new febo());
        ffapVar.e();
        try {
            fdxoVar.f(obj);
            fdxoVar.d();
        } catch (Error | RuntimeException e) {
            throw c(fdxoVar, e);
        }
    }

    private static RuntimeException c(fdxo fdxoVar, Throwable th) {
        try {
            fdxoVar.c(null, th);
        } catch (Error | RuntimeException e) {
            b.logp(Level.SEVERE, "io.grpc.stub.ClientCalls", "cancelThrow", "RuntimeException encountered while closing call", e);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        throw new AssertionError(th);
    }
}
