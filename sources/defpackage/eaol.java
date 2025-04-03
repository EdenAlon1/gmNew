package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaol implements eafn, eaom {
    private final Throwable a;
    private final easy b;

    public eaol(Throwable th, easy easyVar) {
        easyVar.getClass();
        this.a = th;
        this.b = easyVar;
    }

    @Override // defpackage.eafh
    public final Throwable a() {
        return this.a;
    }

    @Override // defpackage.eafl
    public final /* synthetic */ Object b() {
        return eafk.a(this);
    }

    @Override // defpackage.eafl
    public final /* synthetic */ Object c() {
        return eafk.b(this);
    }

    @Override // defpackage.eafl
    public final /* synthetic */ Throwable d() {
        return eafk.c(this);
    }

    @Override // defpackage.eafl
    public final /* synthetic */ boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eaol)) {
            return false;
        }
        eaol eaolVar = (eaol) obj;
        return ffkj.e(this.a, eaolVar.a) && ffkj.e(this.b, eaolVar.b);
    }

    @Override // defpackage.eafl
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // defpackage.eafl
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // defpackage.eafl
    public final /* synthetic */ boolean h() {
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    @Override // defpackage.eaom
    public final easy i() {
        return this.b;
    }

    public final String toString() {
        return "AuthPermanentFailure(exception=" + this.a + ", account=" + this.b + ")";
    }
}
