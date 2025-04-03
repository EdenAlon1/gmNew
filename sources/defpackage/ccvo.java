package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccvo implements ccvm {
    public final String a;
    public final boolean b;

    public ccvo(String str, boolean z) {
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
        if (!(obj instanceof ccvo)) {
            return false;
        }
        ccvo ccvoVar = (ccvo) obj;
        return ffkj.e(this.a, ccvoVar.a) && this.b == ccvoVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "InsertionResult(cmsId=" + this.a + ", didAlreadyExist=" + this.b + ")";
    }
}
