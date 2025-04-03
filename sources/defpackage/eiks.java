package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiks {
    public final String a;
    public final long b;
    public final aoku c;

    public eiks(String str, long j, aoku aokuVar) {
        this.a = str;
        this.b = j;
        this.c = aokuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eiks)) {
            return false;
        }
        eiks eiksVar = (eiks) obj;
        return ffkj.e(this.a, eiksVar.a) && this.b == eiksVar.b && ffkj.e(this.c, eiksVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "IncomingProtoMessageData(conversationId=" + this.a + ", sentTimestamp=" + this.b + ", sender=" + this.c + ")";
    }
}
