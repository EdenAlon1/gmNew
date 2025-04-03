package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqtu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dqtz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqtu(dqtz dqtzVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dqtzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqtu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffkx ffkxVar = new ffkx();
            dqtz dqtzVar = this.b;
            dqiy a = dqtzVar.a();
            dqgm dqgmVar = dqtz.e(dqtzVar).g;
            if (dqgmVar == null) {
                dqgmVar = dslv.aI;
            }
            fgdj c = a.c(dqgmVar);
            dqtt dqttVar = new dqtt(this.b, ffkxVar);
            this.a = 1;
            if (c.a(dqttVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        throw new ffbx();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqtu(this.b, ffguVar);
    }
}
