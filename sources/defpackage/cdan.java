package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdan {
    public final Object a;
    public final ccce b;

    public cdan(Object obj, ccce ccceVar) {
        this.a = obj;
        this.b = ccceVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdan)) {
            return false;
        }
        cdan cdanVar = (cdan) obj;
        return ffkj.e(this.a, cdanVar.a) && ffkj.e(this.b, cdanVar.b);
    }

    public final int hashCode() {
        return (ffch.a(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "InsertionResultWithRequest(insertionResult=" + ffch.b(this.a) + ", cmsBackupParameters=" + this.b + ")";
    }
}
