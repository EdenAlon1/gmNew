package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dywy extends dyxe {
    private int a;
    private long b;
    private long c;
    private double d;
    private int e;
    private byte f;

    @Override // defpackage.dyxe
    public final dyxf a() {
        if (this.f == 31) {
            return new dywz(this.a, this.b, this.c, this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f & 1) == 0) {
            sb.append(" maxRetries");
        }
        if ((this.f & 2) == 0) {
            sb.append(" maxDelayMs");
        }
        if ((this.f & 4) == 0) {
            sb.append(" initialDelayMs");
        }
        if ((this.f & 8) == 0) {
            sb.append(" backoff");
        }
        if ((this.f & 16) == 0) {
            sb.append(" jitterMs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dyxe
    public final void b(double d) {
        this.d = d;
        this.f = (byte) (this.f | 8);
    }

    @Override // defpackage.dyxe
    public final void c(long j) {
        this.c = j;
        this.f = (byte) (this.f | 4);
    }

    @Override // defpackage.dyxe
    public final void d(int i) {
        this.e = i;
        this.f = (byte) (this.f | 16);
    }

    @Override // defpackage.dyxe
    public final void e(long j) {
        this.b = j;
        this.f = (byte) (this.f | 2);
    }

    @Override // defpackage.dyxe
    public final void f(int i) {
        this.a = i;
        this.f = (byte) (this.f | 1);
    }
}
