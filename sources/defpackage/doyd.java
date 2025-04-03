package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doyd implements doyc {
    public final drlx a;
    public final String b;
    public final long c;
    public final String d;
    private final Instant e;
    private final doxr f;

    public doyd(drlx drlxVar, String str, long j, String str2, Instant instant, doxr doxrVar) {
        drlxVar.getClass();
        str.getClass();
        instant.getClass();
        doxrVar.getClass();
        this.a = drlxVar;
        this.b = str;
        this.c = j;
        this.d = str2;
        this.e = instant;
        this.f = doxrVar;
    }

    @Override // defpackage.doyc
    public final long a() {
        return this.c;
    }

    @Override // defpackage.doyc
    public final drlx b() {
        return this.a;
    }

    @Override // defpackage.doyc
    public final Instant c() {
        return this.e;
    }

    @Override // defpackage.doyc
    public final String d() {
        return this.d;
    }

    @Override // defpackage.doyc
    public final /* synthetic */ String e() {
        return doxy.b(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doyd)) {
            return false;
        }
        doyd doydVar = (doyd) obj;
        return ffkj.e(this.a, doydVar.a) && ffkj.e(this.b, doydVar.b) && this.c == doydVar.c && ffkj.e(this.d, doydVar.d) && ffkj.e(this.e, doydVar.e) && ffkj.e(this.f, doydVar.f);
    }

    @Override // defpackage.doyc
    public final String f() {
        return this.b;
    }

    @Override // defpackage.doxs
    public final doxr fm() {
        return this.f;
    }

    @Override // defpackage.doxx
    public final /* bridge */ /* synthetic */ Object fn() {
        Object e;
        e = e();
        return e;
    }

    @Override // defpackage.doxs
    public final /* synthetic */ String fo() {
        return toString();
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.d;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j = this.c;
        return (((((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + hashCode2) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "LocalFile(mediaType=" + this.a + ", url=" + this.b + ", sizeBytes=" + this.c + ", displayName=" + this.d + ", dateModified=" + this.e + ", source=" + this.f + ")";
    }
}
