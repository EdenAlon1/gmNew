package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clat extends clax {
    public final String a;
    public final String b;
    public final String c;

    public clat(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.clax
    public final String a() {
        return this.a;
    }

    @Override // defpackage.clax
    public final String b() {
        return this.c;
    }

    @Override // defpackage.clax
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof clax) {
            clax claxVar = (clax) obj;
            if (this.a.equals(claxVar.a()) && this.b.equals(claxVar.c()) && this.c.equals(claxVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "RcsGroupTelephonyData{groupName=" + this.a + ", selfRcsMsisdn=" + this.b + ", rcsGroupId=" + this.c + "}";
    }
}
