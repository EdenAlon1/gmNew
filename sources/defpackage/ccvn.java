package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccvn implements ccvm {
    public final String a;
    public final boolean b;

    public ccvn(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    @Override // defpackage.ccvm
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccvn)) {
            return false;
        }
        ccvn ccvnVar = (ccvn) obj;
        return ffkj.e(this.a, ccvnVar.a) && this.b == ccvnVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "DeletionResult(cmsId=" + this.a + ", wasAlreadyAbsent=" + this.b + ")";
    }
}
