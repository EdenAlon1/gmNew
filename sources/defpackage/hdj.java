package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdj implements hbr {
    private final hun a;
    private final int b = 0;

    public hdj(hun hunVar) {
        this.a = hunVar;
    }

    @Override // defpackage.hbr
    public final int a(kac kacVar, long j, int i, kah kahVar) {
        if (i >= kaf.b(j)) {
            int i2 = huo.a;
            return hum.k.a(i, kaf.b(j), kahVar);
        }
        hun hunVar = this.a;
        int b = kaf.b(j);
        return ffmk.i(Math.round(((b - i) / 2.0f) * (((hup) hunVar).a + 1.0f)), 0, kaf.b(j) - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdj)) {
            return false;
        }
        hdj hdjVar = (hdj) obj;
        if (!ffkj.e(this.a, hdjVar.a)) {
            return false;
        }
        int i = hdjVar.b;
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.a + ", margin=0)";
    }
}
