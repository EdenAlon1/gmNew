package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecii {
    public final fglq a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final fgkx f;
    public final String g;
    public final fgmh h;
    public final Integer i;

    public ecii(fglq fglqVar, Long l, Long l2, Long l3, Long l4, fgkx fgkxVar, String str, fgmh fgmhVar, Integer num) {
        this.a = fglqVar;
        this.b = l;
        this.c = l2;
        this.d = l3;
        this.e = l4;
        this.f = fgkxVar;
        this.g = str;
        this.h = fgmhVar;
        this.i = num;
    }

    public final String toString() {
        return String.format("StatsRecord:\n  elapsed: %d\n  current: %d\n  Primes version: %d\n  version name #: %d\n  customName: %s\n", this.b, this.c, this.d, this.e, this.g);
    }
}
