package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dndi implements dndq {
    private final ffix a;

    public dndi() {
        this(null);
    }

    @Override // defpackage.doms
    public final ffix a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dndi) && ffkj.e(this.a, ((dndi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(onClick=" + this.a + ")";
    }

    public /* synthetic */ dndi(byte[] bArr) {
        this.a = new ffix() { // from class: dndh
            @Override // defpackage.ffix
            public final Object invoke() {
                return false;
            }
        };
    }
}
