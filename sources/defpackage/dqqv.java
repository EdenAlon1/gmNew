package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqqv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dqqw b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqqv(dqqw dqqwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dqqwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqqv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffsk ffskVar = (ffsk) this.c;
            ffss[] ffssVarArr = {ffqy.c(ffskVar, null, new dqqs(this.b, null), 3), ffqy.c(ffskVar, null, new dqqt(this.b, null), 3), ffqy.c(ffskVar, null, new dqqu(this.b, null), 3)};
            this.a = 1;
            if (ffqv.b(ffssVarArr, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dqqv dqqvVar = new dqqv(this.b, ffguVar);
        dqqvVar.c = obj;
        return dqqvVar;
    }
}
