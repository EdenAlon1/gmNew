package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zhr {
    public final zic a;
    public final boolean b;
    public final String c;
    public final zib d;
    public final ffix e;
    private final String f;

    public zhr(String str, zic zicVar, boolean z, String str2, zib zibVar, ffix ffixVar) {
        zicVar.getClass();
        this.f = str;
        this.a = zicVar;
        this.b = z;
        this.c = str2;
        this.d = zibVar;
        this.e = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zhr)) {
            return false;
        }
        zhr zhrVar = (zhr) obj;
        return ffkj.e(this.f, zhrVar.f) && ffkj.e(this.a, zhrVar.a) && this.b == zhrVar.b && ffkj.e(this.c, zhrVar.c) && ffkj.e(this.d, zhrVar.d) && ffkj.e(this.e, zhrVar.e);
    }

    public final int hashCode() {
        return (((((((((this.f.hashCode() * 31) + this.a.hashCode()) * 31) + (true != this.b ? 1237 : 1231)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "Reply(messageId=" + this.f + ", metatext=" + this.a + ", error=" + this.b + ", contentDescription=" + this.c + ", content=" + this.d + ", onClick=" + this.e + ")";
    }
}
