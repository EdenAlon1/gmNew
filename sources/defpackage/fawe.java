package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
class fawe implements favp {
    private final favp a;
    private final long b;
    private final long c;
    private long d;
    private long e;

    public fawe(favp favpVar, long j) {
        if (favpVar.c() < Long.MAX_VALUE) {
            emxf.a(j <= favpVar.c() - (favpVar.d() - favpVar.b()));
        }
        this.a = favpVar;
        this.b = favpVar.d();
        this.c = j;
    }

    @Override // defpackage.favp
    public final synchronized int a(byte[] bArr, int i, int i2) {
        int a;
        emxf.b(65536 - i >= i2, "Cannot read into a buffer smaller than given length");
        int min = (int) Math.min(i2, this.c - this.d);
        if (this.b + this.d != this.a.d()) {
            this.a.h();
            long b = (this.b - this.a.b()) + this.d;
            while (b > 0) {
                b -= this.a.f(b);
            }
        }
        a = this.a.a(bArr, i, min);
        this.d += a;
        return a;
    }

    @Override // defpackage.favp
    public final synchronized long b() {
        return this.e;
    }

    @Override // defpackage.favp
    public final synchronized long c() {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.favp, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a.close();
    }

    @Override // defpackage.favp
    public final synchronized long d() {
        return this.d;
    }

    @Override // defpackage.favp
    public final synchronized long e() {
        return this.c;
    }

    @Override // defpackage.favp
    public final synchronized long f(long j) {
        long f;
        long min = Math.min(j, this.c - this.d);
        if (this.b + this.d != this.a.d()) {
            this.a.h();
            long b = (this.b - this.a.b()) + this.d;
            while (b > 0) {
                b -= this.a.f(b);
            }
        }
        f = this.a.f(min);
        this.d += f;
        return f;
    }

    @Override // defpackage.favp
    public final synchronized void g() {
        this.e = this.d;
    }

    @Override // defpackage.favp
    public final synchronized void h() {
        this.d = this.e;
    }

    @Override // defpackage.favp
    public final synchronized boolean i() {
        return this.d < this.c;
    }
}
