package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbeg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dbed b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbeg(ffgu ffguVar, dbed dbedVar) {
        super(2, ffguVar);
        this.b = dbedVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbeg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        elfl a = this.b.b.a();
        this.a = 1;
        Object c = fgfz.c(a, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dbeg dbegVar = new dbeg(ffguVar, this.b);
        dbegVar.c = obj;
        return dbegVar;
    }
}
