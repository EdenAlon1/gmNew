package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhmo implements fhnt {
    final /* synthetic */ fhmq a;
    final /* synthetic */ fhnt b;

    public fhmo(fhmq fhmqVar, fhnt fhntVar) {
        this.a = fhmqVar;
        this.b = fhntVar;
    }

    @Override // defpackage.fhnt
    public final /* synthetic */ fhnx a() {
        return this.a;
    }

    @Override // defpackage.fhnt, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        fhmq fhmqVar = this.a;
        fhmqVar.e();
        try {
            this.b.close();
            if (fhmqVar.f()) {
                throw fhmqVar.d(null);
            }
        } catch (IOException e) {
            if (!fhmqVar.f()) {
                throw e;
            }
            throw fhmqVar.d(e);
        } finally {
            fhmqVar.f();
        }
    }

    @Override // defpackage.fhnt, java.io.Flushable
    public final void flush() {
        fhmq fhmqVar = this.a;
        fhmqVar.e();
        try {
            this.b.flush();
            if (fhmqVar.f()) {
                throw fhmqVar.d(null);
            }
        } catch (IOException e) {
            if (!fhmqVar.f()) {
                throw e;
            }
            throw fhmqVar.d(e);
        } finally {
            fhmqVar.f();
        }
    }

    @Override // defpackage.fhnt
    public final void id(fhmt fhmtVar, long j) {
        fhmm.b(fhmtVar.b, 0L, j);
        while (true) {
            long j2 = 0;
            if (j <= 0) {
                return;
            }
            fhnq fhnqVar = fhmtVar.a;
            fhnqVar.getClass();
            while (true) {
                if (j2 >= 65536) {
                    break;
                }
                j2 += fhnqVar.c - fhnqVar.b;
                if (j2 >= j) {
                    j2 = j;
                    break;
                } else {
                    fhnqVar = fhnqVar.f;
                    fhnqVar.getClass();
                }
            }
            fhmq fhmqVar = this.a;
            fhnt fhntVar = this.b;
            fhmqVar.e();
            try {
                try {
                    fhntVar.id(fhmtVar, j2);
                    if (fhmqVar.f()) {
                        throw fhmqVar.d(null);
                    }
                    j -= j2;
                } catch (IOException e) {
                    if (!fhmqVar.f()) {
                        throw e;
                    }
                    throw fhmqVar.d(e);
                }
            } catch (Throwable th) {
                fhmqVar.f();
                throw th;
            }
        }
    }

    public final String toString() {
        return "AsyncTimeout.sink(" + this.b + ")";
    }
}
