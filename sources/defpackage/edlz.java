package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class edlz extends edqh {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Double f;
    public final edmm g;
    public final String h;
    public final String i;

    public edlz(String str, String str2, String str3, String str4, String str5, Double d, edmm edmmVar, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = d;
        if (edmmVar == null) {
            throw new NullPointerException("Null authorAttribution");
        }
        this.g = edmmVar;
        if (str6 == null) {
            throw new NullPointerException("Null attribution");
        }
        this.h = str6;
        this.i = str7;
    }

    @Override // defpackage.edqh
    public final edmm a() {
        return this.g;
    }

    @Override // defpackage.edqh
    public final Double b() {
        return this.f;
    }

    @Override // defpackage.edqh
    public final String c() {
        return this.h;
    }

    @Override // defpackage.edqh
    public final String d() {
        return this.d;
    }

    @Override // defpackage.edqh
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof edqh) {
            edqh edqhVar = (edqh) obj;
            String str2 = this.a;
            if (str2 != null ? str2.equals(edqhVar.g()) : edqhVar.g() == null) {
                String str3 = this.b;
                if (str3 != null ? str3.equals(edqhVar.h()) : edqhVar.h() == null) {
                    String str4 = this.c;
                    if (str4 != null ? str4.equals(edqhVar.i()) : edqhVar.i() == null) {
                        String str5 = this.d;
                        if (str5 != null ? str5.equals(edqhVar.d()) : edqhVar.d() == null) {
                            String str6 = this.e;
                            if (str6 != null ? str6.equals(edqhVar.e()) : edqhVar.e() == null) {
                                if (this.f.equals(edqhVar.b()) && this.g.equals(edqhVar.a()) && this.h.equals(edqhVar.c()) && ((str = this.i) != null ? str.equals(edqhVar.f()) : edqhVar.f() == null)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.edqh
    public final String f() {
        return this.i;
    }

    @Override // defpackage.edqh
    public final String g() {
        return this.a;
    }

    @Override // defpackage.edqh
    public final String h() {
        return this.b;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = hashCode ^ 1000003;
        String str3 = this.c;
        int hashCode3 = ((((i * 1000003) ^ hashCode2) * 1000003) ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.d;
        int hashCode4 = (hashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.e;
        int hashCode5 = (((((((hashCode4 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003;
        String str6 = this.i;
        return hashCode5 ^ (str6 != null ? str6.hashCode() : 0);
    }

    @Override // defpackage.edqh
    public final String i() {
        return this.c;
    }

    public final String toString() {
        return "Review{relativePublishTimeDescription=" + this.a + ", text=" + this.b + ", textLanguageCode=" + this.c + ", originalText=" + this.d + ", originalTextLanguageCode=" + this.e + ", rating=" + this.f + ", authorAttribution=" + this.g.toString() + ", attribution=" + this.h + ", publishTime=" + this.i + "}";
    }
}
