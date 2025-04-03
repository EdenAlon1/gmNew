package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cokk implements coke {
    public static final cskc a = cskc.g("BugleSearch", "SearchDataServiceImpl");
    public final cqoh b;
    private final effy c;
    private final errl d;
    private final ffbr e;

    public cokk(effy effyVar, errl errlVar, cqoh cqohVar, ffbr ffbrVar) {
        this.c = effyVar;
        this.d = errlVar;
        this.b = cqohVar;
        this.e = ffbrVar;
    }

    @Override // defpackage.coke
    public final elfl a() {
        return !((avem) this.e.b()).a() ? elfo.e(Instant.ofEpochMilli(0L)) : elfl.g(this.c.a()).h(new emwl() { // from class: cokf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                eyja eyjaVar = ((cokc) obj).d;
                if (eyjaVar == null) {
                    eyjaVar = eyja.a;
                }
                return eykj.d(eyjaVar);
            }
        }, this.d);
    }

    @Override // defpackage.coke
    public final elfl b() {
        return elfl.g(this.c.a()).h(new emwl() { // from class: cokg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Long.valueOf(((cokc) obj).c);
            }
        }, this.d);
    }

    @Override // defpackage.coke
    public final void c() {
        if (((avem) this.e.b()).a()) {
            axnw.h(elfl.g(this.c.b(new emwl() { // from class: coki
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    cokb cokbVar = (cokb) ((cokc) obj).toBuilder();
                    eyja b = eykj.b(cokk.this.b.f());
                    cokbVar.copyOnWrite();
                    cokc cokcVar = (cokc) cokbVar.instance;
                    b.getClass();
                    cokcVar.d = b;
                    cokcVar.b |= 32;
                    return (cokc) cokbVar.build();
                }
            }, erpp.a)));
        }
    }

    @Override // defpackage.coke
    public final void d() {
        elfl.g(this.c.b(new emwl() { // from class: cokh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cokb cokbVar = (cokb) ((cokc) obj).toBuilder();
                long epochMilli = cokk.this.b.f().toEpochMilli();
                cokbVar.copyOnWrite();
                cokc cokcVar = (cokc) cokbVar.instance;
                cokcVar.b |= 16;
                cokcVar.c = epochMilli;
                return (cokc) cokbVar.build();
            }
        }, erpp.a)).k(axou.a(new cokj()), this.d);
    }
}
