package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhkk implements fhnt {
    public final boolean a;
    public boolean b;
    final /* synthetic */ fhkn c;
    private final fhmt d = new fhmt();

    public fhkk(fhkn fhknVar, boolean z) {
        this.c = fhknVar;
        this.a = z;
    }

    /* JADX WARN: Finally extract failed */
    private final void c(boolean z) {
        long min;
        boolean z2;
        fhkn fhknVar = this.c;
        synchronized (fhknVar) {
            fhknVar.j.e();
            while (fhknVar.e >= fhknVar.f && !this.a && !this.b && fhknVar.j() == 0) {
                try {
                    fhknVar.g();
                } catch (Throwable th) {
                    fhknVar.j.b();
                    throw th;
                }
            }
            fhknVar.j.b();
            fhknVar.e();
            min = Math.min(fhknVar.f - fhknVar.e, this.d.b);
            fhknVar.e += min;
            boolean z3 = false;
            if (z && min == this.d.b) {
                z3 = true;
            }
            z2 = z3;
        }
        this.c.j.e();
        try {
            fhkn fhknVar2 = this.c;
            fhknVar2.b.f(fhknVar2.a, z2, this.d, min);
        } finally {
            this.c.j.b();
        }
    }

    @Override // defpackage.fhnt
    public final fhnx a() {
        return this.c.j;
    }

    @Override // defpackage.fhnt, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        byte[] bArr = fhhl.a;
        fhkn fhknVar = this.c;
        synchronized (fhknVar) {
            if (this.b) {
                return;
            }
            int j = fhknVar.j();
            fhkn fhknVar2 = this.c;
            if (!fhknVar2.h.a) {
                if (this.d.b > 0) {
                    while (this.d.b > 0) {
                        c(true);
                    }
                } else if (j == 0) {
                    fhknVar2.b.f(fhknVar2.a, true, null, 0L);
                }
            }
            synchronized (this.c) {
                this.b = true;
            }
            this.c.b.d();
            this.c.d();
        }
    }

    @Override // defpackage.fhnt, java.io.Flushable
    public final void flush() {
        byte[] bArr = fhhl.a;
        fhkn fhknVar = this.c;
        synchronized (fhknVar) {
            fhknVar.e();
        }
        while (this.d.b > 0) {
            c(false);
            this.c.b.d();
        }
    }

    @Override // defpackage.fhnt
    public final void id(fhmt fhmtVar, long j) {
        byte[] bArr = fhhl.a;
        this.d.id(fhmtVar, j);
        while (this.d.b >= 16384) {
            c(false);
        }
    }
}
