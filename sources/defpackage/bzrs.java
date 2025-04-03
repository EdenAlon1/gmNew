package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzrs {
    public final String a;
    private final String b;
    private final String c = "google_messages_v1";

    public bzrs(String str, String str2) {
        this.b = str;
        this.a = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzrs)) {
            return false;
        }
        bzrs bzrsVar = (bzrs) obj;
        return ffkj.e(this.b, bzrsVar.b) && ffkj.e(this.a, bzrsVar.a) && ffkj.e(this.c, bzrsVar.c);
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.a.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "KeyMetadata(phoneNumber=" + this.b + ", lookupKey=" + this.a + ", deviceId=" + this.c + ")";
    }
}
