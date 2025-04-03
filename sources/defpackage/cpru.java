package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpru extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cprv b;
    final /* synthetic */ esqu c;
    final /* synthetic */ esrc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpru(cprv cprvVar, esqu esquVar, esrc esrcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cprvVar;
        this.c = esquVar;
        this.d = esrcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpru) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cprv cprvVar = this.b;
            esqu esquVar = this.c;
            esrc esrcVar = this.d;
            this.a = 1;
            if (cprvVar.a.g(esquVar, esrcVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cpru(this.b, this.c, this.d, ffguVar);
    }
}
