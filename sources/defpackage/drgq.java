package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drgq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ drgw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drgq(drgw drgwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = drgwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drgq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            drgw drgwVar = this.b;
            this.a = 1;
            if (drgwVar.c.i() == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new drgq(this.b, ffguVar);
    }
}
