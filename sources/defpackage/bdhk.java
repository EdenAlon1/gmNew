package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdhk {
    public static final bdhk a = new bdhk(-1);
    private final bdgv b;

    public bdhk(long j) {
        this.b = new bdgv(j);
    }

    public static long a(bdhk bdhkVar) {
        if (bdhkVar == null) {
            return -1L;
        }
        bdgv bdgvVar = bdhkVar.b;
        if (bdgvVar.a.isPresent()) {
            return ((Long) bdgvVar.a.get()).longValue();
        }
        return -1L;
    }
}
