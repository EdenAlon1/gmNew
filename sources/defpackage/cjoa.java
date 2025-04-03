package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjoa extends cjod {
    public final cjoe a;
    public final ckbx b;

    public cjoa(cjoe cjoeVar, ckbx ckbxVar) {
        this.a = cjoeVar;
        this.b = ckbxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjoa)) {
            return false;
        }
        cjoa cjoaVar = (cjoa) obj;
        return ffkj.e(this.a, cjoaVar.a) && ffkj.e(this.b, cjoaVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ChatApiResult(sendingMessageData=" + this.a + ", messageStatus=" + this.b + ")";
    }
}
