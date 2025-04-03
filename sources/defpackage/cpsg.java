package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpsg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cpsm b;
    final /* synthetic */ fckw c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpsg(ffgu ffguVar, cpsm cpsmVar, fckw fckwVar) {
        super(2, ffguVar);
        this.b = cpsmVar;
        this.c = fckwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpsg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        fckw fckwVar = this.c;
        this.a = 1;
        Object s = essz.s(cpsmVar, fckwVar, this);
        return s == ffhhVar ? ffhhVar : s;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cpsg cpsgVar = new cpsg(ffguVar, this.b, this.c);
        cpsgVar.d = obj;
        return cpsgVar;
    }
}
