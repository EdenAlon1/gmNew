package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpse extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cpsm b;
    final /* synthetic */ fchg c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpse(ffgu ffguVar, cpsm cpsmVar, fchg fchgVar) {
        super(2, ffguVar);
        this.b = cpsmVar;
        this.c = fchgVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpse) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        fchg fchgVar = this.c;
        this.a = 1;
        Object q = essz.q(cpsmVar, fchgVar, this);
        return q == ffhhVar ? ffhhVar : q;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cpse cpseVar = new cpse(ffguVar, this.b, this.c);
        cpseVar.d = obj;
        return cpseVar;
    }
}
