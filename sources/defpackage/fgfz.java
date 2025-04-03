package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgfz {
    public static final ListenableFuture a(final ffss ffssVar) {
        final fgfs fgfsVar = new fgfs(ffssVar);
        ffssVar.hZ(new ffji() { // from class: fgfu
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                fgfs fgfsVar2 = fgfs.this;
                Throwable th = (Throwable) obj;
                if (th == null) {
                    fgfsVar2.a(ffssVar.d());
                } else {
                    fgfsVar2.c(th);
                }
                return ffcu.a;
            }
        });
        return fgfsVar;
    }

    public static final ListenableFuture b(ffsk ffskVar, ffhd ffhdVar, ffsm ffsmVar, ffjm ffjmVar) {
        if (ffsmVar.b()) {
            Objects.toString(ffsmVar);
            throw new IllegalArgumentException(String.valueOf(ffsmVar).concat(" start is not supported"));
        }
        fgft fgftVar = new fgft(ffsa.b(ffskVar, ffhdVar));
        ffsmVar.a(ffjmVar, fgftVar, fgftVar);
        return fgftVar.b;
    }

    public static final Object c(ListenableFuture listenableFuture, ffgu ffguVar) {
        try {
            if (listenableFuture.isDone()) {
                return ersn.a(listenableFuture);
            }
            ffrh ffrhVar = new ffrh(ffhi.c(ffguVar), 1);
            ffrhVar.B();
            listenableFuture.b(new fgga(listenableFuture, ffrhVar), erpp.a);
            ffrhVar.d(new fgfy(listenableFuture));
            Object m = ffrhVar.m();
            if (m == ffhh.a) {
                ffguVar.getClass();
            }
            return m;
        } catch (ExecutionException e) {
            throw d(e);
        }
    }

    public static final Throwable d(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        cause.getClass();
        return cause;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ffss e(final ListenableFuture listenableFuture) {
        Throwable i;
        if ((listenableFuture instanceof erso) && (i = ((erso) listenableFuture).i()) != null) {
            ffrq ffrqVar = new ffrq();
            ffrqVar.a(i);
            return ffrqVar;
        }
        if (!listenableFuture.isDone()) {
            ffrq ffrqVar2 = new ffrq();
            erqt.r(listenableFuture, new fgfw(ffrqVar2), erpp.a);
            ffrqVar2.hZ(new ffji() { // from class: fgfv
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ListenableFuture.this.cancel(false);
                    return ffcu.a;
                }
            });
            return new fgfx(ffrqVar2);
        }
        try {
            return ffrr.a(ersn.a(listenableFuture));
        } catch (CancellationException e) {
            ffrq ffrqVar3 = new ffrq();
            ffrqVar3.t(e);
            return ffrqVar3;
        } catch (ExecutionException e2) {
            ffrq ffrqVar4 = new ffrq();
            ffrqVar4.a(d(e2));
            return ffrqVar4;
        }
    }
}
