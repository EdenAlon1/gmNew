package defpackage;

import j$.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqih implements cqfs {
    public final ffbr a;
    public final cqoh b;
    public final ffhd c;
    public boolean d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;
    private final ffbr k;
    private final ffsk l;
    private final cqdf m;
    private final ffbr n;
    private final ffbr o;
    private final cskc p;
    private final enru q;
    private final fgcl r;
    private final List s;
    private final fgjb t;
    private final cqhq u;

    public cqih(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, cqoh cqohVar, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffhd ffhdVar, ffsk ffskVar, cqdf cqdfVar, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        cqohVar.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        ffbrVar8.getClass();
        ffhdVar.getClass();
        ffskVar.getClass();
        ffbrVar9.getClass();
        ffbrVar10.getClass();
        ffbrVar11.getClass();
        ffbrVar12.getClass();
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.a = ffbrVar4;
        this.b = cqohVar;
        this.h = ffbrVar5;
        this.i = ffbrVar6;
        this.j = ffbrVar7;
        this.k = ffbrVar8;
        this.c = ffhdVar;
        this.l = ffskVar;
        this.m = cqdfVar;
        this.n = ffbrVar9;
        this.o = ffbrVar12;
        this.p = cskc.g("Bugle", "MergingForwardSyncWorkOrganizer");
        this.q = enru.c("com/google/android/apps/messaging/shared/telephony/forwardsync/workorganizer/MergingForwardSyncWorkOrganizer");
        ekzz f = eleg.f("MergingForwardSyncWorkOrganizer::init");
        try {
            axol.k(ffskVar, null, new cqhe(this, null), 3);
            ffig.a(f, null);
            this.r = fgcu.d(0, 100, 2);
            this.s = new ArrayList();
            this.t = new fgjf();
            this.u = new cqhq(ffbrVar11, this);
        } finally {
        }
    }

    private final ffcf w(Collection collection) {
        Object b = this.e.b();
        b.getClass();
        cqgj cqgjVar = (cqgj) ffdx.R(collection, (Comparator) b);
        List am = ffdx.am(collection);
        fflf.f(am);
        am.remove(cqgjVar);
        return new ffcf(cqgjVar, am);
    }

    private final void x(String str, cqgj cqgjVar) {
        csjb c = this.p.c();
        c.I(str);
        cqij.c(c, cqgjVar, "syncId");
        c.A("syncParams", cqij.a(cqgjVar));
        c.r();
    }

    private final boolean y(cqgh cqghVar, cqgi cqgiVar) {
        cqgh cqghVar2 = cqgiVar.c;
        if (cqghVar2 == null) {
            cqghVar2 = cqgh.a;
        }
        if (!ffkj.e(cqghVar, cqghVar2)) {
            return false;
        }
        ((enrr) this.q.j().h("com/google/android/apps/messaging/shared/telephony/forwardsync/workorganizer/MergingForwardSyncWorkOrganizer", "noChangeAfterRetry", 602, "MergingForwardSyncWorkOrganizer.kt")).q("Detected the same out-of-sync messages after retrying sync");
        ((enrr) this.q.h().h("com/google/android/apps/messaging/shared/telephony/forwardsync/workorganizer/MergingForwardSyncWorkOrganizer", "noChangeAfterRetry", 605, "MergingForwardSyncWorkOrganizer.kt")).u("Telephony message count: [%d], Bugle message count: [%d]", cqghVar.b, cqghVar.c);
        return true;
    }

    private static final boolean z(cqfd cqfdVar) {
        return !ffdx.g(cqfe.a, cqfe.b).contains(cqfdVar.a) || cqfdVar.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0347, code lost:
    
        if (r2.a(r0, r5, r3) == r4) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x031f, code lost:
    
        if (r7.a(r2, r0, r3) != r4) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x02da, code lost:
    
        if (r7.p(r0, r2, r3) != r4) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x02bc, code lost:
    
        if (r2.a(r5, r6, r3) == r4) goto L104;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00c5  */
    @Override // defpackage.cqfs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.cqgj r17, defpackage.eqqh r18, defpackage.ffgu r19) {
        /*
            Method dump skipped, instructions count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqih.a(cqgj, eqqh, ffgu):java.lang.Object");
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x021a: MOVE (r14 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:539), block:B:307:0x021a */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x07d7 -> B:16:0x07e0). Please report as a decompilation issue!!! */
    @Override // defpackage.cqfs
    public final java.lang.Object b(defpackage.cqel r27, defpackage.ffgu r28) {
        /*
            Method dump skipped, instructions count: 2184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqih.b(cqel, ffgu):java.lang.Object");
    }

    @Override // defpackage.cqfs
    public final void c(Instant instant) {
        if (this.d) {
            this.p.p(a.i(instant, "New message inserted at timestamp [", "] while sync in progress"));
            this.s.add(instant);
        }
    }

    @Override // defpackage.cqfs
    public final boolean d() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cqhh
            if (r0 == 0) goto L13
            r0 = r5
            cqhh r0 = (defpackage.cqhh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cqhh r0 = new cqhh
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            cqhq r5 = r4.u
            cqha r2 = new cqha
            r2.<init>()
            r0.c = r3
            java.lang.Object r5 = r5.c(r2, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            cqgk r5 = (defpackage.cqgk) r5
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqih.e(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0176, code lost:
    
        if (r7.q(r1, r5, r3) != r4) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0132, code lost:
    
        if (defpackage.cqjg.e(r2) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0151, code lost:
    
        r8 = r9;
        r9 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x014f, code lost:
    
        if (defpackage.fgfz.c(r2, r3) == r4) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0100, code lost:
    
        if (defpackage.fgfz.c(r5, r3) != r4) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.cqfu r17, defpackage.cqfe r18, defpackage.ffgu r19) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqih.f(cqfu, cqfe, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x01e0, code lost:
    
        if (r15.f(r14, r0, r4) == r6) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x021e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x021f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0220 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.cqfu r22, defpackage.cqjb r23, defpackage.cqfd r24, java.util.UUID r25, defpackage.cqel r26, defpackage.ffgu r27) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqih.g(cqfu, cqjb, cqfd, java.util.UUID, cqel, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.cqfu r10, defpackage.cqel r11, j$.time.Instant r12, java.util.UUID r13, defpackage.ffgu r14) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqih.h(cqfu, cqel, j$.time.Instant, java.util.UUID, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        if (r5 != r1) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cqhs
            if (r0 == 0) goto L13
            r0 = r5
            cqhs r0 = (defpackage.cqhs) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cqhs r0 = new cqhs
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            cqhq r5 = r4.u
            r0.c = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 == r1) goto L51
        L3c:
            r0 = r5
            cqgk r0 = (defpackage.cqgk) r0
            int r0 = r0.b
            r0 = r0 & r3
            r1 = 0
            if (r3 == r0) goto L46
            r5 = r1
        L46:
            cqgk r5 = (defpackage.cqgk) r5
            if (r5 == 0) goto L51
            cqfu r5 = r5.d
            if (r5 != 0) goto L50
            cqfu r5 = defpackage.cqfu.a
        L50:
            return r5
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqih.i(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        if (r5 != r1) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cqht
            if (r0 == 0) goto L13
            r0 = r5
            cqht r0 = (defpackage.cqht) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cqht r0 = new cqht
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            cqhq r5 = r4.u
            r0.c = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 == r1) goto L52
        L3c:
            r0 = r5
            cqgk r0 = (defpackage.cqgk) r0
            int r0 = r0.b
            r0 = r0 & 2
            r1 = 0
            if (r0 != 0) goto L47
            r5 = r1
        L47:
            cqgk r5 = (defpackage.cqgk) r5
            if (r5 == 0) goto L52
            cqfz r5 = r5.e
            if (r5 != 0) goto L51
            cqfz r5 = defpackage.cqfz.a
        L51:
            return r5
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqih.j(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.cqfu r13, defpackage.ffgu r14) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqih.k(cqfu, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        if (r7 != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.ffgu r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.cqhv
            if (r0 == 0) goto L13
            r0 = r7
            cqhv r0 = (defpackage.cqhv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cqhv r0 = new cqhv
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.ffci.b(r7)
            return r7
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            cqih r2 = r0.d
            defpackage.ffci.b(r7)
            goto L5d
        L3b:
            cqih r2 = r0.d
            defpackage.ffci.b(r7)
            goto L4f
        L41:
            defpackage.ffci.b(r7)
            r0.d = r6
            r0.c = r5
            java.lang.Object r7 = r6.j(r0)
            if (r7 == r1) goto L70
            r2 = r6
        L4f:
            cqfz r7 = (defpackage.cqfz) r7
            if (r7 == 0) goto L63
            r0.d = r2
            r0.c = r4
            java.lang.Object r7 = r2.u(r7, r0)
            if (r7 == r1) goto L70
        L5d:
            cqfu r7 = (defpackage.cqfu) r7
            if (r7 != 0) goto L62
            goto L63
        L62:
            return r7
        L63:
            r7 = 0
            r0.d = r7
            r0.c = r3
            java.lang.Object r7 = r2.m(r0)
            if (r7 != r1) goto L6f
            goto L70
        L6f:
            return r7
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqih.l(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e2, code lost:
    
        if (defpackage.fgfz.c(r12, r0) != r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.ffgu r12) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqih.m(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cqhx
            if (r0 == 0) goto L13
            r0 = r5
            cqhx r0 = (defpackage.cqhx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cqhx r0 = new cqhx
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            cqhq r5 = r4.u
            r0.c = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            cqgk r5 = (defpackage.cqgk) r5
            eygr r5 = r5.c
            int r5 = r5.size()
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqih.n(ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.cqjj r11, defpackage.ffgu r12) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqih.o(cqjj, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.cqjk r11, java.util.UUID r12, defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqih.p(cqjk, java.util.UUID, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(defpackage.cqfe r22, defpackage.cqfu r23, defpackage.ffgu r24) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqih.q(cqfe, cqfu, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(defpackage.cqfu r8, java.util.UUID r9, boolean r10, defpackage.ffgu r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.cqib
            if (r0 == 0) goto L13
            r0 = r11
            cqib r0 = (defpackage.cqib) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cqib r0 = new cqib
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            cqct r8 = r0.e
            cqih r9 = r0.d
            defpackage.ffci.b(r11)
            goto La9
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            defpackage.ffci.b(r11)
            cqgj r11 = r8.c
            if (r11 != 0) goto L3d
            cqgj r11 = defpackage.cqgj.a
        L3d:
            r11.getClass()
            java.lang.String r2 = "Resumed sync"
            r7.x(r2, r11)
            ffbr r11 = r7.k
            java.lang.Object r11 = r11.b()
            cqcl r11 = (defpackage.cqcl) r11
            cqgj r2 = r8.c
            if (r2 != 0) goto L53
            cqgj r2 = defpackage.cqgj.a
        L53:
            eyee r2 = r2.e
            r2.getClass()
            java.util.UUID r2 = defpackage.cqjf.b(r2)
            eqqk r4 = defpackage.eqqk.a
            eyfq r4 = r4.createBuilder()
            eqqj r4 = (defpackage.eqqj) r4
            eyee r9 = defpackage.cpzf.a(r9)
            r4.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r5 = r4.instance
            eqqk r5 = (defpackage.eqqk) r5
            int r6 = r5.b
            r6 = r6 | r3
            r5.b = r6
            r5.c = r9
            r4.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r9 = r4.instance
            eqqk r9 = (defpackage.eqqk) r9
            int r5 = r9.b
            r5 = r5 | 2
            r9.b = r5
            r9.d = r10
            eyfy r9 = r4.build()
            eqqk r9 = (defpackage.eqqk) r9
            cqbt r10 = r11.d
            int r11 = defpackage.engw.d
            engw r11 = defpackage.enou.a
            r10.b(r2, r11, r9)
            cqct r9 = new cqct
            r9.<init>(r8)
            fgcl r8 = r7.r
            r0.d = r7
            r0.e = r9
            r0.c = r3
            java.lang.Object r8 = r8.fQ(r9, r0)
            if (r8 == r1) goto Lbb
            r8 = r9
            r9 = r7
        La9:
            cqdf r9 = r9.m
            r8.getClass()
            cqcu r10 = new cqcu
            cqfu r8 = r8.a
            r10.<init>(r8)
            r9.b(r10)
            ffcu r8 = defpackage.ffcu.a
            return r8
        Lbb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqih.r(cqfu, java.util.UUID, boolean, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(defpackage.cqfu r9, java.util.UUID r10, defpackage.ffgu r11) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqih.s(cqfu, java.util.UUID, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a0, code lost:
    
        if (r2.o(r8, r0) != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(defpackage.cqfu r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.cqid
            if (r0 == 0) goto L13
            r0 = r9
            cqid r0 = (defpackage.cqid) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            cqid r0 = new cqid
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L55
            if (r2 == r5) goto L47
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r8 = r0.a
            cqjj r8 = (defpackage.cqjj) r8
            defpackage.ffci.b(r9)
            goto La3
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.b
            cqjj r8 = (defpackage.cqjj) r8
            java.lang.Object r2 = r0.a
            cqih r2 = (defpackage.cqih) r2
            defpackage.ffci.b(r9)
            goto L96
        L47:
            cqfu r8 = r0.f
            java.lang.Object r2 = r0.b
            cqjl r2 = (defpackage.cqjl) r2
            java.lang.Object r5 = r0.a
            cqih r5 = (defpackage.cqih) r5
            defpackage.ffci.b(r9)
            goto L72
        L55:
            defpackage.ffci.b(r9)
            ffbr r9 = r7.f
            java.lang.Object r9 = r9.b()
            r2 = r9
            cqjl r2 = (defpackage.cqjl) r2
            cqhq r9 = r7.u
            r0.a = r7
            r0.b = r2
            r0.f = r8
            r0.e = r5
            java.lang.Object r9 = r9.b(r0)
            if (r9 == r1) goto La6
            r5 = r7
        L72:
            cqgk r9 = (defpackage.cqgk) r9
            eygr r9 = r9.c
            r9.getClass()
            cqjj r8 = r2.a(r8, r9)
            if (r8 != 0) goto L80
            return r6
        L80:
            cqhq r9 = r5.u
            cqgz r2 = new cqgz
            r2.<init>()
            r0.a = r5
            r0.b = r8
            r0.f = r6
            r0.e = r4
            java.lang.Object r9 = r9.c(r2, r0)
            if (r9 == r1) goto La6
            r2 = r5
        L96:
            r0.a = r8
            r0.b = r6
            r0.e = r3
            java.lang.Object r9 = r2.o(r8, r0)
            if (r9 != r1) goto La3
            goto La6
        La3:
            cqfu r8 = r8.b
            return r8
        La6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqih.t(cqfu, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(defpackage.cqfz r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cqif
            if (r0 == 0) goto L13
            r0 = r6
            cqif r0 = (defpackage.cqif) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cqif r0 = new cqif
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            cqfu r5 = r0.f
            cqfu r1 = r0.e
            cqih r0 = r0.d
            defpackage.ffci.b(r6)
            goto L55
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.ffci.b(r6)
            cqfu r5 = r5.c
            if (r5 != 0) goto L3e
            cqfu r5 = defpackage.cqfu.a
        L3e:
            cqhq r6 = r4.u
            cqhd r2 = new cqhd
            r2.<init>()
            r0.d = r4
            r0.e = r5
            r0.f = r5
            r0.c = r3
            java.lang.Object r6 = r6.c(r2, r0)
            if (r6 == r1) goto L6f
            r0 = r4
            r1 = r5
        L55:
            cskc r6 = r0.p
            csjb r6 = r6.c()
            java.lang.String r0 = "Restored interrupted sync to active"
            r6.I(r0)
            cqgj r5 = r5.c
            if (r5 != 0) goto L66
            cqgj r5 = defpackage.cqgj.a
        L66:
            r5.getClass()
            defpackage.cqij.d(r6, r5)
            r6.r()
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqih.u(cqfz, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(defpackage.cqfu r10, defpackage.cqfd r11, defpackage.cqel r12, defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqih.v(cqfu, cqfd, cqel, ffgu):java.lang.Object");
    }
}
