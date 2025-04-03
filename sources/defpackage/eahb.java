package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eahb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eahe b;
    final /* synthetic */ eagt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eahb(eahe eaheVar, eagt eagtVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eaheVar;
        this.c = eagtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eahb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            eahe eaheVar = this.b;
            easy s = this.c.s();
            this.a = 1;
            eaft eaftVar = (eaft) eaheVar.b;
            obj = ffra.a(eaftVar.c, new eafs(eaftVar, s, null), this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        eahe eaheVar2 = this.b;
        ((efkw) eaheVar2.c.x.get()).a(eaheVar2.a.getPackageName(), Boolean.valueOf(((eafl) obj).e()));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new eahb(this.b, this.c, ffguVar);
    }
}
