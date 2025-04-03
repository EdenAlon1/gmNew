package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czvs extends ffhv implements ffjm {
    int a;
    final /* synthetic */ czvw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czvs(czvw czvwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = czvwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((czvs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            czvw czvwVar = this.b;
            final ffji ffjiVar = new ffji() { // from class: czvq
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    czvx czvxVar = (czvx) ((czvy) obj2).toBuilder();
                    czvxVar.copyOnWrite();
                    czvy czvyVar = (czvy) czvxVar.instance;
                    czvyVar.b |= 1;
                    czvyVar.c = true;
                    return (czvy) czvxVar.build();
                }
            };
            elfl j = czvwVar.d.j(new emwl() { // from class: czvr
                @Override // defpackage.emwl
                public final Object apply(Object obj2) {
                    return ffji.this.invoke(obj2);
                }
            });
            this.a = 1;
            if (fgfz.c(j, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new czvs(this.b, ffguVar);
    }
}
