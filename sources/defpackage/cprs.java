package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cprs extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cprv b;
    final /* synthetic */ esqu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cprs(cprv cprvVar, esqu esquVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cprvVar;
        this.c = esquVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cprs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cprv cprvVar = this.b;
        esqu esquVar = this.c;
        this.a = 1;
        Object c = cprvVar.a.c(esquVar, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cprs(this.b, this.c, ffguVar);
    }
}
