package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amop {
    public final axcl a;
    public final axcj b;
    public final long c;
    public final String d;

    public amop(axcl axclVar, axcj axcjVar, long j, String str) {
        this.a = axclVar;
        this.b = axcjVar;
        this.c = j;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amop)) {
            return false;
        }
        amop amopVar = (amop) obj;
        return this.a == amopVar.a && this.b == amopVar.b && this.c == amopVar.c && ffkj.e(this.d, amopVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.d;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j = this.c;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + hashCode2;
    }

    public final String toString() {
        return "ConversationClassification(classificationType=" + this.a + ", classificationState=" + this.b + ", impressionCount=" + this.c + ", date=" + this.d + ")";
    }
}
