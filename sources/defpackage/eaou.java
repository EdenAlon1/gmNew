package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaou implements eaor {
    public final Set a;
    private final Throwable b;

    public eaou(Throwable th, Set set) {
        set.getClass();
        this.b = th;
        this.a = set;
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
        if (!(obj instanceof eaou)) {
            return false;
        }
        eaou eaouVar = (eaou) obj;
        return ffkj.e(this.b, eaouVar.b) && ffkj.e(this.a, eaouVar.a);
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
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "RpcBackendFailure(exception=" + this.b + ", accountsFailed=" + this.a + ")";
    }
}
