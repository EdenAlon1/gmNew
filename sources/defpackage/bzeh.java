package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzeh extends bzej {
    public final String a;
    public final bzge b;
    private final fcek c;
    private final long d;
    private final byyv e;
    private final boolean f;

    public bzeh(fcek fcekVar, String str, long j, byyv byyvVar, boolean z, bzge bzgeVar) {
        this.c = fcekVar;
        this.a = str;
        this.d = j;
        this.e = byyvVar;
        this.f = z;
        this.b = bzgeVar;
    }

    @Override // defpackage.bzej
    public final long a() {
        return this.d;
    }

    @Override // defpackage.bzej
    public final byyv b() {
        return this.e;
    }

    @Override // defpackage.bzej
    public final bzge c() {
        return this.b;
    }

    @Override // defpackage.bzej
    @Deprecated
    public final fcek d() {
        return this.c;
    }

    @Override // defpackage.bzej
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bzej) {
            bzej bzejVar = (bzej) obj;
            if (this.c.equals(bzejVar.d()) && this.a.equals(bzejVar.e()) && this.d == bzejVar.a() && this.e.equals(bzejVar.b()) && this.f == bzejVar.f() && this.b.equals(bzejVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bzej
    public final boolean f() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = ((this.c.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
        long j = this.d;
        return (((((((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        bzge bzgeVar = this.b;
        byyv byyvVar = this.e;
        return "DesktopInformation{desktopId=" + this.c.toString() + ", requestId=" + this.a + ", lastConnectionTimeMillis=" + this.d + ", desktopType=" + byyvVar.toString() + ", isPersistent=" + this.f + ", dittoIdContainer=" + bzgeVar.toString() + "}";
    }
}
