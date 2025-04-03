package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import java.util.concurrent.Callable;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuap {
    public final errl c;
    private final errm e;
    public static final cfup a = cfvl.f(cfvl.b, "rcs_service_retry_delay_millis", 500);
    private static final cfup d = cfvl.c(cfvl.b, "rcs_service_retry_multiplier", 2.0d);
    public static final cfup b = cfvl.e(cfvl.b, "rcs_service_retry_total_attempts_num", 4);

    public cuap(errl errlVar, errm errmVar) {
        this.c = errlVar;
        this.e = errmVar;
    }

    public final elfl a(final Callable callable) {
        Logger logger = eogi.a;
        eogf eogfVar = new eogf();
        eogfVar.b(this.e);
        return elfl.g(eogfVar.a(eldl.b(new emyl() { // from class: cuam
            @Override // defpackage.emyl
            public final Object get() {
                return elfo.g(callable, cuap.this.c);
            }
        }), eofx.d(Duration.ofMillis(((Long) a.e()).longValue()), ((Double) d.e()).doubleValue(), ((Integer) b.e()).intValue()), new emxg() { // from class: cuan
            @Override // defpackage.emxg
            public final boolean a(Object obj) {
                cfup cfupVar = cuap.a;
                return ((Exception) obj) instanceof ehxg;
            }
        })).f(eofq.class, new eroh() { // from class: cuao
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                cfup cfupVar = cuap.a;
                return elfo.d(((eofq) obj).getCause());
            }
        }, this.e);
    }
}
