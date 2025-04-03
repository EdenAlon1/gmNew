package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bznk implements bzme {
    public static final entd b = entd.c("BugleGDitto");
    public static final Map c = ffew.g(new ffcf(bzlz.ERROR_USER_CANCELED_VERIFICATION, cgvo.c), new ffcf(bzlz.ERROR_NOT_ME, cgvo.e), new ffcf(bzlz.ERROR_USER_CANCELED_VERIFICATION_FROM_DITTO, cgvo.d));
    public final ffsk d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ejvp i;
    public final ffbr j;
    public final ffbr k;
    public final aslr l;
    public final ffbr m;
    public final fazb n;
    public final fflx o;
    public final AtomicBoolean p;
    private final ffhd q;
    private final ffsk r;
    private final ffbr s;
    private final ffbr t;
    private final ffbz u;
    private final AtomicReference v;
    private final AtomicInteger w;
    private final AtomicReference x;

    public bznk(ffsk ffskVar, ffhd ffhdVar, ffsk ffskVar2, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ejvp ejvpVar, ffbr ffbrVar5, ffbr ffbrVar6, aslr aslrVar, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, fazb fazbVar) {
        ffskVar.getClass();
        ffhdVar.getClass();
        ffskVar2.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ejvpVar.getClass();
        ffbrVar6.getClass();
        aslrVar.getClass();
        ffbrVar7.getClass();
        ffbrVar8.getClass();
        ffbrVar9.getClass();
        fazbVar.getClass();
        this.d = ffskVar;
        this.q = ffhdVar;
        this.r = ffskVar2;
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.h = ffbrVar4;
        this.i = ejvpVar;
        this.j = ffbrVar5;
        this.k = ffbrVar6;
        this.l = aslrVar;
        this.s = ffbrVar7;
        this.t = ffbrVar8;
        this.m = ffbrVar9;
        this.n = fazbVar;
        this.u = ffca.a(new ffix() { // from class: bzmf
            @Override // defpackage.ffix
            public final Object invoke() {
                efbd.b();
                comy comyVar = (comy) bznk.this.g.b();
                comu c2 = comv.c();
                c2.d(comb.GAIA_PAIRING_VERIFICATION_KEY);
                c2.f(bzma.a);
                return comyVar.a(c2.a());
            }
        });
        this.o = ffly.a;
        this.v = new AtomicReference();
        this.w = new AtomicInteger(0);
        this.p = new AtomicBoolean(false);
        this.x = new AtomicReference();
    }

    public static final boolean r(bzlz bzlzVar) {
        return c.containsKey(bzlzVar);
    }

    @Override // defpackage.bzme
    public final ejxi a() {
        return new bzmn(this);
    }

    @Override // defpackage.bzme
    public final elfl b() {
        elfl c2;
        c2 = axol.c(this.d, ffhe.a, ffsm.a, new bzmh(this, null));
        return c2;
    }

    @Override // defpackage.bzme
    public final elfl c() {
        elfl c2;
        c2 = axol.c(this.d, ffhe.a, ffsm.a, new bzmi(this, null));
        return c2;
    }

    @Override // defpackage.bzme
    public final elfl d() {
        elfl c2;
        c2 = axol.c(this.d, ffhe.a, ffsm.a, new bzmo(this, null));
        return c2;
    }

    @Override // defpackage.bzme
    public final elfl e() {
        elfl c2;
        c2 = axol.c(this.d, ffhe.a, ffsm.a, new bzmp(this, null));
        return c2;
    }

    @Override // defpackage.bzme
    public final elfl f() {
        elfl c2;
        c2 = axol.c(this.d, ffhe.a, ffsm.a, new bzmr(this, null));
        return c2;
    }

    @Override // defpackage.bzme
    public final elfl g(bzlz bzlzVar) {
        elfl c2;
        bzlzVar.getClass();
        c2 = axol.c(this.d, ffhe.a, ffsm.a, new bzmv(this, bzlzVar, null));
        this.i.a(c2, bzmc.a);
        return c2;
    }

    @Override // defpackage.bzme
    public final elfl h(String str) {
        elfl c2;
        c2 = axol.c(this.d, ffhe.a, ffsm.a, new bzmx(this, str, null));
        this.i.a(c2, bzmc.a);
        return c2;
    }

    @Override // defpackage.bzme
    public final void i(String str, String str2, String str3, String str4) {
        elfl c2;
        bzlp bzlpVar = (bzlp) bzlq.a.createBuilder();
        bzlpVar.getClass();
        bzlpVar.copyOnWrite();
        ((bzlq) bzlpVar.instance).b = str;
        bzlpVar.copyOnWrite();
        ((bzlq) bzlpVar.instance).c = str2;
        bzlpVar.copyOnWrite();
        ((bzlq) bzlpVar.instance).d = str3;
        bzlpVar.copyOnWrite();
        ((bzlq) bzlpVar.instance).e = str4;
        eyfy build = bzlpVar.build();
        build.getClass();
        c2 = axol.c(this.d, ffhe.a, ffsm.a, new bzmt(this, (bzlq) build, null));
        this.i.a(c2, bzmc.a);
    }

    @Override // defpackage.bzme
    public final void j(String str) {
        elfl c2;
        str.getClass();
        c2 = axol.c(this.d, ffhe.a, ffsm.a, new bzmz(str, this, null));
        this.i.a(c2, bzmc.a);
    }

    @Override // defpackage.bzme
    public final void k() {
        ffud ffudVar = (ffud) this.x.get();
        if (ffudVar != null) {
            ffudVar.t(null);
        }
        b.n().q("Start to block user interaction.");
        this.x.set(axol.k(this.r, null, new bznc(this, null), 3));
    }

    @Override // defpackage.bzme
    public final elfl l(long j, int i, int i2, int i3) {
        elfl c2;
        if (i3 == 0) {
            throw null;
        }
        c2 = axol.c(this.d, ffhe.a, ffsm.a, new bznb(this, j, i, i2, i3, null));
        this.i.a(c2, bzmc.a);
        return c2;
    }

    @Override // defpackage.bzme
    public final void m(int i, int i2) {
        axol.c(this.d, ffhe.a, ffsm.a, new bznj(this, i, i2, null));
    }

    public final comc n() {
        return (comc) this.u.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.bzmk
            if (r0 == 0) goto L13
            r0 = r6
            bzmk r0 = (defpackage.bzmk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bzmk r0 = new bzmk
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.ffci.b(r6)
            ffhd r6 = r5.q
            ffhd r6 = defpackage.ekxi.a(r6)
            bzmj r2 = new bzmj
            r4 = 0
            r2.<init>(r4, r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.ffra.a(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bznk.o(ffgu):java.lang.Object");
    }

    public final String p() {
        fflx fflxVar = this.o;
        return fflxVar.f(9) + " " + fflxVar.f(9) + " " + fflxVar.f(9);
    }

    public final void q() {
        this.w.set(0);
        this.p.set(false);
        ffud ffudVar = (ffud) this.v.get();
        if (ffudVar != null) {
            ffudVar.t(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(final int r10, final int r11, defpackage.ffgu r12) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bznk.s(int, int, ffgu):java.lang.Object");
    }
}
