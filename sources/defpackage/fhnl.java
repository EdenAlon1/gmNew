package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhnl implements fhnv {
    final /* synthetic */ fhnm a;
    private final fhnx b = new fhnx();

    public fhnl(fhnm fhnmVar) {
        this.a = fhnmVar;
    }

    @Override // defpackage.fhnv
    public final fhnx a() {
        return this.b;
    }

    @Override // defpackage.fhnv
    public final long b(fhmt fhmtVar, long j) {
        fhnm fhnmVar = this.a;
        ReentrantLock reentrantLock = fhnmVar.d;
        reentrantLock.lock();
        try {
            if (fhnmVar.c) {
                throw new IllegalStateException("closed");
            }
            while (true) {
                fhmt fhmtVar2 = fhnmVar.a;
                if (fhmtVar2.b != 0) {
                    long b = fhmtVar2.b(fhmtVar, 8192L);
                    fhnmVar.e.signalAll();
                    return b;
                }
                if (fhnmVar.b) {
                    reentrantLock.unlock();
                    return -1L;
                }
                this.b.i(fhnmVar.e);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.fhnv, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        fhnm fhnmVar = this.a;
        ReentrantLock reentrantLock = fhnmVar.d;
        reentrantLock.lock();
        try {
            fhnmVar.c = true;
            fhnmVar.e.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }
}
