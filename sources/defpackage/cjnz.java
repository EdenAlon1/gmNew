package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjnz {
    public final cfmh a;
    public final awya b;
    private final cfmf c;

    public /* synthetic */ cjnz(cfmh cfmhVar, awya awyaVar) {
        cfmhVar.getClass();
        awyaVar.getClass();
        this.a = cfmhVar;
        this.b = awyaVar;
        this.c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjnz)) {
            return false;
        }
        cjnz cjnzVar = (cjnz) obj;
        if (!ffkj.e(this.a, cjnzVar.a) || !ffkj.e(this.b, cjnzVar.b)) {
            return false;
        }
        cfmf cfmfVar = cjnzVar.c;
        return ffkj.e(null, null);
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
    }

    public final String toString() {
        return "SendingConfiguration(encryptionProtocol=" + this.a + ", messageClass=" + this.b + ", mlsEncryptionId=null)";
    }
}
