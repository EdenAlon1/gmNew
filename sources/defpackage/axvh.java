package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axvh implements cnjs, cnjx, cnjv {
    public static final entd a = entd.c("BugleContacts");
    public final ffsk b;
    public final ffbr c;
    public final ctvs d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final AtomicBoolean h;
    private final ffbr i;
    private final ffbr j;
    private final ffbr k;
    private final ffbr l;
    private final ffbr m;
    private final ffbr n;

    public axvh(ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ctvs ctvsVar, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10) {
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ctvsVar.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar7.getClass();
        ffbrVar10.getClass();
        this.b = ffskVar;
        this.i = ffbrVar;
        this.j = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ctvsVar;
        this.k = ffbrVar4;
        this.e = ffbrVar5;
        this.l = ffbrVar6;
        this.f = ffbrVar7;
        this.m = ffbrVar8;
        this.n = ffbrVar9;
        this.g = ffbrVar10;
        this.h = new AtomicBoolean(false);
    }

    @Override // defpackage.cnjs
    public final void a() {
        axol.k(this.b, null, new axvb(this, null), 3);
    }

    @Override // defpackage.cnjx
    public final void b() {
        axol.k(this.b, null, new axve(this, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0126, code lost:
    
        if (r13 != r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0180, code lost:
    
        if (r12.b(r0) == r1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01ac, code lost:
    
        if (r12.b(r0) == r1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d4, code lost:
    
        if (r13 != r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f7, code lost:
    
        if (r13 == r1) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(boolean r12, defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axvh.c(boolean, ffgu):java.lang.Object");
    }

    public final Object d(ffgu ffguVar) {
        if (((axun) this.k.b()).a()) {
            ejoe n = ejoi.n(axus.class);
            n.g(new ejnx("ContactsSyncPeriodicImportScheduler", poz.UPDATE));
            poh pohVar = new poh();
            pohVar.a = true;
            n.d(pohVar.a());
            Object b = this.l.b();
            b.getClass();
            n.e(new ejnv(new ejnw(((Number) b).longValue(), TimeUnit.HOURS), emux.a));
            ejoi h = n.h();
            ((ensz) a.h()).q("Enqueueing periodic contacts import work.");
            Object c = fgfz.c(((ejoc) this.e.b()).c(h), ffguVar);
            if (c == ffhh.a) {
                return c;
            }
        }
        return ffcu.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b0, code lost:
    
        if (defpackage.fgfz.c(r9, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ffgu r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.axvg
            if (r0 == 0) goto L13
            r0 = r9
            axvg r0 = (defpackage.axvg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            axvg r0 = new axvg
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.ffci.b(r9)
            goto Lb3
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L33:
            axvh r2 = r0.d
            defpackage.ffci.b(r9)
            goto L4f
        L39:
            defpackage.ffci.b(r9)
            ffbr r9 = r8.n
            java.lang.Object r9 = r9.b()
            ayei r9 = (defpackage.ayei) r9
            r0.d = r8
            r0.c = r4
            java.lang.Object r9 = r9.b(r0)
            if (r9 == r1) goto Lb6
            r2 = r8
        L4f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L58
            goto Lb3
        L58:
            java.lang.Class<ayfb> r9 = defpackage.ayfb.class
            ejoe r9 = defpackage.ejoi.n(r9)
            poz r4 = defpackage.poz.UPDATE
            ejnx r5 = new ejnx
            java.lang.String r6 = "WorkProfileContactsPeriodicSync"
            r5.<init>(r6, r4)
            r9.g(r5)
            ffbr r4 = r2.m
            java.lang.Object r4 = r4.b()
            r4.getClass()
            java.lang.Number r4 = (java.lang.Number) r4
            long r4 = r4.longValue()
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.HOURS
            ejnw r7 = new ejnw
            r7.<init>(r4, r6)
            ejnv r4 = new ejnv
            emux r5 = defpackage.emux.a
            r4.<init>(r7, r5)
            r9.e(r4)
            ejoi r9 = r9.h()
            entd r4 = defpackage.axvh.a
            ensk r4 = r4.h()
            ensz r4 = (defpackage.ensz) r4
            java.lang.String r5 = "Enqueueing work profile contacts sync work."
            r4.q(r5)
            ffbr r2 = r2.e
            java.lang.Object r2 = r2.b()
            ejoc r2 = (defpackage.ejoc) r2
            com.google.common.util.concurrent.ListenableFuture r9 = r2.c(r9)
            r2 = 0
            r0.d = r2
            r0.c = r3
            java.lang.Object r9 = defpackage.fgfz.c(r9, r0)
            if (r9 != r1) goto Lb3
            goto Lb6
        Lb3:
            ffcu r9 = defpackage.ffcu.a
            return r9
        Lb6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axvh.e(ffgu):java.lang.Object");
    }

    @Override // defpackage.cnjv
    public final elfl fM(boolean z) {
        if (z) {
            axol.k(this.b, null, new axvd(this, null), 3);
        } else {
            ((ensz) a.h()).q("Default SMS app is not bugle.");
            axol.k(this.b, null, new axvc(this, null), 3);
        }
        elfl e = elfo.e(null);
        e.getClass();
        return e;
    }
}
