package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccxn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ccxy b;
    final /* synthetic */ String c;
    final /* synthetic */ ccvl d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccxn(ffgu ffguVar, ccxy ccxyVar, String str, ccvl ccvlVar) {
        super(2, ffguVar);
        this.b = ccxyVar;
        this.c = str;
        this.d = ccvlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccxn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
                elfl g = this.b.c.g(this.c, csfx.b(this.d.c));
                this.a = 1;
                obj = fgfz.c(g, this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            a = new ccvn(this.c, !((Boolean) obj).booleanValue());
        } catch (Throwable th) {
            a = ffci.a(th);
        }
        return new ffch(a);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ccxn ccxnVar = new ccxn(ffguVar, this.b, this.c, this.d);
        ccxnVar.e = obj;
        return ccxnVar;
    }
}
