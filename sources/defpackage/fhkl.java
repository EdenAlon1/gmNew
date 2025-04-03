package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhkl implements fhnv {
    public final long a;
    public boolean b;
    public final fhmt c = new fhmt();
    public final fhmt d = new fhmt();
    public boolean e;
    final /* synthetic */ fhkn f;

    public fhkl(fhkn fhknVar, long j, boolean z) {
        this.f = fhknVar;
        this.a = j;
        this.b = z;
    }

    @Override // defpackage.fhnv
    public final fhnx a() {
        return this.f.i;
    }

    @Override // defpackage.fhnv
    public final long b(fhmt fhmtVar, long j) {
        Throwable th;
        Throwable th2;
        boolean z;
        long j2;
        do {
            fhkn fhknVar = this.f;
            synchronized (fhknVar) {
                fhknVar.i.e();
                try {
                    th = null;
                    if (fhknVar.j() == 0 || this.b) {
                        th2 = null;
                    } else {
                        th2 = fhknVar.k;
                        if (th2 == null) {
                            int j3 = fhknVar.j();
                            if (j3 == 0) {
                                throw null;
                            }
                            th2 = new fhku(j3);
                        }
                    }
                    if (this.e) {
                        throw new IOException("stream closed");
                    }
                    fhmt fhmtVar2 = this.d;
                    long j4 = fhmtVar2.b;
                    z = false;
                    if (j4 > 0) {
                        j2 = fhmtVar2.b(fhmtVar, Math.min(8192L, j4));
                        long j5 = fhknVar.c + j2;
                        fhknVar.c = j5;
                        long j6 = j5 - fhknVar.d;
                        if (th2 == null) {
                            fhkf fhkfVar = fhknVar.b;
                            if (j6 >= fhkfVar.q.c() / 2) {
                                fhkfVar.h(fhknVar.a, j6);
                                fhknVar.d = fhknVar.c;
                            }
                        } else {
                            th = th2;
                        }
                    } else {
                        if (this.b || th2 != null) {
                            th = th2;
                        } else {
                            fhknVar.g();
                            z = true;
                        }
                        j2 = -1;
                    }
                } finally {
                    fhknVar.i.b();
                }
            }
        } while (z);
        if (j2 != -1) {
            return j2;
        }
        if (th == null) {
            return -1L;
        }
        throw th;
    }

    public final void c(long j) {
        byte[] bArr = fhhl.a;
        this.f.b.e(j);
    }

    @Override // defpackage.fhnv, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        fhkn fhknVar = this.f;
        synchronized (fhknVar) {
            this.e = true;
            fhmt fhmtVar = this.d;
            j = fhmtVar.b;
            fhmtVar.A();
            fhknVar.notifyAll();
        }
        if (j > 0) {
            c(j);
        }
        this.f.d();
    }
}
