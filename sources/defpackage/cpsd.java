package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpsd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cpsm b;
    final /* synthetic */ fchc c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpsd(ffgu ffguVar, cpsm cpsmVar, fchc fchcVar) {
        super(2, ffguVar);
        this.b = cpsmVar;
        this.c = fchcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpsd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        fchc fchcVar = this.c;
        this.a = 1;
        Object p = essz.p(cpsmVar, fchcVar, this);
        return p == ffhhVar ? ffhhVar : p;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cpsd cpsdVar = new cpsd(ffguVar, this.b, this.c);
        cpsdVar.d = obj;
        return cpsdVar;
    }
}
