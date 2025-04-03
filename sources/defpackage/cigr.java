package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cigr implements cifg {
    public final cgzv a;
    public final ffbr b;

    public cigr(cgzv cgzvVar, ffbr ffbrVar) {
        this.a = cgzvVar;
        this.b = ffbrVar;
    }

    @Override // defpackage.cifg
    public final /* synthetic */ elfl a(ciff ciffVar) {
        return cife.a(this, ciffVar);
    }

    @Override // defpackage.cifg
    public final /* synthetic */ elfl b(final ciff ciffVar, final eyhs eyhsVar) {
        return elfo.g(new Callable() { // from class: ciga
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cigr cigrVar = cigr.this;
                boolean a = ((cgcu) cigrVar.b.b()).a();
                ciff ciffVar2 = ciffVar;
                fcek fcekVar = a ? ((cibs) ciffVar2).c.d : ((cibs) ciffVar2).b;
                ervi erviVar = ((cibs) ciffVar2).a;
                esaa b = esaa.b(erviVar.c);
                if (b == null) {
                    b = esaa.UNRECOGNIZED;
                }
                csjy.o("BugleNetwork", "Unexpected ditto request type: %s %s", b, cigrVar.a.z(erviVar.b, fcekVar));
                return esdg.a;
            }
        }, ((cibs) ciffVar).d);
    }

    @Override // defpackage.cifg
    public final /* synthetic */ eyhs c(eyee eyeeVar) {
        return esdg.a;
    }
}
