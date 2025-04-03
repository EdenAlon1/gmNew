package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class csxa extends csxp {
    public final String a;
    public final String b;

    public csxa(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null gifObjectId");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null query");
        }
        this.b = str2;
    }

    @Override // defpackage.csxp
    public final String a() {
        return this.a;
    }

    @Override // defpackage.csxp
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof csxp) {
            csxp csxpVar = (csxp) obj;
            if (this.a.equals(csxpVar.a()) && this.b.equals(csxpVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "TenorRegisterShareRequest{gifObjectId=" + this.a + ", query=" + this.b + "}";
    }
}
