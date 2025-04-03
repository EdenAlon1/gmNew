package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cprx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cpry b;
    final /* synthetic */ esqf c;
    final /* synthetic */ esro d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cprx(cpry cpryVar, esqf esqfVar, esro esroVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cpryVar;
        this.c = esqfVar;
        this.d = esroVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cprx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cpry cpryVar = this.b;
        esqf esqfVar = this.c;
        esro esroVar = this.d;
        this.a = 1;
        Object i2 = cpryVar.a.i(esqfVar, esroVar, this);
        return i2 == ffhhVar ? ffhhVar : i2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cprx(this.b, this.c, this.d, ffguVar);
    }
}
