package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dav implements dau {
    private final Object a;
    private final Object b;

    public dav(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.dau
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.dau
    public final Object b() {
        return this.b;
    }

    @Override // defpackage.dau
    public final /* synthetic */ boolean d(Object obj, Object obj2) {
        return dat.a(this, obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dau)) {
            return false;
        }
        dau dauVar = (dau) obj;
        return ffkj.e(this.a, dauVar.a()) && ffkj.e(this.b, dauVar.b());
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = obj != null ? obj.hashCode() : 0;
        Object obj2 = this.b;
        return (hashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
    }
}
