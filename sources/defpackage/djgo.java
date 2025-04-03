package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djgo extends djhe {
    public final dkkj a;
    public final int b;

    public djgo(int i, dkkj dkkjVar) {
        this.b = i;
        this.a = dkkjVar;
    }

    @Override // defpackage.djhe
    public final dkkj a() {
        return this.a;
    }

    @Override // defpackage.djhe
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof djhe) {
            djhe djheVar = (djhe) obj;
            if (this.b == djheVar.b() && this.a.equals(djheVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        int i = this.b;
        return "SessionStoreResult{action=" + (i != 1 ? i != 2 ? "REPLACED" : "REUSED" : "CREATED") + ", session=" + this.a.toString() + "}";
    }
}
