package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dndp implements dndq {
    private final ffix a;

    public dndp(ffix ffixVar) {
        this.a = ffixVar;
    }

    @Override // defpackage.doms
    public final ffix a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dndp) && ffkj.e(this.a, ((dndp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TapToLoad(onClick=" + this.a + ")";
    }

    public dndp() {
        this(new ffix() { // from class: dndo
            @Override // defpackage.ffix
            public final Object invoke() {
                return false;
            }
        });
    }
}
