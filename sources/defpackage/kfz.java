package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kfz implements iog {
    public final kfr a;
    public final ffji b;
    private final Object c;

    public kfz(kfr kfrVar, ffji ffjiVar) {
        this.a = kfrVar;
        this.b = ffjiVar;
        this.c = kfrVar.a;
    }

    @Override // defpackage.iog
    public final Object b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kfz)) {
            return false;
        }
        kfz kfzVar = (kfz) obj;
        return ffkj.e(this.a.a, kfzVar.a.a) && this.b == kfzVar.b;
    }

    public final int hashCode() {
        return (this.a.a.hashCode() * 31) + this.b.hashCode();
    }
}
