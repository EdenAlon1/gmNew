package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eafj implements eafh {
    private final Throwable a;

    public eafj(Throwable th) {
        this.a = th;
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
        return (obj instanceof eafj) && ffkj.e(this.a, ((eafj) obj).a);
    }

    @Override // defpackage.eafl
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // defpackage.eafl
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // defpackage.eafl
    public final /* synthetic */ boolean h() {
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GenericTransientFailure(exception=" + this.a + ")";
    }
}
