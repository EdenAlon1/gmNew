package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaoo implements eaor {
    private final Throwable a;

    public eaoo(Throwable th) {
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
        return (obj instanceof eaoo) && ffkj.e(this.a, ((eaoo) obj).a);
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
        return this.a.hashCode();
    }

    public final String toString() {
        return "GenericHttpPermanentFailure(exception=" + this.a + ")";
    }
}
