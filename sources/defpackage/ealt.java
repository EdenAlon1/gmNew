package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ealt implements eafh {
    public final boolean a;
    private final Throwable b;

    public ealt(Throwable th, boolean z) {
        this.b = th;
        this.a = z;
    }

    @Override // defpackage.eafh
    public final Throwable a() {
        return this.b;
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
        if (!(obj instanceof ealt)) {
            return false;
        }
        ealt ealtVar = (ealt) obj;
        return ffkj.e(this.b, ealtVar.b) && this.a == ealtVar.a;
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
        return (this.b.hashCode() * 31) + (true != this.a ? 1237 : 1231);
    }

    public final String toString() {
        return "TokenRegenerationFailure(exception=" + this.b + ", hasDeletedToken=" + this.a + ")";
    }
}
