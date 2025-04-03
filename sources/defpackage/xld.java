package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xld extends ffhv implements ffjo {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ xle d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xld(xle xleVar, ffgu ffguVar) {
        super(4, ffguVar);
        this.d = xleVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        xld xldVar = new xld(this.d, (ffgu) obj4);
        xldVar.a = (xis) obj;
        xldVar.b = (alxi) obj2;
        xldVar.c = (xlz) obj3;
        return xldVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a;
        return xle.a((alxi) this.b, (xis) obj2, (xlz) this.c);
    }
}
