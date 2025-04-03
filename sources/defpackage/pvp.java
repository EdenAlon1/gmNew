package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pvp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ pvn b;
    final /* synthetic */ pyj c;
    final /* synthetic */ pvi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvp(pvn pvnVar, pyj pyjVar, pvi pviVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = pvnVar;
        this.c = pyjVar;
        this.d = pviVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((pvp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            pvn pvnVar = this.b;
            pyj pyjVar = this.c;
            pvi pviVar = this.d;
            ffxx a = pvnVar.a(pyjVar);
            pvo pvoVar = new pvo(pviVar, pyjVar);
            this.a = 1;
            if (a.a(pvoVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new pvp(this.b, this.c, this.d, ffguVar);
    }
}
