package defpackage;

import com.google.android.rcs.client.lifecycle.RcsEngineLifecycleService;
import com.google.android.rcs.client.lifecycle.RcsEngineLifecycleServiceResult;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;
import java.util.function.BiFunction;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cklj {
    public static final cskc a = cskc.g("BugleRcs", "RcsEngineLifecycleManager");
    public final errl b;
    public final ffbr c;
    public final cuap d;
    private final ffbr e;
    private final BiFunction f;

    public cklj(ffbr ffbrVar, BiFunction biFunction, ffbr ffbrVar2, cuap cuapVar, errl errlVar) {
        this.b = errlVar;
        this.e = ffbrVar;
        this.f = biFunction;
        this.c = ffbrVar2;
        this.d = cuapVar;
    }

    public final elfl a(final boolean z, final String str) {
        return ((ctzw) this.e.b()).a(this.f, RcsEngineLifecycleService.class).i(new eroh() { // from class: ckld
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                cklj ckljVar = cklj.this;
                final RcsEngineLifecycleService rcsEngineLifecycleService = (RcsEngineLifecycleService) obj;
                final String str2 = str;
                final elfl a2 = z ? ckljVar.d.a(new Callable() { // from class: ckla
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return RcsEngineLifecycleService.this.triggerStartRcsStack(str2);
                    }
                }) : ckljVar.d.a(new Callable() { // from class: cklb
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return RcsEngineLifecycleService.this.triggerStopRcsStack(str2);
                    }
                });
                return elfo.k(a2).b(new erog() { // from class: cklc
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        RcsEngineLifecycleService.this.disconnect();
                        return a2;
                    }
                }, ckljVar.b);
            }
        }, this.b).e(ehxg.class, new emwl() { // from class: ckle
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ((akzt) cklj.this.c.b()).c("Bugle.Rcs.WaitForServiceState.Throw.JibeServiceException.Counts");
                cklj.a.s("JibeServiceException was raised while calling RcsEngineLifecycleService", (ehxg) obj);
                return new RcsEngineLifecycleServiceResult(1);
            }
        }, this.b).e(TimeoutException.class, new emwl() { // from class: cklf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cklj.a.o("TimeoutException was raised while waiting to connect to RcsEngineLifecycleService", (TimeoutException) obj);
                return new RcsEngineLifecycleServiceResult(14);
            }
        }, this.b).e(IllegalArgumentException.class, new emwl() { // from class: cklg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cklj.a.o("IllegalArgumentException was raised while waiting to connect to RcsEngineLifecycleService", (IllegalArgumentException) obj);
                return new RcsEngineLifecycleServiceResult(1);
            }
        }, this.b).e(SecurityException.class, new emwl() { // from class: cklh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cklj.a.o("SecurityException was raised while waiting to connect to RcsEngineLifecycleService", (SecurityException) obj);
                return new RcsEngineLifecycleServiceResult(1);
            }
        }, this.b).e(cual.class, new emwl() { // from class: ckli
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cklj.a.o("RcsServiceConnectionException was raised while waiting to connect to RcsEngineLifecycleService", (cual) obj);
                return new RcsEngineLifecycleServiceResult(1);
            }
        }, this.b);
    }
}
