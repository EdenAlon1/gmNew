package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class babz extends baow {
    public final String a;
    public final String b;
    public final boolean c;

    public babz(String str, String str2, boolean z) {
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null displayOriginatingAddress");
        }
        this.b = str2;
        this.c = z;
    }

    @Override // defpackage.baow
    public final String a() {
        return this.b;
    }

    @Override // defpackage.baow
    public final String b() {
        return this.a;
    }

    @Override // defpackage.baow
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof baow) {
            baow baowVar = (baow) obj;
            if (this.a.equals(baowVar.b()) && this.b.equals(baowVar.a()) && this.c == baowVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "RawSmsMessagingAddress{originatingAddress=" + this.a + ", displayOriginatingAddress=" + this.b + ", isEmail=" + this.c + "}";
    }
}
