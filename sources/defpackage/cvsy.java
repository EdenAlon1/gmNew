package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvsy implements cvsk {
    public final Optional a;
    public final cwis b;
    public final cwav c;
    public final cvvb d;
    public final cvuf e;
    public final cwdv f;
    private final ffsk g;
    private final cvyf h;
    private final cvuw i;
    private final cvwe j;
    private final cvvt k;
    private final ffbr l;
    private final ffbr m;
    private final ffbr n;
    private final ffbr o;
    private final auvx p;
    private final ffxx q;
    private final fgdj r;
    private final fgdj s;

    public cvsy(ffsk ffskVar, cvyf cvyfVar, cvvb cvvbVar, cvuf cvufVar, Optional optional, cvuw cvuwVar, cwdv cwdvVar, cwis cwisVar, cvwe cvweVar, cvvt cvvtVar, cwav cwavVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, auvx auvxVar) {
        ffskVar.getClass();
        cvyfVar.getClass();
        cvufVar.getClass();
        cvuwVar.getClass();
        cwdvVar.getClass();
        cwisVar.getClass();
        cvweVar.getClass();
        cvvtVar.getClass();
        cwavVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        this.g = ffskVar;
        this.h = cvyfVar;
        this.d = cvvbVar;
        this.e = cvufVar;
        this.a = optional;
        this.i = cvuwVar;
        this.f = cwdvVar;
        this.b = cwisVar;
        this.j = cvweVar;
        this.k = cvvtVar;
        this.c = cwavVar;
        this.l = ffbrVar;
        this.m = ffbrVar2;
        this.n = ffbrVar3;
        this.o = ffbrVar4;
        this.p = auvxVar;
        Object e = cvqt.e.e();
        e.getClass();
        int intValue = ((Number) e).intValue();
        Object e2 = cvqt.d.e();
        e2.getClass();
        int intValue2 = ((Number) e2).intValue();
        Object e3 = cvqt.f.e();
        e3.getClass();
        this.q = new fgch(odg.a(new ojc(new ojd(intValue, ((Number) e3).intValue(), false, intValue2, 0, 0, 52), new ffix() { // from class: cvsl
            @Override // defpackage.ffix
            public final Object invoke() {
                return cvsy.this.d.a();
            }
        }).a, ffskVar), cwisVar.a(), new cvsp(this, null));
        cvsx cvsxVar = new cvsx(cwisVar.a(), this);
        int i = fgcz.a;
        this.r = fgbn.b(cvsxVar, ffskVar, fgcy.a(0L, 3), new cvuc(null, 7));
        this.s = fgbn.b(new fgch(cwisVar.a(), ((cvwx) ffbrVar3.b()).a(), new cvsq(this, null)), ffskVar, fgcy.a(0L, 3), new cvuc(null, 7));
    }

    /* JADX WARN: Type inference failed for: r2v22, types: [cvvd, java.lang.Object] */
    @Override // defpackage.cvsk
    public final cvsj a() {
        fgdj a;
        fgdj a2 = this.h.a();
        fgdj fgdjVar = ((attl) this.o.b()).a() ? this.s : this.r;
        cvvt cvvtVar = this.k;
        Optional optional = this.a;
        fgdj a3 = cvvtVar.a();
        optional.isPresent();
        if (!((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue()) {
            a = fgdm.a(null);
        } else if (((attl) this.o.b()).a()) {
            fgdj a4 = ((cvwx) this.n.b()).a();
            cvsu cvsuVar = new cvsu(null, this);
            int i = fgau.a;
            fgen fgenVar = new fgen(cvsuVar, a4);
            ffsk ffskVar = this.g;
            int i2 = fgcz.a;
            a = fgbn.b(fgenVar, ffskVar, fgcy.a(0L, 3), null);
        } else {
            a = this.a.get().a();
        }
        return new cvsj(a2, this.q, this.i.a, fgdjVar, a3, a, ((cwft) this.l.b()).a(), new cvsr(this.j), new cvss(this), new cvst(this.c), new cvsi(((auvr) this.m.b()).a(), ((ersq) ((auvo) this.p).a.b()).a("bugle.hide_keyboard_on_start_chat_scroll")));
    }

    public final cvuc b(cwir cwirVar) {
        return cwirVar.d.ordinal() != 0 ? new cvuc(cwirVar.d, 6) : new cvuc(cwirVar.d, new ffix() { // from class: cvsm
            @Override // defpackage.ffix
            public final Object invoke() {
                cwav cwavVar = cvsy.this.c;
                cwavVar.b.d(2, cwavVar.f);
                return ffcu.a;
            }
        }, new ffix() { // from class: cvsn
            @Override // defpackage.ffix
            public final Object invoke() {
                cvsy cvsyVar = cvsy.this;
                cvsyVar.b.d(cwjb.b);
                cwav cwavVar = cvsyVar.c;
                twk.e(cwavVar.b, 3, 0, cwavVar.f, 10);
                return ffcu.a;
            }
        });
    }
}
