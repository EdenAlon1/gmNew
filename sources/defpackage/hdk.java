package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdk implements hbs {
    private final int a;
    private final hus b;

    public hdk(hus husVar, int i) {
        this.b = husVar;
        this.a = i;
    }

    @Override // defpackage.hbs
    public final int a(kac kacVar, long j, int i) {
        int i2 = this.a;
        if (i >= kaf.a(j) - (i2 + i2)) {
            int i3 = huo.a;
            return hum.n.a(i, kaf.a(j));
        }
        hus husVar = this.b;
        int a = kaf.a(j);
        return ffmk.i(husVar.a(i, a), i2, (kaf.a(j) - i2) - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdk)) {
            return false;
        }
        hdk hdkVar = (hdk) obj;
        return ffkj.e(this.b, hdkVar.b) && this.a == hdkVar.a;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a;
    }

    public final String toString() {
        return "Vertical(alignment=" + this.b + ", margin=" + this.a + ')';
    }
}
