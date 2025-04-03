package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlix extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dliy b;
    final /* synthetic */ ffji c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlix(dliy dliyVar, ffji ffjiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dliyVar;
        this.c = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlix) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            final dliy dliyVar = this.b;
            final ffji ffjiVar = this.c;
            ffji ffjiVar2 = new ffji() { // from class: dliw
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    dlic dlicVar = (dlic) obj2;
                    ffji.this.invoke(dlicVar);
                    eyja d = eykm.d(dliyVar.m());
                    dlicVar.copyOnWrite();
                    dlid dlidVar = (dlid) dlicVar.instance;
                    dlid dlidVar2 = dlid.a;
                    d.getClass();
                    dlidVar.e = d;
                    dlidVar.b |= 4;
                    return ffcu.a;
                }
            };
            this.a = 1;
            if (dliyVar.y(ffjiVar2, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dlix(this.b, this.c, ffguVar);
    }
}
