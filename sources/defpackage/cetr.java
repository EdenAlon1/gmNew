package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cetr {
    public final eyhs a;
    public final String b;
    private final String c;

    public cetr(eyhs eyhsVar, String str, String str2) {
        this.a = eyhsVar;
        this.c = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cetr)) {
            return false;
        }
        cetr cetrVar = (cetr) obj;
        return ffkj.e(this.a, cetrVar.a) && ffkj.e(this.c, cetrVar.c) && ffkj.e(this.b, cetrVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.b;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "CanceledWorkQueueRequest(rawData=" + this.a + ", cancellationTag=" + this.c + ", deduplicationTag=" + this.b + ")";
    }
}
