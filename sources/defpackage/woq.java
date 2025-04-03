package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class woq extends ffhv implements ffji {
    int a;
    final /* synthetic */ wor b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public woq(wor worVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = worVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        Object b = this.b.f.b();
        b.getClass();
        wor worVar = this.b;
        ffhd a = ekxi.a((ffhd) b);
        wop wopVar = new wop(null, worVar);
        this.a = 1;
        Object a2 = ffra.a(a, wopVar, this);
        return a2 == ffhhVar ? ffhhVar : a2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new woq(this.b, (ffgu) obj).b(ffcu.a);
    }
}
