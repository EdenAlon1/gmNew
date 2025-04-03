package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cprw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cpry b;
    final /* synthetic */ esro c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cprw(cpry cpryVar, esro esroVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cpryVar;
        this.c = esroVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cprw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cpry cpryVar = this.b;
            esro esroVar = this.c;
            this.a = 1;
            if (cpryVar.a.h(esroVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cprw(this.b, this.c, ffguVar);
    }
}
