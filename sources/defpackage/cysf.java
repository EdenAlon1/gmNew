package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cysf extends ffhv implements ffjq {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ Object e;
    final /* synthetic */ cysj f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cysf(cysj cysjVar, ffgu ffguVar) {
        super(6, ffguVar);
        this.f = cysjVar;
    }

    @Override // defpackage.ffjq
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        cysf cysfVar = new cysf(this.f, (ffgu) obj6);
        cysfVar.a = (alxj) obj;
        cysfVar.b = (cyub) obj2;
        cysfVar.c = (cytm) obj3;
        cysfVar.d = (cytr) obj4;
        cysfVar.e = (dlsr) obj5;
        return cysfVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [alxj, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ?? r14 = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        Object obj4 = this.d;
        Object obj5 = this.e;
        ffix ffixVar = null;
        if (this.f.j.a() && r14.m()) {
            final cysj cysjVar = this.f;
            ffixVar = new ffix() { // from class: cyse
                @Override // defpackage.ffix
                public final Object invoke() {
                    cysj cysjVar2 = cysj.this;
                    axol.m(cysjVar2.a, new cysg(cysjVar2, null));
                    return ffcu.a;
                }
            };
        }
        cysj cysjVar2 = this.f;
        return new cysm((cytr) obj4, (cyub) obj2, (cytm) obj3, (dlsr) obj5, ffixVar, new cysl(false, cysjVar2.h.a(), cysjVar2.i.a(), cysjVar2.j.a()));
    }
}
