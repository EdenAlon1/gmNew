package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjfg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjfw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjfg(cjfw cjfwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cjfwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjfg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cjfw cjfwVar = this.b;
            cjff cjffVar = new cjff(null);
            this.a = 1;
            if (cjfwVar.d.a(cjffVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cjfg(this.b, ffguVar);
    }
}
