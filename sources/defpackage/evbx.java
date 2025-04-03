package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evbx extends evbr {
    private final String b;
    private final String c;

    public evbx(String str, String str2) {
        this.b = str;
        if (str2 == null) {
            throw new NullPointerException("Null type");
        }
        this.c = str2;
    }

    @Override // defpackage.evbr
    public final String a() {
        return this.b;
    }

    @Override // defpackage.evbr
    public final String b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof evbr) {
            evbr evbrVar = (evbr) obj;
            String str = this.b;
            if (str != null ? str.equals(evbrVar.a()) : evbrVar.a() == null) {
                if (this.c.equals(evbrVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "AuthContext{identifier=" + this.b + ", type=" + this.c + "}";
    }
}
