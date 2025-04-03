package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecri {
    public final ecjk b;
    public ecrh c;
    boolean d;
    private static final dlpw e = new dlqb();
    public static final ecri a = new ecri();

    public ecri(ecjl ecjlVar) {
        this.c = ecrh.UNKNOWN;
        this.d = false;
        this.b = new ecjk(ecjlVar);
    }

    public static boolean e(ecri ecriVar) {
        return ecriVar == null || ecriVar == a;
    }

    final long a() {
        ecjk ecjkVar = this.b;
        return ((ecio) ecjkVar.b).a - ((ecio) ecjkVar.a).a;
    }

    final long b() {
        ecjk ecjkVar = this.b;
        return ((ecio) ecjkVar.b).b - ((ecio) ecjkVar.a).b;
    }

    public final void c() {
        this.b.b = ecjl.c(e);
    }

    final void d(ecrh ecrhVar) {
        if (ecrhVar == null) {
            ecrhVar = ecrh.UNKNOWN;
        }
        this.c = ecrhVar;
    }

    public ecri() {
        this.c = ecrh.UNKNOWN;
        this.d = false;
        this.b = new ecjk(e);
    }

    public ecri(long j, long j2, ecrh ecrhVar) {
        this.c = ecrh.UNKNOWN;
        this.d = false;
        if (j2 < j) {
            throw new IllegalArgumentException(emyk.a("End time %s is before start time %s.", Long.valueOf(j2), Long.valueOf(j)));
        }
        this.b = new ecjk(new ecio(j, j), new ecio(j2, j2));
        this.c = ecrhVar;
    }
}
