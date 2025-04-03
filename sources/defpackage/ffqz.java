package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class ffqz {
    public static final Object a(ffhd ffhdVar, ffjm ffjmVar) {
        ffti fftiVar;
        ffhd b;
        Thread currentThread = Thread.currentThread();
        ffgw ffgwVar = (ffgw) ffhdVar.get(ffgw.k);
        if (ffgwVar == null) {
            ThreadLocal threadLocal = ffvi.a;
            fftiVar = ffvi.a();
            b = ffsa.b(fftv.a, ffhdVar.plus(fftiVar));
        } else {
            if (ffgwVar instanceof ffti) {
            }
            ThreadLocal threadLocal2 = ffvi.a;
            fftiVar = (ffti) ffvi.a.get();
            b = ffsa.b(fftv.a, ffhdVar);
        }
        ffqw ffqwVar = new ffqw(b, currentThread, fftiVar);
        ffsm.a.a(ffjmVar, ffqwVar, ffqwVar);
        ffti fftiVar2 = ffqwVar.b;
        if (fftiVar2 != null) {
            fftiVar2.p(false);
        }
        while (!Thread.interrupted()) {
            try {
                ffti fftiVar3 = ffqwVar.b;
                long m = fftiVar3 != null ? fftiVar3.m() : Long.MAX_VALUE;
                if (ffqwVar.y()) {
                    ffti fftiVar4 = ffqwVar.b;
                    if (fftiVar4 != null) {
                        fftiVar4.n(false);
                    }
                    Object b2 = ffur.b(ffqwVar.E());
                    ffrt ffrtVar = b2 instanceof ffrt ? (ffrt) b2 : null;
                    if (ffrtVar == null) {
                        return b2;
                    }
                    throw ffrtVar.b;
                }
                LockSupport.parkNanos(ffqwVar, m);
            } catch (Throwable th) {
                ffti fftiVar5 = ffqwVar.b;
                if (fftiVar5 != null) {
                    fftiVar5.n(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        ffqwVar.P(interruptedException);
        throw interruptedException;
    }
}
