package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class balv {
    public final enip a;
    public final bseh b;
    public final bdfy c;
    public final boolean d;
    public final boolean e;

    public balv(enip enipVar, bseh bsehVar, bdfy bdfyVar, boolean z, boolean z2) {
        enipVar.getClass();
        bsehVar.getClass();
        bdfyVar.getClass();
        this.a = enipVar;
        this.b = bsehVar;
        this.c = bdfyVar;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof balv)) {
            return false;
        }
        balv balvVar = (balv) obj;
        return ffkj.e(this.a, balvVar.a) && ffkj.e(this.b, balvVar.b) && ffkj.e(this.c, balvVar.c) && this.d == balvVar.d && this.e == balvVar.e;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + balu.a(this.d)) * 31) + balu.a(this.e);
    }

    public final String toString() {
        return "BcmFindOrCreateConversationResults(recipientsNotIncludingSelf=" + this.a + ", targetConversation=" + this.b + ", bcmConversation=" + this.c + ", isAllowedByParents=" + this.d + ", isMergedToRcsGroup=" + this.e + ")";
    }
}
