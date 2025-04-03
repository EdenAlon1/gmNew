package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crsz extends crtd {
    public final Long a;
    public final Long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public crsz(Long l, Long l2, String str, String str2, String str3, String str4) {
        this.a = l;
        this.b = l2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    @Override // defpackage.crtd
    public final Long a() {
        return this.b;
    }

    @Override // defpackage.crtd
    public final Long b() {
        return this.a;
    }

    @Override // defpackage.crtd
    public final String c() {
        return this.d;
    }

    @Override // defpackage.crtd
    public final String d() {
        return this.e;
    }

    @Override // defpackage.crtd
    public final String e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof crtd) {
            crtd crtdVar = (crtd) obj;
            if (this.a.equals(crtdVar.b()) && this.b.equals(crtdVar.a()) && ((str = this.c) != null ? str.equals(crtdVar.f()) : crtdVar.f() == null) && ((str2 = this.d) != null ? str2.equals(crtdVar.c()) : crtdVar.c() == null) && ((str3 = this.e) != null ? str3.equals(crtdVar.d()) : crtdVar.d() == null) && ((str4 = this.f) != null ? str4.equals(crtdVar.e()) : crtdVar.e() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.crtd
    public final String f() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        String str = this.c;
        int hashCode2 = ((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.d;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f;
        return hashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "Event{startTime=" + this.a + ", endTime=" + this.b + ", summary=" + this.c + ", description=" + this.d + ", location=" + this.e + ", rrule=" + this.f + "}";
    }
}
