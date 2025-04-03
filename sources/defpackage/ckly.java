package defpackage;

import com.google.android.ims.rcs.engine.RcsEngineLifecycleServiceResult;
import com.google.android.rcs.client.lifecycle.RcsEngineLifecycleServiceV2;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;
import java.util.function.BiFunction;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckly {
    public static final cskc a = cskc.g("BugleRcs", "RcsEngineLifecycleManagerV2");
    public final cuap b;
    public final errl c;
    public final ffbr d;
    private final ffbr e;
    private final BiFunction f;

    public ckly(ffbr ffbrVar, BiFunction biFunction, ffbr ffbrVar2, cuap cuapVar, errl errlVar) {
        this.b = cuapVar;
        this.c = errlVar;
        this.e = ffbrVar;
        this.f = biFunction;
        this.d = ffbrVar2;
    }

    public final elfl a(final cklx cklxVar, final boolean z) {
        return ((ctzw) this.e.b()).a(this.f, RcsEngineLifecycleServiceV2.class).i(new eroh() { // from class: cklp
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final cklx cklxVar2 = cklxVar;
                ckly cklyVar = ckly.this;
                final RcsEngineLifecycleServiceV2 rcsEngineLifecycleServiceV2 = (RcsEngineLifecycleServiceV2) obj;
                final elfl a2 = z ? cklyVar.b.a(new Callable() { // from class: cklr
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return cklx.this.a(rcsEngineLifecycleServiceV2);
                    }
                }) : elfo.g(new Callable() { // from class: ckls
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return cklx.this.a(rcsEngineLifecycleServiceV2);
                    }
                }, cklyVar.c);
                return elfo.k(a2).b(new erog() { // from class: cklt
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        RcsEngineLifecycleServiceV2.this.disconnect();
                        return a2;
                    }
                }, cklyVar.c);
            }
        }, this.c).e(ehxg.class, new emwl() { // from class: cklv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ((akzt) ckly.this.d.b()).c("Bugle.Rcs.WaitForServiceState.Throw.JibeServiceException.Counts");
                ckly.a.s("JibeServiceException was raised while calling RcsEngineLifecycleServiceV2", (ehxg) obj);
                return new RcsEngineLifecycleServiceResult(1);
            }
        }, this.c).e(TimeoutException.class, new emwl() { // from class: cklw
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ckly.a.o("TimeoutException was raised while waiting to connect to RcsEngineLifecycleServiceV2", (TimeoutException) obj);
                return new RcsEngineLifecycleServiceResult(14);
            }
        }, this.c).e(IllegalArgumentException.class, new emwl() { // from class: ckll
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ckly.a.o("IllegalArgumentException was raised while waiting to connect to RcsEngineLifecycleServiceV2", (IllegalArgumentException) obj);
                return new RcsEngineLifecycleServiceResult(1);
            }
        }, this.c).e(IllegalStateException.class, new emwl() { // from class: cklm
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ckly.a.o("IllegalStateException was raised while waiting to connect to RcsEngineLifecycleServiceV2", (IllegalStateException) obj);
                return new RcsEngineLifecycleServiceResult(1);
            }
        }, this.c).e(SecurityException.class, new emwl() { // from class: ckln
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ckly.a.o("SecurityException was raised while waiting to connect to RcsEngineLifecycleServiceV2", (SecurityException) obj);
                return new RcsEngineLifecycleServiceResult(1);
            }
        }, this.c).e(cual.class, new emwl() { // from class: cklo
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ckly.a.o("RcsServiceConnectionException was raised while waiting to connect to RcsEngineLifecycleServiceV2", (cual) obj);
                return new RcsEngineLifecycleServiceResult(1);
            }
        }, this.c);
    }

    public final elfl b(ezkb ezkbVar, int i) {
        ezjy ezjyVar = (ezjy) ezjz.a.createBuilder();
        ezjyVar.copyOnWrite();
        ezjz ezjzVar = (ezjz) ezjyVar.instance;
        ezjzVar.b |= 1;
        ezjzVar.c = i;
        ezjyVar.copyOnWrite();
        ezjz ezjzVar2 = (ezjz) ezjyVar.instance;
        ezjzVar2.d = ezkbVar.d;
        ezjzVar2.b |= 2;
        final ezjz ezjzVar3 = (ezjz) ezjyVar.build();
        return a(new cklx() { // from class: cklq
            @Override // defpackage.cklx
            public final RcsEngineLifecycleServiceResult a(RcsEngineLifecycleServiceV2 rcsEngineLifecycleServiceV2) {
                return rcsEngineLifecycleServiceV2.initializeAndStartRcsTransport(new dkop(ezjz.this));
            }
        }, true);
    }

    public final elfl c(ezkb ezkbVar, List list) {
        ezkc ezkcVar = (ezkc) ezkd.a.createBuilder();
        ezkcVar.copyOnWrite();
        ezkd ezkdVar = (ezkd) ezkcVar.instance;
        eygi eygiVar = ezkdVar.c;
        if (!eygiVar.c()) {
            ezkdVar.c = eyfy.mutableCopy(eygiVar);
        }
        eydl.addAll(list, ezkdVar.c);
        ezkcVar.copyOnWrite();
        ezkd ezkdVar2 = (ezkd) ezkcVar.instance;
        ezkdVar2.d = ezkbVar.d;
        ezkdVar2.b |= 1;
        final ezkd ezkdVar3 = (ezkd) ezkcVar.build();
        return a(new cklx() { // from class: cklu
            @Override // defpackage.cklx
            public final RcsEngineLifecycleServiceResult a(RcsEngineLifecycleServiceV2 rcsEngineLifecycleServiceV2) {
                return rcsEngineLifecycleServiceV2.stopAllRcsTransportsExcept(new dkoq(ezkd.this));
            }
        }, false);
    }
}
