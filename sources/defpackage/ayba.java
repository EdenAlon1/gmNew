package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayba extends ceut {
    public static final entd a = entd.c("BugleContacts");
    public final comc b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final cbwj h;
    private final ffsk i;
    private final ffhd j;
    private final ffbr k;

    public ayba(ffsk ffskVar, ffhd ffhdVar, cbwj cbwjVar, comc comcVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6) {
        ffskVar.getClass();
        ffhdVar.getClass();
        cbwjVar.getClass();
        comcVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        this.i = ffskVar;
        this.j = ffhdVar;
        this.h = cbwjVar;
        this.b = comcVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = ffbrVar4;
        this.k = ffbrVar5;
        this.g = ffbrVar6;
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
        return eleg.f("ScheduleDeleteAndImportContactsHandler");
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
        c = axol.c(this.i, ffhe.a, ffsm.a, new ayaz(this, ceuwVar, null));
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065 A[LOOP:0: B:11:0x005f->B:13:0x0065, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.ffgu r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.ayay
            if (r0 == 0) goto L13
            r0 = r7
            ayay r0 = (defpackage.ayay) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ayay r0 = new ayay
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r0 = r0.a
            defpackage.ffci.b(r7)
            goto L50
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            defpackage.ffci.b(r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            ffhd r2 = r6.j
            ffhd r2 = defpackage.ekxi.a(r2)
            ayax r4 = new ayax
            r5 = 0
            r4.<init>(r5, r6, r7)
            r0.a = r7
            r0.d = r3
            java.lang.Object r0 = defpackage.ffra.a(r2, r4, r0)
            if (r0 == r1) goto L89
            r0 = r7
        L50:
            java.util.ArrayList r7 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.ffdx.n(r0, r1)
            r7.<init>(r1)
            java.util.Iterator r1 = r0.iterator()
        L5f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            axzo r2 = (defpackage.axzo) r2
            int r3 = r0.size()
            r2.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r4 = r2.instance
            axzp r4 = (defpackage.axzp) r4
            axzp r5 = defpackage.axzp.a
            r4.d = r3
            eyfy r2 = r2.build()
            axzp r2 = (defpackage.axzp) r2
            r7.add(r2)
            goto L5f
        L84:
            engw r7 = defpackage.engq.a(r7)
            return r7
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayba.k(ffgu):java.lang.Object");
    }

    public final void l() {
        Object b = this.d.b();
        b.getClass();
        axuo.a((akzt) b, 5);
    }

    public final void m() {
        ((ecrj) this.e.b()).g(axup.g, null, null, ecrh.ERROR);
        ((ecrj) this.e.b()).g(axup.h, null, null, ecrh.ERROR);
        ((azei) this.k.b()).d(new Consumer() { // from class: ayaw
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                axzy axzyVar = (axzy) obj;
                entd entdVar = ayba.a;
                axzyVar.getClass();
                axzyVar.b();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
