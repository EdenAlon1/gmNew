package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccxx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ccxy b;
    final /* synthetic */ eszz c;
    final /* synthetic */ ccvl d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccxx(ffgu ffguVar, ccxy ccxyVar, eszz eszzVar, ccvl ccvlVar) {
        super(2, ffguVar);
        this.b = ccxyVar;
        this.c = eszzVar;
        this.d = ccvlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccxx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object a;
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                elfl V = this.b.c.V(this.c, ccxy.a, ccxy.b, csfx.b(this.d.c));
                this.a = 1;
                obj = fgfz.c(V, this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            String str = ((eszz) obj).c;
            str.getClass();
            a = new ccvp(str);
        } catch (Throwable th) {
            a = ffci.a(th);
        }
        return new ffch(a);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ccxx ccxxVar = new ccxx(ffguVar, this.b, this.c, this.d);
        ccxxVar.e = obj;
        return ccxxVar;
    }
}
