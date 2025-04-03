package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayar extends ceut {
    public static final entd a = entd.c("BugleContacts");
    public final comc b;
    public final axzk c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final cbwj i;
    private final ffsk j;
    private final axwk k;
    private final aybz l;

    public ayar(ffsk ffskVar, cbwj cbwjVar, comc comcVar, axwk axwkVar, axzk axzkVar, aybz aybzVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        ffskVar.getClass();
        cbwjVar.getClass();
        comcVar.getClass();
        axwkVar.getClass();
        aybzVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        this.j = ffskVar;
        this.i = cbwjVar;
        this.b = comcVar;
        this.k = axwkVar;
        this.c = axzkVar;
        this.l = aybzVar;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
        this.h = ffbrVar5;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        Object e = axum.f.e();
        e.getClass();
        l.c(((Number) e).intValue());
        l.f(poa.EXPONENTIAL);
        Object e2 = axum.g.e();
        e2.getClass();
        l.g(((Number) e2).longValue());
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("ScheduleContactsImportHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        eyhz parserForType = eyex.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl c;
        ((eyex) eyhsVar).getClass();
        c = axol.c(this.j, ffhe.a, ffsm.a, new ayaq(this, ceuwVar, null));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.ffgu r9) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayar.k(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ayao
            if (r0 == 0) goto L13
            r0 = r6
            ayao r0 = (defpackage.ayao) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ayao r0 = new ayao
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ayar r0 = r0.d
            defpackage.ffci.b(r6)
            goto L50
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            defpackage.ffci.b(r6)
            comc r6 = r5.b
            ayal r2 = new ayal
            r2.<init>()
            ayam r4 = new ayam
            r4.<init>()
            elfl r6 = r6.j(r4)
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = defpackage.fgfz.c(r6, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            r0 = r5
        L50:
            aybz r6 = r0.l
            r6.b()
            ffcu r6 = defpackage.ffcu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayar.l(ffgu):java.lang.Object");
    }

    public final void m() {
        ((alrv) this.d.b()).g(axup.g, ecrh.ERROR);
        ((alrv) this.d.b()).g(axup.h, ecrh.ERROR);
        ((azei) this.h.b()).d(new Consumer() { // from class: ayai
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                axzy axzyVar = (axzy) obj;
                entd entdVar = ayar.a;
                axzyVar.getClass();
                axzyVar.b();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
