package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccyr implements ccvm {
    public final ccvo a;
    public final Object b;

    public ccyr(ccvo ccvoVar, Object obj) {
        ccvoVar.getClass();
        this.a = ccvoVar;
        this.b = obj;
    }

    @Override // defpackage.ccvm
    public final String a() {
        return this.a.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccyr)) {
            return false;
        }
        ccyr ccyrVar = (ccyr) obj;
        return ffkj.e(this.a, ccyrVar.a) && ffkj.e(this.b, ccyrVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "BatchInsertionResult(insertionResult=" + this.a + ", localData=" + this.b + ")";
    }
}
