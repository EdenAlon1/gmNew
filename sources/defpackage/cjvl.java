package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjvl {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    private final ffbr f;
    private final ffbr g;

    public cjvl(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7) {
        ffbrVar.getClass();
        this.f = ffbrVar;
        ffbrVar2.getClass();
        this.a = ffbrVar2;
        ffbrVar3.getClass();
        this.g = ffbrVar3;
        ffbrVar4.getClass();
        this.b = ffbrVar4;
        ffbrVar5.getClass();
        this.c = ffbrVar5;
        ffbrVar6.getClass();
        this.d = ffbrVar6;
        ffbrVar7.getClass();
        this.e = ffbrVar7;
    }

    public final cjvk a(final cjwc cjwcVar) {
        eyja eyjaVar;
        cjwcVar.getClass();
        ((asuk) this.g.b()).getClass();
        ctas ctasVar = (ctas) this.b.b();
        ctasVar.getClass();
        ffhd ffhdVar = (ffhd) this.c.b();
        ffhdVar.getClass();
        Long l = (Long) this.d.b();
        l.getClass();
        long longValue = l.longValue();
        Long l2 = (Long) this.e.b();
        l2.getClass();
        long longValue2 = l2.longValue();
        cjvw cjvwVar = cjwcVar.c;
        if (cjvwVar == null) {
            cjvwVar = cjvw.a;
        }
        cjvwVar.getClass();
        cjvt a = cjvs.a(cjvwVar);
        cjvz cjvzVar = cjwcVar.d;
        if (cjvzVar == null) {
            cjvzVar = cjvz.a;
        }
        cjvzVar.getClass();
        cjvu b = cjvs.b(cjvzVar);
        if ((cjwcVar.b & 1024) != 0) {
            eyjaVar = cjwcVar.j;
            if (eyjaVar == null) {
                eyjaVar = eyja.a;
            }
        } else {
            eyjaVar = null;
        }
        Instant d = eyjaVar != null ? eykn.d(eyjaVar) : null;
        ffbr ffbrVar = this.a;
        final ffbr ffbrVar2 = this.f;
        return new cjvk(a, b, d, cjwcVar.h, !cjwcVar.i, ffca.a(new ffix() { // from class: cjvh
            @Override // defpackage.ffix
            public final Object invoke() {
                cjwc cjwcVar2 = cjwc.this;
                cjwg cjwgVar = cjwcVar2.f;
                if (cjwgVar == null) {
                    cjwgVar = cjwg.a;
                }
                ffbr ffbrVar3 = ffbrVar2;
                if (cjwgVar.e) {
                    aolr aolrVar = (aolr) ffbrVar3.b();
                    cjwg cjwgVar2 = cjwcVar2.f;
                    if (cjwgVar2 == null) {
                        cjwgVar2 = cjwg.a;
                    }
                    return aolrVar.p(cjwgVar2.c);
                }
                aolr aolrVar2 = (aolr) ffbrVar3.b();
                cjwg cjwgVar3 = cjwcVar2.f;
                if (cjwgVar3 == null) {
                    cjwgVar3 = cjwg.a;
                }
                return aolrVar2.n(cjwgVar3.c);
            }
        }), ffbrVar, ctasVar, ffhdVar, longValue, longValue2);
    }
}
