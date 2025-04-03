package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gng extends ffhv implements ffjn {
    /* synthetic */ long a;
    final /* synthetic */ gnn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gng(gnn gnnVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.b = gnnVar;
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        long j = ((iak) obj2).a;
        gng gngVar = new gng(this.b, (ffgu) obj3);
        gngVar.a = j;
        return gngVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        long j = this.a;
        gnn gnnVar = this.b;
        gnnVar.j((gnnVar.e == dqs.a ? iak.c(j) : gnnVar.d ? gnnVar.g() - iak.b(j) : iak.b(j)) - gnnVar.c());
        return ffcu.a;
    }
}
