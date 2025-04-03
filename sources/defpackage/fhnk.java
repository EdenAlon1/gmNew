package defpackage;

import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhnk implements fhnt {
    final /* synthetic */ fhnm a;
    private final fhnx b = new fhnx();

    public fhnk(fhnm fhnmVar) {
        this.a = fhnmVar;
    }

    @Override // defpackage.fhnt
    public final fhnx a() {
        return this.b;
    }

    @Override // defpackage.fhnt, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        fhnm fhnmVar = this.a;
        ReentrantLock reentrantLock = fhnmVar.d;
        reentrantLock.lock();
        try {
            if (fhnmVar.b) {
                return;
            }
            if (fhnmVar.c && fhnmVar.a.b > 0) {
                throw new IOException("source is closed");
            }
            fhnmVar.b = true;
            fhnmVar.e.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.fhnt, java.io.Flushable
    public final void flush() {
        fhnm fhnmVar = this.a;
        ReentrantLock reentrantLock = fhnmVar.d;
        reentrantLock.lock();
        try {
            if (fhnmVar.b) {
                throw new IllegalStateException("closed");
            }
            if (fhnmVar.c && fhnmVar.a.b > 0) {
                throw new IOException("source is closed");
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.fhnt
    public final void id(fhmt fhmtVar, long j) {
        fhnm fhnmVar = this.a;
        ReentrantLock reentrantLock = fhnmVar.d;
        reentrantLock.lock();
        try {
            if (fhnmVar.b) {
                throw new IllegalStateException("closed");
            }
            while (j > 0) {
                if (fhnmVar.c) {
                    throw new IOException("source is closed");
                }
                long j2 = 8192 - fhnmVar.a.b;
                if (j2 == 0) {
                    this.b.i(fhnmVar.e);
                } else {
                    long min = Math.min(j2, j);
                    fhnmVar.a.id(fhmtVar, min);
                    j -= min;
                    fhnmVar.e.signalAll();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
