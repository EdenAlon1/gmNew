package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akwq {
    public static /* synthetic */ long a(long j) {
        if (j < 0) {
            return -1L;
        }
        if (j == 0) {
            return 0L;
        }
        double j2 = ffmk.j(j, 10000L);
        double pow = Math.pow(10.0d, Math.floor(Math.log10(j2)) - 1.0d);
        return (long) (pow * Math.rint(j2 / pow));
    }
}
