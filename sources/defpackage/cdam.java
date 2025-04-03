package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdam {
    public final Object a;
    public final ccvl b;

    public cdam(Object obj, ccvl ccvlVar) {
        this.a = obj;
        this.b = ccvlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdam)) {
            return false;
        }
        cdam cdamVar = (cdam) obj;
        return ffkj.e(this.a, cdamVar.a) && ffkj.e(this.b, cdamVar.b);
    }

    public final int hashCode() {
        return (ffch.a(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "InsertionResultWithContext(insertionResult=" + ffch.b(this.a) + ", loggingContext=" + this.b + ")";
    }
}
