package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axqx extends axra implements ffxx {
    private final String b;
    private final ffxx c;

    public axqx(String str, ffxx ffxxVar) {
        super(str);
        this.b = str;
        this.c = ffxxVar;
    }

    @Override // defpackage.ffxx
    public final Object a(ffxy ffxyVar, ffgu ffguVar) {
        return this.c.a(ffxyVar, ffguVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axqx)) {
            return false;
        }
        axqx axqxVar = (axqx) obj;
        return ffkj.e(this.b, axqxVar.b) && ffkj.e(this.c, axqxVar.c);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    @Override // defpackage.axra
    public final String toString() {
        return "NamedFlow(name=" + this.b + ", flow=" + this.c + ")";
    }
}
