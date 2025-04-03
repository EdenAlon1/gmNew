package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlkv extends dlaf {
    public final rus a;
    public final dlkw b;

    public dlkv(rus rusVar, dlkw dlkwVar) {
        this.a = rusVar;
        this.b = dlkwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlkv)) {
            return false;
        }
        dlkv dlkvVar = (dlkv) obj;
        return ffkj.e(this.a, dlkvVar.a) && ffkj.e(this.b, dlkvVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
