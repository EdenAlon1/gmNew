package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqni extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dqnj b;
    final /* synthetic */ dqrp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqni(dqnj dqnjVar, dqrp dqrpVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dqnjVar;
        this.c = dqrpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqni) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dqnj dqnjVar = this.b;
            dqrp dqrpVar = this.c;
            this.a = 1;
            if (dqnjVar.c.b(dqrpVar.a, dqrpVar.b, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqni(this.b, this.c, ffguVar);
    }
}
