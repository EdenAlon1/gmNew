package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmgd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cmgg b;
    final /* synthetic */ djrm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmgd(cmgg cmggVar, djrm djrmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cmggVar;
        this.c = djrmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmgd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cmgg cmggVar = this.b;
            final djrm djrmVar = this.c;
            ffji ffjiVar = new ffji() { // from class: cmgc
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    cmgj cmgjVar = (cmgj) ((cmgn) obj2).toBuilder();
                    String str = djrn.a(djrm.this).a;
                    cmgjVar.copyOnWrite();
                    ((cmgn) cmgjVar.instance).a().remove(str);
                    eyfy build = cmgjVar.build();
                    build.getClass();
                    return (cmgn) build;
                }
            };
            this.a = 1;
            if (cmggVar.c.d(ffjiVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cmgd(this.b, this.c, ffguVar);
    }
}
