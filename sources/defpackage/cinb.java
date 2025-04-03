package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cinb extends ciqv {
    public final String a;
    public final String b;

    public cinb(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null contentTitle");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null contentText");
        }
        this.b = str2;
    }

    @Override // defpackage.ciqv
    public final String a() {
        return this.b;
    }

    @Override // defpackage.ciqv
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ciqv) {
            ciqv ciqvVar = (ciqv) obj;
            if (this.a.equals(ciqvVar.b()) && this.b.equals(ciqvVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "StuckMessagesNotificationContent{contentTitle=" + this.a + ", contentText=" + this.b + "}";
    }
}
