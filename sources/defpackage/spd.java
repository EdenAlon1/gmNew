package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spd extends ffhv implements ffjm {
    final /* synthetic */ spw a;
    final /* synthetic */ dfjg b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spd(ffgu ffguVar, spw spwVar, dfjg dfjgVar) {
        super(2, ffguVar);
        this.a = spwVar;
        this.b = dfjgVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((spd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        dfix dfixVar = this.b.b;
        if (dfixVar == null) {
            dfixVar = dfix.a;
        }
        dfjy dfjyVar = dfixVar.c == 3 ? (dfjy) dfixVar.d : dfjy.a;
        return Boolean.valueOf(snw.c(new Long((dfjyVar.c == 2 ? (dfjw) dfjyVar.d : dfjw.a).c)));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        spd spdVar = new spd(ffguVar, this.a, this.b);
        spdVar.c = obj;
        return spdVar;
    }
}
