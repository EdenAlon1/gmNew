package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dndn implements dndq {
    private final ffix a;

    public dndn() {
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
        return (obj instanceof dndn) && ffkj.e(this.a, ((dndn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loading(onClick=" + this.a + ")";
    }

    public /* synthetic */ dndn(byte[] bArr) {
        this.a = new ffix() { // from class: dndm
            @Override // defpackage.ffix
            public final Object invoke() {
                return false;
            }
        };
    }
}
