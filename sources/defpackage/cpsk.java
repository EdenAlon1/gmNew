package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpsk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cpsm b;
    final /* synthetic */ fccd c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpsk(ffgu ffguVar, cpsm cpsmVar, fccd fccdVar) {
        super(2, ffguVar);
        this.b = cpsmVar;
        this.c = fccdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpsk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        fccd fccdVar = this.c;
        this.a = 1;
        Object w = essz.w(cpsmVar, fccdVar, this);
        return w == ffhhVar ? ffhhVar : w;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cpsk cpskVar = new cpsk(ffguVar, this.b, this.c);
        cpskVar.d = obj;
        return cpskVar;
    }
}
