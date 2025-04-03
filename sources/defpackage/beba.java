package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class beba extends RuntimeException {
    public final long a;
    public final long b;
    private final long c;

    public beba(long j, long j2, long j3, String str, Throwable th) {
        super(str, th);
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "DatabaseUpgradeException from: " + this.a + " to " + this.b + "; was at: " + this.c + "; " + super.getMessage();
    }

    public beba(String str, Throwable th) {
        this(-1L, -1L, -1L, str, th);
    }
}
