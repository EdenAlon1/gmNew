package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccuw extends ffhv implements ffjm {
    final /* synthetic */ ccvj a;
    final /* synthetic */ boolean b;
    final /* synthetic */ csgr c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccuw(ffgu ffguVar, ccvj ccvjVar, boolean z, csgr csgrVar) {
        super(2, ffguVar);
        this.a = ccvjVar;
        this.b = z;
        this.c = csgrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccuw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        bqvj c = ((cryg) this.a.a.b()).c(1);
        if (c == null) {
            crvu crvuVar = new crvu("No encryption key available");
            csgs.a(crvuVar, this.c);
            throw crvuVar;
        }
        String o = c.o();
        if (o == null || o.length() == 0) {
            throw new csgv("Missing cms_encryption key dependency", engw.r(new csgn(String.valueOf(c.k()), 5)));
        }
        return c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ccuw ccuwVar = new ccuw(ffguVar, this.a, this.b, this.c);
        ccuwVar.d = obj;
        return ccuwVar;
    }
}
