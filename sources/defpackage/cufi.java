package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cufi extends ffhv implements ffjm {
    final /* synthetic */ cufk a;
    final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cufi(cufk cufkVar, boolean z, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cufkVar;
        this.b = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cufi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cufk cufkVar = this.a;
        Object obj2 = cufkVar.e;
        boolean z = this.b;
        synchronized (obj2) {
            cufkVar.f = Boolean.valueOf(z);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cufi(this.a, this.b, ffguVar);
    }
}
