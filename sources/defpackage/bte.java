package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bte {
    static bte d(long j, long j2, bqf bqfVar) {
        ksw.b(j >= 0, "duration must be positive value.");
        ksw.b(j2 >= 0, "bytes must be positive value.");
        return new bqs(j, j2, bqfVar);
    }

    public abstract long a();

    public abstract long b();

    public abstract bqf c();
}
