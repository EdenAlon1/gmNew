package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eafo implements eafl {
    public final Object a;

    public eafo(Object obj) {
        this.a = obj;
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
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eafo) && ffkj.e(this.a, ((eafo) obj).a);
    }

    @Override // defpackage.eafl
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // defpackage.eafl
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // defpackage.eafl
    public final /* synthetic */ boolean h() {
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Success(value=" + this.a + ")";
    }
}
