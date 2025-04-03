package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fng {
    public final eqd a;
    public final eqd b;
    public final eqd c;

    public fng() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fng)) {
            return false;
        }
        fng fngVar = (fng) obj;
        return ffkj.e(this.a, fngVar.a) && ffkj.e(this.b, fngVar.b) && ffkj.e(this.c, fngVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Shapes(small=" + this.a + ", medium=" + this.b + ", large=" + this.c + ')';
    }

    public /* synthetic */ fng(byte[] bArr) {
        eql b = eqm.b(4.0f);
        eql b2 = eqm.b(4.0f);
        eql b3 = eqm.b(0.0f);
        this.a = b;
        this.b = b2;
        this.c = b3;
    }
}
