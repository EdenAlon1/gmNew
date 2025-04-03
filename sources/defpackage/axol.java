package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axol {
    public static final elfl a(ffss ffssVar) {
        elfl g = elfl.g(fgfz.a(ffssVar));
        g.getClass();
        return g;
    }

    public static final elfl b(ffji ffjiVar, ffsk ffskVar) {
        ffhe ffheVar = ffhe.a;
        return a(ffra.b(ffskVar, ekxi.a(ffheVar), ffsm.a, new axob(null, ffjiVar)));
    }

    public static final elfl c(ffsk ffskVar, ffhd ffhdVar, ffsm ffsmVar, ffjm ffjmVar) {
        ffskVar.getClass();
        ffsmVar.getClass();
        if (ffsmVar != ffsm.b) {
            return a(ffra.b(ffskVar, ekxi.a(ffhdVar), ffsmVar, new axoc(ffjmVar, null)));
        }
        throw new IllegalArgumentException("CoroutineStart.LAZY is not supported for asyncFuture(). Split into separate async {} and asFuture() calls.");
    }

    public static final Object d(ListenableFuture listenableFuture, ffgu ffguVar) {
        return fgfz.c(listenableFuture, ffguVar);
    }

    public static final ffss e(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        return fgfz.e(listenableFuture);
    }

    public static final ffxx f(elfl elflVar) {
        return new fgcp(new axoa(elflVar, null));
    }

    public static final ffxx g(ffix ffixVar) {
        return new fgcp(new axoe(ffixVar, null));
    }

    public static /* synthetic */ elfl i(ffsk ffskVar, ffjm ffjmVar) {
        ffhe ffheVar = ffhe.a;
        ffsm ffsmVar = ffsm.a;
        ffsmVar.getClass();
        if (ffsmVar != ffsm.b) {
            return a(ffra.b(ffskVar, ekxi.a(ffheVar), ffsmVar, new axod(ffjmVar, null))).h(new emwl() { // from class: axnx
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return null;
                }
            }, erpp.a);
        }
        throw new IllegalArgumentException("CoroutineStart.LAZY is not supported for asyncFuture(). Split into separate async {} and asFuture() calls.");
    }

    public static /* synthetic */ erph j(ffsk ffskVar, ffjm ffjmVar) {
        ffhe ffheVar = ffhe.a;
        ffsm ffsmVar = ffsm.a;
        ffsmVar.getClass();
        return new erph(c(ffskVar, ffheVar, ffsmVar, ffjmVar));
    }

    public static /* synthetic */ ffud k(ffsk ffskVar, ffhd ffhdVar, ffjm ffjmVar, int i) {
        if ((i & 1) != 0) {
            ffhdVar = ffhe.a;
        }
        ffsm ffsmVar = ffsm.a;
        ffskVar.getClass();
        ffhdVar.getClass();
        ffsmVar.getClass();
        ffjmVar.getClass();
        return o(ffskVar, axog.a, ffhdVar, ffsmVar, ffjmVar);
    }

    public static /* synthetic */ ffud l(ffsk ffskVar, ffjm ffjmVar) {
        ffhe ffheVar = ffhe.a;
        ffsm ffsmVar = ffsm.a;
        ffsmVar.getClass();
        return o(ffskVar, axoh.a, ffheVar, ffsmVar, ffjmVar);
    }

    public static /* synthetic */ ffud m(ffsk ffskVar, ffjm ffjmVar) {
        ffhe ffheVar = ffhe.a;
        ffsm ffsmVar = ffsm.a;
        ffskVar.getClass();
        ffsmVar.getClass();
        return o(ffskVar, axoj.a, ffheVar, ffsmVar, ffjmVar);
    }

    public static /* synthetic */ void n(elfl elflVar) {
        Level level = Level.WARNING;
        level.getClass();
        elflVar.k(new axok(level), erpp.a);
    }

    private static final ffud o(ffsk ffskVar, ffjo ffjoVar, ffhd ffhdVar, ffsm ffsmVar, ffjm ffjmVar) {
        final axpk axpkVar = new axpk();
        ffud ffudVar = (ffud) ffjoVar.a(ffskVar, ffhdVar, ffsmVar, ffjmVar);
        ffudVar.hZ(new ffji() { // from class: axny
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                Throwable th = (Throwable) obj;
                if (th != null && !(th instanceof CancellationException)) {
                    final Throwable initCause = axpk.this.initCause(th);
                    initCause.getClass();
                    efbd.a().post(new Runnable() { // from class: axnz
                        @Override // java.lang.Runnable
                        public final void run() {
                            throw initCause;
                        }
                    });
                }
                return ffcu.a;
            }
        });
        return ffudVar;
    }
}
