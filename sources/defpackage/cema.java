package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cema extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cemb b;
    final /* synthetic */ etac c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cema(cemb cembVar, etac etacVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cembVar;
        this.c = etacVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cema) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return null;
        }
        cemb cembVar = this.b;
        etac etacVar = this.c;
        this.a = 1;
        int a = cembVar.a.a();
        cemc cemcVar = (cemc) cemd.a.createBuilder();
        cemcVar.getClass();
        ceme.b(a, cemcVar);
        ceme.c(etacVar.c, cemcVar);
        ceme.d(etacVar.d, cemcVar);
        ceme.f(cemcVar);
        eygr eygrVar = etacVar.f;
        eygrVar.getClass();
        ceme.e(eygrVar, cemcVar);
        cemd a2 = ceme.a(cemcVar);
        cetp cetpVar = new cetp();
        cetpVar.a = etacVar.c;
        Object c = fgfz.c(((cevh) cembVar.b.a.b()).b(ceyr.h("remove_to_be_delivered_label", a2, cetpVar.a())), this);
        if (c != ffhh.a) {
            c = ffcu.a;
        }
        if (c == obj2) {
            return obj2;
        }
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cema(this.b, this.c, ffguVar);
    }
}
