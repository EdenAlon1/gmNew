package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abpc extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ abpd c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abpc(ffgu ffguVar, abpd abpdVar) {
        super(3, ffguVar);
        this.c = abpdVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        abpc abpcVar = new abpc((ffgu) obj3, this.c);
        abpcVar.d = (ffxy) obj;
        abpcVar.b = obj2;
        return abpcVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffxx a;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r13 = this.d;
            ((Boolean) this.b).booleanValue();
            abpg abpgVar = this.c.a;
            elfl s = ((alye) abpgVar.c.b()).s(engw.r(appn.a));
            s.getClass();
            axol.n(s);
            ffxx a2 = axrb.a(axol.f(s), "Images");
            elfl s2 = ((alye) abpgVar.c.b()).s(engw.r(appn.d));
            s2.getClass();
            axol.n(s2);
            ffxx a3 = axrb.a(axol.f(s2), "Videos");
            elfl s3 = ((alye) abpgVar.c.b()).s(engw.r(appn.c));
            s3.getClass();
            axol.n(s3);
            ffxx a4 = axrb.a(axol.f(s3), "Locations");
            elfl s4 = ((alye) abpgVar.c.b()).s(engw.r(appn.b));
            s4.getClass();
            axol.n(s4);
            ffxx a5 = axrb.a(axol.f(s4), "Links");
            ffxx a6 = axrb.a(new fgcp(new abpi(abpgVar.d, null)), "TooltipEligible");
            a = abpgVar.e.a(zpf.b);
            ffxx e = axsp.e(a2, a3, a4, a5, a6, axrb.a(a, "IsScrolledPastThreshold"), abpgVar.b, new abpe(abpgVar, null));
            this.a = 1;
            if (ffyk.c(r13, e, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
