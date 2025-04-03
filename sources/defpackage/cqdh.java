package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqdh {
    public final byyt a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final int e;
    public final long f;

    public cqdh(byyt byytVar, boolean z, boolean z2, String str, int i, long j) {
        byytVar.getClass();
        this.a = byytVar;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = i;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqdh)) {
            return false;
        }
        cqdh cqdhVar = (cqdh) obj;
        return this.a == cqdhVar.a && this.b == cqdhVar.b && this.c == cqdhVar.c && ffkj.e(this.d, cqdhVar.d) && this.e == cqdhVar.e && this.f == cqdhVar.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.d;
        int a = (((((((hashCode + cqdg.a(this.b)) * 31) + cqdg.a(this.c)) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.e) * 31;
        long j = this.f;
        return a + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "ConversationCustomization(archiveStatus=" + this.a + ", isMuted=" + this.b + ", noVibrate=" + this.c + ", notificationSoundUri=" + this.d + ", joinStatus=" + this.e + ", rcsSessionId=" + this.f + ")";
    }
}
