package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqkm {
    private final String a;
    private final String b;
    private final eyja c;

    public aqkm(String str, String str2, eyja eyjaVar) {
        this.a = str;
        this.b = str2;
        this.c = eyjaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqkm)) {
            return false;
        }
        aqkm aqkmVar = (aqkm) obj;
        return ffkj.e(this.a, aqkmVar.a) && ffkj.e(this.b, aqkmVar.b) && ffkj.e(this.c, aqkmVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        eyja eyjaVar = this.c;
        return hashCode2 + (eyjaVar != null ? eyjaVar.hashCode() : 0);
    }

    public final String toString() {
        return "ProfileSendingMetadata(profileAccessToken=" + this.a + ", personId=" + this.b + ", profileLastUpdatedServerTimestamp=" + this.c + ")";
    }
}
