package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvae extends cvbq {
    private final String a;
    private final String b;
    private final String c;

    public cvae(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null msisdn");
        }
        this.a = str;
        this.b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null c11nToken");
        }
        this.c = str3;
    }

    @Override // defpackage.cvbq
    public final String a() {
        return this.c;
    }

    @Override // defpackage.cvbq
    public final String b() {
        return this.b;
    }

    @Override // defpackage.cvbq
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvbq) {
            cvbq cvbqVar = (cvbq) obj;
            if (this.a.equals(cvbqVar.c()) && this.b.equals(cvbqVar.b()) && this.c.equals(cvbqVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "PhoneNumber{msisdn=" + this.a + ", imsi=" + this.b + ", c11nToken=" + this.c + "}";
    }
}
