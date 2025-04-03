package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjfs extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjfw b;
    final /* synthetic */ eisx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjfs(cjfw cjfwVar, eisx eisxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cjfwVar;
        this.c = eisxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjfs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cjfw cjfwVar = this.b;
            cjfr cjfrVar = new cjfr(this.c, null);
            this.a = 1;
            if (cjfwVar.d.a(cjfrVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cjfs(this.b, this.c, ffguVar);
    }
}
