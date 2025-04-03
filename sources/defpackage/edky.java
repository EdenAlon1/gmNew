package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class edky extends edmm {
    public final String a;
    public final String b;
    public final String c;

    public edky(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.edmm
    public final String a() {
        return this.a;
    }

    @Override // defpackage.edmm
    public final String b() {
        return this.c;
    }

    @Override // defpackage.edmm
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof edmm) {
            edmm edmmVar = (edmm) obj;
            if (this.a.equals(edmmVar.a()) && ((str = this.b) != null ? str.equals(edmmVar.c()) : edmmVar.c() == null) && ((str2 = this.c) != null ? str2.equals(edmmVar.b()) : edmmVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        int hashCode2 = ((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        return hashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "AuthorAttribution{name=" + this.a + ", uri=" + this.b + ", photoUri=" + this.c + "}";
    }
}
