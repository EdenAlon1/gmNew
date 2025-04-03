package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpsl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cpsm b;
    final /* synthetic */ fbzv c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpsl(ffgu ffguVar, cpsm cpsmVar, fbzv fbzvVar) {
        super(2, ffguVar);
        this.b = cpsmVar;
        this.c = fbzvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpsl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cpsm cpsmVar = this.b;
        fbzv fbzvVar = this.c;
        this.a = 1;
        Object x = essz.x(cpsmVar, fbzvVar, this);
        return x == ffhhVar ? ffhhVar : x;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cpsl cpslVar = new cpsl(ffguVar, this.b, this.c);
        cpslVar.d = obj;
        return cpslVar;
    }
}
