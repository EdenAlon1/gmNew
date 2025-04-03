package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cpxw extends cpzg {
    private final couu a;
    private final cout b;

    public cpxw(couu couuVar, cout coutVar) {
        if (couuVar == null) {
            throw new NullPointerException("Null localMessage");
        }
        this.a = couuVar;
        if (coutVar == null) {
            throw new NullPointerException("Null remoteMessage");
        }
        this.b = coutVar;
    }

    @Override // defpackage.cpzg
    public final cout a() {
        return this.b;
    }

    @Override // defpackage.cpzg
    public final couu b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cpzg) {
            cpzg cpzgVar = (cpzg) obj;
            if (this.a.equals(cpzgVar.b()) && this.b.equals(cpzgVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        cout coutVar = this.b;
        return "LocalAndRemoteMessagesToMerge{localMessage=" + this.a.toString() + ", remoteMessage=" + coutVar.toString() + "}";
    }
}
