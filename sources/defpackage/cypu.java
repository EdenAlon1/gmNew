package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cypu {
    public final dndt a;
    public final int b;

    public cypu(dndt dndtVar, int i) {
        this.a = dndtVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cypu)) {
            return false;
        }
        cypu cypuVar = (cypu) obj;
        return ffkj.e(this.a, cypuVar.a) && this.b == cypuVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConversationActionUiData(data=");
        sb.append(this.a);
        sb.append(", color=");
        sb.append((Object) (this.b != 1 ? "ERROR" : "PRIMARY"));
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ cypu(dndt dndtVar) {
        this(dndtVar, 1);
    }
}
