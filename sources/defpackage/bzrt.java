package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzrt {
    public final String a;
    public final String b;

    public bzrt(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzrt)) {
            return false;
        }
        bzrt bzrtVar = (bzrt) obj;
        return ffkj.e(this.a, bzrtVar.a) && ffkj.e(this.b, bzrtVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SelfIdentityKeyMetadata(phoneNumber=" + this.a + ", deviceId=" + this.b + ")";
    }
}
