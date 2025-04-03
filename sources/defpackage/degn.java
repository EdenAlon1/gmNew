package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class degn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dego b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public degn(dego degoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = degoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((degn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            final dego degoVar = this.b;
            ffji ffjiVar = new ffji() { // from class: degm
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    degh deghVar = (degh) degi.a.createBuilder();
                    deghVar.getClass();
                    eyja a = cuxw.a(dego.this.b.f().toEpochMilli());
                    a.getClass();
                    deghVar.copyOnWrite();
                    degi degiVar = (degi) deghVar.instance;
                    degiVar.c = a;
                    degiVar.b |= 1;
                    return degk.a(deghVar);
                }
            };
            this.a = 1;
            obj = degoVar.a.d(ffjiVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return new cvhq(true != this.b.c((degi) obj) ? 2 : 1);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new degn(this.b, ffguVar);
    }
}
