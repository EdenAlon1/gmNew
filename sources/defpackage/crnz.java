package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class crnz extends crnw {
    public final Resources a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final int f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final int m;
    public final int n;

    public crnz(Resources resources, int i, boolean z, boolean z2, String str, int i2, int i3, String str2, String str3, String str4, String str5, String str6, String str7, int i4) {
        this.a = resources;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = str;
        this.n = i2;
        this.f = i3;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = i4;
    }

    @Override // defpackage.crnw
    public final int a() {
        return this.f;
    }

    @Override // defpackage.crnw
    public final int b() {
        return this.b;
    }

    @Override // defpackage.crnw
    public final int c() {
        return this.m;
    }

    @Override // defpackage.crnw
    public final Resources d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (obj == this) {
            return true;
        }
        if (obj instanceof crnw) {
            crnw crnwVar = (crnw) obj;
            if (this.a.equals(crnwVar.d()) && this.b == crnwVar.b() && this.c == crnwVar.m() && this.d == crnwVar.n() && ((str = this.e) != null ? str.equals(crnwVar.h()) : crnwVar.h() == null) && ((i = this.n) != 0 ? i == crnwVar.o() : crnwVar.o() == 0) && this.f == crnwVar.a() && ((str2 = this.g) != null ? str2.equals(crnwVar.f()) : crnwVar.f() == null) && ((str3 = this.h) != null ? str3.equals(crnwVar.j()) : crnwVar.j() == null) && ((str4 = this.i) != null ? str4.equals(crnwVar.k()) : crnwVar.k() == null) && ((str5 = this.j) != null ? str5.equals(crnwVar.l()) : crnwVar.l() == null) && ((str6 = this.k) != null ? str6.equals(crnwVar.i()) : crnwVar.i() == null) && ((str7 = this.l) != null ? str7.equals(crnwVar.g()) : crnwVar.g() == null) && this.m == crnwVar.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.crnw
    public final String f() {
        return this.g;
    }

    @Override // defpackage.crnw
    public final String g() {
        return this.l;
    }

    @Override // defpackage.crnw
    public final String h() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        String str = this.e;
        int hashCode2 = ((((((((hashCode * 1000003) ^ this.b) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true == this.d ? 1231 : 1237)) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        int i = this.n;
        if (i == 0) {
            i = 0;
        }
        int i2 = (((hashCode2 ^ i) * 1000003) ^ this.f) * 1000003;
        String str2 = this.g;
        int hashCode3 = (i2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.h;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.i;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.j;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.k;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.l;
        return ((hashCode7 ^ (str7 != null ? str7.hashCode() : 0)) * 1000003) ^ this.m;
    }

    @Override // defpackage.crnw
    public final String i() {
        return this.k;
    }

    @Override // defpackage.crnw
    public final String j() {
        return this.h;
    }

    @Override // defpackage.crnw
    public final String k() {
        return this.i;
    }

    @Override // defpackage.crnw
    public final String l() {
        return this.j;
    }

    @Override // defpackage.crnw
    public final boolean m() {
        return this.c;
    }

    @Override // defpackage.crnw
    public final boolean n() {
        return this.d;
    }

    @Override // defpackage.crnw
    public final int o() {
        return this.n;
    }

    public final String toString() {
        int i = this.n;
        String obj = this.a.toString();
        String str = i != 1 ? i != 2 ? "null" : "UNSPECIFIED_SENDER" : "SELF";
        String str2 = this.e;
        boolean z = this.d;
        boolean z2 = this.c;
        return "ContentDescriptionArgs{resources=" + obj + ", statusCode=" + this.b + ", isOutgoing=" + z2 + ", useSentToFormat=" + z + ", contact=" + str2 + ", specialContactType=" + str + ", attachmentCount=" + this.f + ", attachmentContentType=" + this.g + ", subject=" + this.h + ", text=" + this.i + ", timestamp=" + this.j + ", conversationName=" + this.k + ", caption=" + this.l + ", unreadMessageCount=" + this.m + "}";
    }
}
