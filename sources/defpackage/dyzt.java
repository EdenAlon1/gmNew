package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyzt extends dzaq {
    public final dzpt a;
    public final long b;

    public dyzt(dzpt dzptVar, long j) {
        this.a = dzptVar;
        this.b = j;
    }

    @Override // defpackage.dzaq
    public final long a() {
        return this.b;
    }

    @Override // defpackage.dzaq
    public final dzpt b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzaq) {
            dzaq dzaqVar = (dzaq) obj;
            if (this.a.equals(dzaqVar.b()) && this.b == dzaqVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "DeleteConversation{conversationId=" + this.a.toString() + ", deleteTimestampMicroSec=" + this.b + "}";
    }
}
