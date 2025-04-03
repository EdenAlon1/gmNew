package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czm extends czl {
    public final int c;

    public czm(Object obj, cym cymVar) {
        super(obj, cymVar);
        this.c = 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof czm)) {
            return false;
        }
        czm czmVar = (czm) obj;
        if (!ffkj.e(czmVar.a, this.a) || !ffkj.e(czmVar.b, this.b)) {
            return false;
        }
        int i = czmVar.c;
        return true;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 961) + this.b.hashCode();
    }
}
